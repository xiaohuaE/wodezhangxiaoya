package com.zihao.mybatisdemo.model;

import java.util.Date;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;


@ToString
public class TSysUser<Data> {

    private int userid;
    private String username;
    private String password;
    private String salt;
    private Data createdate;


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Data getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Data createdate) {
        this.createdate = createdate;
    }
}
