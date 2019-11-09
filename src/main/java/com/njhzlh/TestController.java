package com.njhzlh;

import com.njhzlh.main.test.TestServiceImpl;
import com.njhzlh.slave.TestSlaveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestServiceImpl testService;
    @Autowired
    TestSlaveDao testSlaveDao;
    @RequestMapping("/test")
    public String toIndex(){
        String ss =  "";
        ss+="\n"+testSlaveDao.getUser().toString();
        testService.upd();
        return ss ;
    }
}
