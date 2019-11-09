package com.njhzlh.main.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class TestServiceImpl {
    @Autowired
    testDao testDao;
    public String upd(){
        testDao.upd();
        int a = 5/0;
        System.out.println(a);
        return "1";
    }
}
