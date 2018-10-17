package com.weguard.entity;

import java.util.Date;

/**
 * (TLog)表实体类
 *
 * @author makejava
 * @since 2018-08-15 17:12:42
 */
public class TLog {
    
    private Integer id;
    
    private String operator;
    
    private String content;
    
    private Date time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}