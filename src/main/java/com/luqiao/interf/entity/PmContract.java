package com.luqiao.interf.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author guotao
 * @since 2021-01-19
 */
@TableName("V_PM_CONTRACT")
public class PmContract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("PM_ID")
    private String pmId;
    @TableField("CTNAME")
    private String ctname;
    @TableField("VBILLCODE")
    private String vbillcode;
    @TableField("CUSTOMER")
    private String customer;
    @TableField("NTAXRATE")
    private Double ntaxrate;
    @TableField("JSFS")
    private String jsfs;
    @TableField("DBILLDATE")
    private Date dbilldate;
    @TableField("INITIALMNY")
    private Double initialmny;
    @TableField("NTOTALTAXMNY")
    private Double ntotaltaxmny;
    @TableField("NORIGMNY")
    private Double norigmny;
    @TableField("TS")
    private Date ts;
    @TableField("PK_ORG")
    private String pkOrg;
    @TableField("CTRANTYPEID")
    private String ctrantypeid;
    @TableField("QCYSMNY")
    private Double qcysmny;
    @TableField("QCJSMNY")
    private Double qcjsmny;
    @TableField("QCSKMNY")
    private Double qcskmny;
    @TableField("PROJECT")
    private String project;
    @TableField("YJSMNY")
    private String yjsmny;
    @TableField("PLANMONEY")
    private Double planmoney;
    @TableField("PK_PSNDOC")
    private String pkPsndoc;
    @TableField("HTDJ_SZFX")
    private String htdjSzfx;


    public String getPmId() {
        return pmId;
    }

    public void setPmId(String pmId) {
        this.pmId = pmId;
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname;
    }

    public String getVbillcode() {
        return vbillcode;
    }

    public void setVbillcode(String vbillcode) {
        this.vbillcode = vbillcode;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Double getNtaxrate() {
        return ntaxrate;
    }

    public void setNtaxrate(Double ntaxrate) {
        this.ntaxrate = ntaxrate;
    }

    public String getJsfs() {
        return jsfs;
    }

    public void setJsfs(String jsfs) {
        this.jsfs = jsfs;
    }

    public Date getDbilldate() {
        return dbilldate;
    }

    public void setDbilldate(Date dbilldate) {
        this.dbilldate = dbilldate;
    }

    public Double getInitialmny() {
        return initialmny;
    }

    public void setInitialmny(Double initialmny) {
        this.initialmny = initialmny;
    }

    public Double getNtotaltaxmny() {
        return ntotaltaxmny;
    }

    public void setNtotaltaxmny(Double ntotaltaxmny) {
        this.ntotaltaxmny = ntotaltaxmny;
    }

    public Double getNorigmny() {
        return norigmny;
    }

    public void setNorigmny(Double norigmny) {
        this.norigmny = norigmny;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    public String getCtrantypeid() {
        return ctrantypeid;
    }

    public void setCtrantypeid(String ctrantypeid) {
        this.ctrantypeid = ctrantypeid;
    }

    public Double getQcysmny() {
        return qcysmny;
    }

    public void setQcysmny(Double qcysmny) {
        this.qcysmny = qcysmny;
    }

    public Double getQcjsmny() {
        return qcjsmny;
    }

    public void setQcjsmny(Double qcjsmny) {
        this.qcjsmny = qcjsmny;
    }

    public Double getQcskmny() {
        return qcskmny;
    }

    public void setQcskmny(Double qcskmny) {
        this.qcskmny = qcskmny;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getYjsmny() {
        return yjsmny;
    }

    public void setYjsmny(String yjsmny) {
        this.yjsmny = yjsmny;
    }

    public Double getPlanmoney() {
        return planmoney;
    }

    public void setPlanmoney(Double planmoney) {
        this.planmoney = planmoney;
    }

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getHtdjSzfx() {
        return htdjSzfx;
    }

    public void setHtdjSzfx(String htdjSzfx) {
        this.htdjSzfx = htdjSzfx;
    }

    @Override
    public String toString() {
        return "PmContract{" +
        ", pmId=" + pmId +
        ", ctname=" + ctname +
        ", vbillcode=" + vbillcode +
        ", customer=" + customer +
        ", ntaxrate=" + ntaxrate +
        ", jsfs=" + jsfs +
        ", dbilldate=" + dbilldate +
        ", initialmny=" + initialmny +
        ", ntotaltaxmny=" + ntotaltaxmny +
        ", norigmny=" + norigmny +
        ", ts=" + ts +
        ", pkOrg=" + pkOrg +
        ", ctrantypeid=" + ctrantypeid +
        ", qcysmny=" + qcysmny +
        ", qcjsmny=" + qcjsmny +
        ", qcskmny=" + qcskmny +
        ", project=" + project +
        ", yjsmny=" + yjsmny +
        ", planmoney=" + planmoney +
        ", pkPsndoc=" + pkPsndoc +
        ", htdjSzfx=" + htdjSzfx +
        "}";
    }
}
