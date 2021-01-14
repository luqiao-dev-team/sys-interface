package com.luqiao.interf.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhouguoan
 * @since 2021-01-12
 */
@Data
@TableName("YY_CUSTSUP")
public class Custsup implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("CUSTSUP_ID")
    private String custsupId;
    /**
     * 用户编码
     */
    @TableField("CUSTSUP_CODE")
    private String custsupCode;
    /**
     * 用户名称
     */
    @TableField("CUSTSUP_NAME")
    private String custsupName;
    /**
     * 主键
     */
    @TableField("CUSTSUP_PK_CUST_SUP")
    private String custsupPkCustSup;
    /**
     * 客商类别
     */
    @TableField("CUSTSUP_CUSTSUPTYPE")
    private Long custsupCustsuptype;
    /**
     * 时间戳
     */
    @TableField("CUSTSUP_TS")
    private String custsupTs;


    public String getCustsupId() {
        return custsupId;
    }

    public void setCustsupId(String custsupId) {
        this.custsupId = custsupId;
    }

    public String getCustsupCode() {
        return custsupCode;
    }

    public void setCustsupCode(String custsupCode) {
        this.custsupCode = custsupCode;
    }

    public String getCustsupName() {
        return custsupName;
    }

    public void setCustsupName(String custsupName) {
        this.custsupName = custsupName;
    }

    public String getCustsupPkCustSup() {
        return custsupPkCustSup;
    }

    public void setCustsupPkCustSup(String custsupPkCustSup) {
        this.custsupPkCustSup = custsupPkCustSup;
    }

    public Long getCustsupCustsuptype() {
        return custsupCustsuptype;
    }

    public void setCustsupCustsuptype(Long custsupCustsuptype) {
        this.custsupCustsuptype = custsupCustsuptype;
    }

    public String getCustsupTs() {
        return custsupTs;
    }

    public void setCustsupTs(String custsupTs) {
        this.custsupTs = custsupTs;
    }

    @Override
    public String toString() {
        return "Custsup{" +
        ", custsupId=" + custsupId +
        ", custsupCode=" + custsupCode +
        ", custsupName=" + custsupName +
        ", custsupPkCustSup=" + custsupPkCustSup +
        ", custsupCustsuptype=" + custsupCustsuptype +
        ", custsupTs=" + custsupTs +
        "}";
    }
}
