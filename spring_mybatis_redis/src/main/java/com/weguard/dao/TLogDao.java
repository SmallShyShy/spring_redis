package com.weguard.dao;


import java.util.HashMap;
import java.util.Map;

/**
 * (TLog)表数据库访问层
 *
 * @author makejava
 * @since 2018-08-15 17:12:44
 */
public class TLogDao {
    public static void main(String[] args) {
        Map m= new HashMap<String,String>(15);
        String key="xiaoming";
        System.out.println(key.hashCode());
        System.out.println(key.hashCode()&15);
    }


}