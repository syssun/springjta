package com.njhzlh.main.test;


import com.njhzlh.commons.common.MyBatisDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@MyBatisDao
public interface testDao {
    List<Map<String,Object>> getUser();
    int upd();
}
