package com.njhzlh.commons.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class AddressUtils {
    private static String key = "b57a5b106702e4fcb72853fc1575c773";
    public static String[] getAddress(String address){
        String[] ad = new String[3] ;
        String Url = "https://restapi.amap.com/v3/geocode/geo?key="+key+"&address="+address;
        String jsonstr = HttpClientUtil.httpGetWithJSON(Url,null);
        JSONObject b = JSON.parseObject(jsonstr);
        if(b !=null){
            JSONArray arr = b.getJSONArray("geocodes");
            if(arr !=null && arr.size()>0){
                JSONObject bj = arr.getJSONObject(0);
                ad[0] = bj.getString("province");
                ad[1] = bj.getString("city");
                ad[2] = bj.getString("district");
            }
        }
        return ad;
    }

    public static void main(String[] args) {
        System.out.println(getAddress("江苏省南京市南京工业大学"));
    }
}
