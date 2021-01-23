package com.luqiao.interf.entity;

import org.springframework.http.StreamingHttpOutputMessage;

public class DataInfo {
    private String pk_org;
    private String voperatorid;
    private String dmakedate;
    private BodyInfo body;

    public String getPk_org() {
        return pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getVoperatorid() {
        return voperatorid;
    }

    public void setVoperatorid(String voperatorid) {
        this.voperatorid = voperatorid;
    }

    public String getDmakedate() {
        return dmakedate;
    }

    public void setDmakedate(String dmakedate) {
        this.dmakedate = dmakedate;
    }

    public BodyInfo getBody() {
        return body;
    }

    public void setBody(BodyInfo body) {
        this.body = body;
    }

}
