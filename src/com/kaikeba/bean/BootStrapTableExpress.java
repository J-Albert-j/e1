package com.kaikeba.bean;

import java.sql.Timestamp;
//全参+无参+gs
public class BootStrapTableExpress {
    private int id;
    private String number;
    private String username;
    private String userPhone;
    private String company;
    private String code;
    private String inTime;
    private String outTime;
    private String status;
    private String sysPhone;

    public BootStrapTableExpress() {
    }

    public BootStrapTableExpress(int id, String number, String username, String userPhone, String company, String code, String inTime, String outTime, String status, String sysPhone) {
        this.id = id;
        this.number = number;
        this.username = username;
        this.userPhone = userPhone;
        this.company = company;
        this.code = code;
        this.inTime = inTime;
        this.outTime = outTime;
        this.status = status;
        this.sysPhone = sysPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSysPhone() {
        return sysPhone;
    }

    public void setSysPhone(String sysPhone) {
        this.sysPhone = sysPhone;
    }
}
