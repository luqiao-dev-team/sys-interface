package com.luqiao.interf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * 业务单元(公司)信息
 * @author guotao
 * @since 2021-01-13
 */
@Data
@TableName("YY_ORG")
public class Org implements Serializable {

    private static final long serialVersionUID = -4844920670671136805L;

    /**
     * ID
     */
    @TableId("ORG_ID")
    private String orgId;
    /**
     * 用户编码
     */
    @TableField("ORG_CODE")
    private String code;
    /**
     * 用户名称
     */
    @TableField("ORG_NAME")
    private String name;
    /**
     * 主键
     */
    @TableField("ORG_PK_ORG")
    private String pk_org;
    /**
     * 上级单位编码
     */
    @TableField("ORG_PK_FATHERORG")
    private String pk_fatherorg;
    /**
     * 时间戳
     */
    @TableField("CUSTSUP_TS")
    private String ts;




    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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

    public String getPk_org() {
        return pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getPk_fatherorg() {
        return pk_fatherorg;
    }

    public void setPk_fatherorg(String pk_fatherorg) {
        this.pk_fatherorg = pk_fatherorg;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }


}
