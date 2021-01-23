package com.luqiao.interf.entity;

/**
 * 基础数据请求参数
 */
public class RequestInfo {

    private String key;
    private String exoSystem;
    private String billtype;
    private String billname;
    private String newts;
    private DataInfo data;

    public String getNewts() {
        return newts;
    }

    public void setNewts(String newts) {
        this.newts = newts;
    }


    public DataInfo getData() {
        return data;
    }

    public void setData(DataInfo data) {
        this.data = data;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getExoSystem() {
        return exoSystem;
    }

    public void setExoSystem(String exoSystem) {
        this.exoSystem = exoSystem;
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getBillname() {
        return billname;
    }

    public void setBillname(String billname) {
        this.billname = billname;
    }
}
