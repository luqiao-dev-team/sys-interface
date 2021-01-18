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
 * 客商信息
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
    private String code;
    /**
     * 用户名称
     */
    @TableField("CUSTSUP_NAME")
    private String name;
    /**
     * 主键
     */
    @TableField("CUSTSUP_PK_CUST_SUP")
    private String pk_cust_sup;
    /**
     * 客商类别
     */
    @TableField("CUSTSUP_CUSTSUPTYPE")
    private Long custsuptype;
    /**
     * 时间戳
     */
    @TableField("CUSTSUP_TS")
    private String ts;


    public String getCustsupId() {
        return custsupId;
    }

    public void setCustsupId(String custsupId) {
        this.custsupId = custsupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPk_cust_sup() {
        return pk_cust_sup;
    }

    public void setPk_cust_sup(String pk_cust_sup) {
        this.pk_cust_sup = pk_cust_sup;
    }

    public Long getCustsuptype() {
        return custsuptype;
    }

    public void setCustsuptype(Long custsuptype) {
        this.custsuptype = custsuptype;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
