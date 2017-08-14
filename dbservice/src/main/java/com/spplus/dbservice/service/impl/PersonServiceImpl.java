package com.spplus.dbservice.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.spplus.dbservice.dynamicds.DS;
import com.spplus.dbservice.mapper.PersonMapper;
import com.spplus.bootcm.bean.Person;

import com.spplus.dbservice.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yuhao.wang on 2017/6/19.
 */
@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @DS("db1")
    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @DS("db2")
    @Override
    public List<Person> findAll2() {
        return personMapper.findAll();
    }
    
    @Override
    public Page<Person> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return personMapper.findByPage();
    }

    @Override
    @Transactional
    public void insert(Person person) {
        personMapper.insert(person);
    }


}
