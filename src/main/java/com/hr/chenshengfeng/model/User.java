package com.hr.chenshengfeng.model;

public class User {
    private Integer uid;
    private String username;
    private String password;
    private String nickname;
    private Integer dapartment;
    private Integer duty;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getDapartment() {
        return dapartment;
    }

    public void setDapartment(Integer dapartment) {
        this.dapartment = dapartment;
    }

    public Integer getDuty() {
        return duty;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

}
