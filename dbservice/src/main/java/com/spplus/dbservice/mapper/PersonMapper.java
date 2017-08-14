package com.spplus.dbservice.mapper;

import com.github.pagehelper.Page;
import com.spplus.bootcm.bean.Person;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//声明成mybatis Dao层的Bean，也可以在配置类上使用@MapperScan("com.xiaolyuh.domain.mapper")注解声明
public interface PersonMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    /**
     * 获取所有数据
     * @return
     */
    List<Person> findAll();

    /**
     * 分页查询数据
     * @return
     */
    Page<Person> findByPage();
}