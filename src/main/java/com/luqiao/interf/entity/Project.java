package com.luqiao.interf.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 * 核算项目信息
 * @author guotao
 * @since 2021-01-15
 */
@TableName("YY_PROJECT")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("PROJECT_ID")
    private String projectId;
    /**
     * 核算项目编码
     */
    @TableField("PROJECT_CODE")
    private String code;
    /**
     * 核算项目名称
     */
    @TableField("PROJECT_NAME")
    private String name;
    /**
     * 所属单位主键
     */
    @TableField("PROJECT_PK_ORG")
    private String pk_org;
    /**
     * 所属单位编码
     */
    @TableField("PROJECT_ORGCODE")
    private String orgcode;
    /**
     * 主键
     */
    @TableField("PROJECT_PK_PROJECT")
    private String pk_project;
    /**
     * 时间戳
     */
    @TableField("PROJECT_TS")
    private String ts;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getPk_project() {
        return pk_project;
    }

    public void setPk_project(String pk_project) {
        this.pk_project = pk_project;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
