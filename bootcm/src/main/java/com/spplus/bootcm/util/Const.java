package com.spplus.bootcm.util;

import org.springframework.context.ApplicationContext;

public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_USER_RIGHTS = "sessionUserRights";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(bank)).*"; // 不对匹配该值的访问路径拦截（正则）
	public static ApplicationContext WEB_APP_CONTEXT = null; // 该值会在web容器启动时由WebAppContextListener初始化

	public static String SOCKET_CONTENTBEGIN = "hppay-socket-begin";
	public static String SOCKET_CONTENTEND = "hppay-socket-end";
	public static String STRING_NEWLINE = "\n";
	// 验证成功
	public static int VERIFY_SUCCESS = 0;
	// 验证失败
	public static int ERROR_VERIFY = 1;
	// 数据异常
	public static int ERROR_PAGE = 2;
	// 支付系统服务异常
	public static int ERROR_SERVER = 3;
	// 用户名密码错误
    public static int ERROR_USERNAMEPWD= 6;
	// 回购系统服务异常
	public static int ERROR_SERVER_CPLUS = 5;
	//避免重复，债权验证已支付
	public static int PAY_SUCCESS = 4;
	//报表每页显示数目
	public static int PAGE_SIZE = 12;
	
	/** 返回结果类型 : map */
	public static final String RESULT_MAP = "map";
	/** 返回结果类型 : listMap */
	public static final String RESULT_LIST_MAP = "listMap";
	/** 返回结果类型 : fileName */
	public static final String RESULT_FILE_NAME = "fileName";
	/** 返回结果类型 : pageMap */
	public static final String RESULT_PAGE_MAP = "pageMap";
	/** 返回结果类型 : bean */
	public static final String RESULT_BEAN = "bean";
	/** 返回结果类型 : listBean */
	public static final String RESULT_LIST_BEAN = "listBean";
	/** 返回结果类型 : pageBean */
	public static final String RESULT_PAGE_BEAN = "pageBean";

	// 添加成功
	public static final String ADD_SUCCESS = "\u6dfb\u52a0\u6210\u529f";
	// 添加失败
	public static final String ADD_FAILURE = "\u6dfb\u52a0\u5931\u8d25";
	public static final String SUBMIT = "\u63d0\u4ea4"; // 提交
	// 删除
	public static final String DELETE = "\u5220\u9664";
	// 删除成功
	public static final String DELETE_SUCCESS = "\u5220\u9664\u6210\u529f";
	// 删除失败
	public static final String DELETE_FAILURE = "\u5220\u9664\u5931\u8d25";
	// 修改
	public static final String MODIFY = "\u4fee\u6539";
	// 修改成功
	public static final String MODIFY_SUCCESS = "\u4fee\u6539\u6210\u529f";
	// 修改失败
	public static final String MODIFY_FAILURE = "\u4fee\u6539\u5931\u8d25";
	// 设置成功
	public static final String SETTING_SUCCESS = "\u8bbe\u7f6e\u6210\u529f";
	// 设置失败
	public static final String SETTING_FAILURE = "\u8bbe\u7f6e\u5931\u8d25";
	// 登录成功
	public static final String LOGIN_SUCCESS = "\u767b\u5f55\u6210\u529f";
	public static Object getApplicationContextBean(String name){
		return WEB_APP_CONTEXT.getBean(name);
	}
	public static final String requester_id_ris = "50";
	public static final String requester_id_ms = "52";
	public static String success_code="1000";
	public static String success="业务操作成功";
	public static String fail_code="2000";
	public static String fail = "业务操作失败";
	public static String requester_id = "52";					//系统编码 组建通信报文时使用
	public static String requester_name = "手机服务端";		//系统名称  组建通信报文时使用
	public static String version_id = "01";						//ESB系统版本
	public static String response_status = "COMPLETE";			//系统报文成功响应状态
	public static String response_code = "1000";				//系统报文成功响应代码
	public static String response_desc = "业务操作成功";			//系统报文成功响应描述
	public static boolean checkValidateCode = true;				//系统报文成功响应描述
	public static String add_success="添加成功";
	public static String add_fail="添加失败";
	public static String edit_success="修改成功";
	public static String edit_fail="修改失败";
	public static String del_success="删除成功";
	public static String del_fail="删除失败";
	public static String oper_success="操作成功";
	public static String oper_fail="操作失败";
	public static String pwd_fail="两次输入的密码不一致，请重新输入";
	public static String cancel_success="撤销成功";
	//ms code
	public static String ms_success_code="1000";
	public static String ms_errorCode_NoLogin="2000";//服务器发送错误
	public static String ms_errorMSG_NoLogin="用户空闲超时自动退出登录！";//服务器发送错误
	public static String ms_error_code="2001";//服务器发送错误
	public static String ms_failed_code="2002";//操作失败
	public static String mc_failed_code="2999";//客户端发生错误
	public static String ms_NoData_code="2099";//没有数据
	public static String ms_login_success="登录成功";
	public static String ms_loginOut_success="退出成功";
	public static String ms_login_sucessButNoBind="该账号已绑定其他手机IMEI";
	public static String ms_login_sucessButNoBind_code="1001";
	

	public static final String PACKETS_DATATYPE = "DATATYPE";
	public static final String DATATYPE_INTEGER = "INTEGER";
	public static final String DATATYPE_STRING = "STRING";
	public static final String DATATYPE_LIST = "LIST";
	public static final String DATATYPE_MAP = "MAP";
	public static final String DATATYPE_DOUBLE = "DOUBLE";
	public static final String DATATYPE_FLOAT = "FLOAT";
	public static final String DATATYPE_BOOLEAN = "BOOLEAN";
	
	/*
	 * bean 单个实体
	 * map 单个实体或复杂报文
	 * pageBean 分页集合到具体对象
	 * pageMap 分页集合到List<Map>
	 * listBean 集合无分页，泛型具体实体
	 * listMap 集合无分页，泛型Map数组
	 */
	public static String resultTypes = "bean,map,pageBean,pageMap,listBean,listMap,FileName";//返回集合
	
	public static final String USER_MAP_KEY = "UserMap";
	// 重复登录 BSS
	public static final String ALLOW_DUPLICATE_LOGIN_BSS = "AllowDuplicateLoginBSS";
	// 重复登录 IRS
	public static final String ALLOW_DUPLICATE_LOGIN_IRS = "AllowDuplicateLoginIRS";
	public static final String TCP_MAX_SIZE_ERROR="-1002";
	public static final String TCP_MAX_SIZE_ERROR_DESC="服务器忙，请稍候再试！";
	/**socket链接池属性*/
	public static final String SERVER_IP="SERVER_IP";
	public static final String SERVER_PORT="SERVER_PORT";
	public static final String MAX_SIZE="MAX_SIZE";
	public static final String MIN_SIZE="MIN_SIZE";
	public static final String TCP_ENDSTR="TCP_ENDSTR";
	public static final String TCP_CHARSET="TCP_CHARSET";
	

	/** ftl */
	public static final String SUFFIX_FTL = ".ftl";

	/** html */
	public static final String SUFFIX_HTML = ".html";

	/** 删除状态 : 删除 */
	public static final String DEL_FLAG_DEL = "0";
	/** 删除状态 : 未删除 */
	public static final String DEL_FLAG_NO = "1";
	/** 删除状态 bean key */
	public static final String DEL_FLAG_KEY = "deleteflag";

	/** ESB用户验证、时间段验证 **/
	public static final String ESB_ERROR = "201000";
	public static final String ESB_ERROR_DESC = "ESB接收报文出错";
	public static final String ESB_NO_SERVICE = "201003";
	public static final String ESB_NO_SERVICE_DESC = "服务编号不存在";
	public static final String ESB_CLASSNOTFOUND = "201002";
	public static final String ESB_CLASSNOTFOUND_DESC = "找不到消息转换类";
	public static final String ESB_NO_USER = "201012";
	public static final String ESB_NO_USER_DESC = "渠道用户不存在";
	public static final String ESB_USER_PASSWORD_ERROE = "201013";
	public static final String ESB_USER_PASSWORD_ERROE_DESC = "渠道用户密码验证失败";
	public static final String ESB_USER_NO_RIGHT = "201014";
	public static final String ESB_USER_NO_RIGHT_DESC = "渠道用户无权操作该服务";
	public static final String ESB_TIME_ERROR = "201015";
	public static final String ESB_TIME_ERROR_DESC = "该时段无权操作该服务";

	/** 空字符串 */
	public static final String BLANK_STRING = "";

	/** Model参数 : pageStr */
	public static final String MODEL_ATTRIBUTE_PAGE_STRING = "pageStr";

	/** Model参数 : currentPage */
	public static final String MODEL_ATTRIBUTE_CURRENT_PAGE = "currentPage";

	/** Model参数 : command */
	public static final String MODEL_ATTRIBUTE_COMMAND = "command";

	/** updateCount */
	public static final String UPDATE_COUNT = "updateCount";

	/** msgList */
	public static final String MSG_LIST_KEY = "msgList";

	/** 分号 */
	public static final String SEMICOLON = ";";
	/** 债权流转方式4-转让 */
	public static String TRANSFER_TYPE_TRANSFER = "4";
	/** 债权流转方式3-质押 */
	public static String TRANSFER_TYPE_PLEDGE = "3";
	/** 债权流转方式2-融贷 */
	public static String TRANSFER_TYPE_CREDIT = "2";
	/** 债权流转方式1抵付 */
	public static String TRANSFER_TYPE_SECUREDPAY = "1";
	/** 功能权限ID前缀 */
	public static  final String FUNC_AUTHORITY_PREFIX = "ROLE_FUNC_";
	/** 元素权限ID前缀 */
	public static final String ELEMENT_AUTHORITY_PERFIX = "ROLE_ELEMENT_";
	/** 授权方式ID前缀 */
	public static  final String AUTHTYPE_AUTHORITY_PREFIX = "ROLE_AUTHTYPE_";

	/** 用户所属机构类型-银行 */
	public static String USER_ORG_TYPE_PRE_LETTER = "300";
	/**数据存放文件路径分隔符*/
	public static String SEPARATOR="/";
	
	/**HPCE文件保存路径配置项*/
	public static String ATTACHMENT_FOLDER="ATTACHMENT_FOLDER";
	
	/**开户文件保存路径配置项*/
	public static String MEMBER_ACCOUNT_FOLDER="MEMBER_ACCOUNT_FOLDER";
	/**综合分析的ip端口*/
	public static String COMPLEX_ANALYSIS_FIXEDIP="COMPLEX_ANALYSIS_FIXEDIP";
	
	/***ESB部分***/
	public static final String ESB_VERSION_ID = "01";
	public static final String ESB_REQUESTER_ID = "03";
	public static final String ESB_RESPONSE_STATUS = "COMPLETE";// 系统报文成功响应状态
	public static final String ESB_RESPONSE_CODE = "1000"; // 系统报文成功响应代码
	public static final String ESB_RESPONSE_CODE_FAIL = "-1000";
	public static final String ESB_RESPONSE_DESC_FAIL = "业务操作失败";
	
	public static final String ESB_ERROR_201000="报文解析错误";
	public static final String ESB_ERROR_201000_DESC="201000";

	public static final String ESB_ERROR_201001="201001";
	public static final String ESB_ERROR_201001_DESC="服务链接错误";
	
	public static final String ESB_ERROR_201002="2011002";
	public static final String ESB_ERROR_201002_DESC="系统内部错误";
	

	public static final String ESB_ERROR_201003="2011003";
	public static final String ESB_ERROR_201003_DESC="报文内容前后不一致";
	
	// 进群
	public static final int	CMD_CLASTER_ENTER=13108;
	
	// 退群
	public static final int CMD_CLASTER_DISMISS=13109;
	
	// 好友邀请
	public static final int CMD_FRIEND_INVITED=13110;
	
	// 好友接收邀请
	public static final int CMD_FRIEND_ACCEPT=13111;
	
	// 解散群
	public static final int CMD_FRIEND_DIS	=13112;
	
	// 删除群成员
	public static final int CMD_FRIEND_DELMEMBER=13113;
	
	// 删除好友
	public static final int CMD_FRIEND_DELETE=13114;
	
	// 删除好友
	public static final int CMD_CUSTSENDMESSAGEBYFRIEND_ADD	=13115;
		
	// 删除好友
	public static final int CMD_CUSTSENDMESSAGEBYGROUP_ADD	=13116;
	
	// 广播消息
	public static final int	CMD_BROADCAST= 13117;
	
	//立即受让
	public static final int CMD_DM_BUYIN= 13118;	
	
	//付款
	public static final int CMD_DM_PAY= 13119;
	
	// 撤销出让订单
	public static final int	CMD_DM_CANCELSALE= 13120;
	
	// 撤销受让订单
	public static final int	CMD_DM_CANCELBUY= 13121;
	
	//转让订单超时
	public static final int	CMD_DM_SELECLOSE= 13122;
	
	//受让订单超时 
	public static final int	CMD_DM_BUYCLOSE= 13123;
	
	// 后台强制撤销出让订单
	public static final int	CMD_DM_BOSSCANCELSALE= 13124;

	//后台强制撤销产品的受让 通知的标题：受让订单强制失效
	public static final int	CMD_DM_BOSSCANCELBUY_BUY  = 13125;    
	
	//后台强制撤销产品的受让 通知的标题：债权重新发布
	public static final int	CMD_DM_BOSSCANCELBUY_SAEL = 13126;   
	
	//1.出让人提交时提醒受让人确认
	public static final int	CMD_DM_TRANS_SUBMIT = 13228;
	
	//2.超时关闭提醒出让人、出让人
	public static final int	CMD_DM_TRANS_EXPIRE = 13229;
	
	//3.受让人拒绝或同意确认时出让人
	public static final int	CMD_DM_TRANS_REJECT= 13230;
	
	//4.债权转让成功提醒出让人、受让人、债务人
	public static final int	CMD_DM_TRANS_SUCC=13231;
	
	//1.后台审核成功提醒申报人
	public static final int	CMD_DM_OFFSET_REVIEW_SUCC=13232;
	
	//2.后台审核成功提醒对方客户确认
	public static final int	CMD_DM_OFFSET_NOITIFY=13233;
	
	//3.后台审核失败提醒申报人
	public static final int	CMD_DM_OFFSET_FAIL=13234;
	
	//4.提醒各当事人（债权债务人）确认抵销
	public static final int	CMD_DM_OFFSET_CONFIRM=13235;
	
	//5.抵销成功通知各当事人（债权债务人）
	public static final int	CMD_DM_OFFSET_SUCC=13236;
		
	// 同意群邀请
	public static final int CMD_CLASTER_ACCEPT=13127;
	
	public static final int COMMAND_CSS_OFFLINE=13039;
	
	// 临时会话消息
	public static final int COMMAND_CSS_SENDTEMPMESSAGE	=13939;
	
	// 同步发消息
	public static final String SYNC="SYNC";
	// 异步发消息
	public static final String ASYNC="ASYNC";
	
	// 资金账户类型 结算账户
	public static final String ACC_JS="2";
	
	// 资金账户类型 代扣账户
	public static final String ACC_DK="4";
	
	// 客户属性,个人
	public static final String CUST_MAN="0";
	
	// 客户属性,机构
	public static final String CUST_ORG="1";

	// 客户端渠道定义
	public static final String CLIENT_PC 		= "PC";
	public static final String CLIENT_ANDROID 	= "ANDROID";
	public static final String CLIENT_IPHONE 	= "IPHONE";
	public static final String CLIENT_IPAD 		= "IPAD";
	public static final String CLIENT_WEB 		= "WEB";
}
