package com.spplus.mq;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.spplus.bean.MqConfigBean;
import com.spplus.util.SpLogger;
import com.spplus.util.cnst.SFTopic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 广播模式的消息订阅和处理类.
 *
 */

public class BusConsumer {

    
    static DefaultMQPushConsumer consumer = null;

    /**
     * 得到DefaultMQPushConsumer对象，如果为空进行初始化.
     */
    public static DefaultMQPushConsumer getConsumer(MqConfigBean mqconfig) throws MQClientException {
        if (consumer == null) {
            
            // 一个应用创建一个Consumer，由应用来维护此对象，可以设置为全局对象或者单例
            // 注意：ConsumerGroupName需要由应用来保证唯一
            consumer = new DefaultMQPushConsumer(mqconfig.getConsumergroupnameCust());
            consumer.setConsumeThreadMin(mqconfig.getConsumethreadmin());
            consumer.setConsumeThreadMax(mqconfig.getConsumethreadmax());
            consumer.setConsumeMessageBatchMaxSize(mqconfig.getConsumemessagebatchmaxsize());
            consumer.setPullBatchSize(mqconfig.getPullbatchsize());
            consumer.setNamesrvAddr(mqconfig.getNameserver());
        }
        return consumer;
    }

    /**
     * 订阅方法，使用方式给用户感觉是消息从RocketMQ服务器推到了应用客户端.
     */
    public static void subscribe(MqConfigBean mqconfig) throws MQClientException {

        consumer = getConsumer(mqconfig);
        consumer.subscribe(SFTopic.TOPIC_AUDIO, "*");
        consumer.subscribe("CustNotification", "*");
        //广播
        consumer.setMessageModel(MessageModel.BROADCASTING);
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
        consumer.registerMessageListener(new MqMessageListener(consumer));


        // Consumer对象在使用之前必须要调用start初始化，初始化一次即可
        consumer.start();
        SpLogger.info("SF_SERVER 订阅服务已启动");
    }
}
