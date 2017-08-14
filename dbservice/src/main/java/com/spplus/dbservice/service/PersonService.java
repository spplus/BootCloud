package com.spplus.dbservice.service;

import com.github.pagehelper.Page;
import com.spplus.bootcm.bean.Person;

import java.util.List;

/**
 * Created by yuhao.wang on 2017/6/19.
 */
public interface PersonService {

    List<Person> findAll();
    
    List<Person> findAll2();
    

    /**
     * 分页查询
     * @param pageNo 页号
     * @param pageSize 每页显示记录数
     * @return
     */
    Page<Person> findByPage(int pageNo, int pageSize);

    void insert(Person person);
}
