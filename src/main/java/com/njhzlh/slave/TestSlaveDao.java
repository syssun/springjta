package com.njhzlh.slave;


import com.njhzlh.commons.common.MyBatisDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@MyBatisDao
public interface TestSlaveDao {
    public List<Map<String,Object>> getUser();
}
