/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

/**
 *
 * @author OTHMAN AHMAD
 */
public abstract class  DBUserInfo {
    private String uid;
    private String pwd;
    private String table;

    public DBUserInfo() {
    }

    public DBUserInfo(String uid, String pwd, String table) {
        this.uid = uid;
        this.pwd = pwd;
        this.table = table;
    }
    
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

}
