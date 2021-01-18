package com.luqiao.interf.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 * 部门信息
 * @author guotao
 * @since 2021-01-14
 */
@TableName("YY_DEPT")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("DEPT_ID")
    private String deptId;
    /**
     * 部门编码
     */
    @TableField("DEPT_CODE")
    private String code;
    /**
     * 部门名称
     */
    @TableField("DEPT_NAME")
    private String name;
    /**
     * 所属业务单元编码
     */
    @TableField("DEPT_ORGCODE")
    private String orgcode;
    /**
     * 上级部门编码
     */
    @TableField("DEPT_PK_FATHERORG")
    private String pk_fatherorg;
    /**
     * 时间戳
     */
    @TableField("DEPT_TS")
    private String ts;
    /**
     * 主键
     */
    @TableField("DEPT_PK_DEPT")
    private String pk_dept;
    /**
     * 所属业务单元主键
     */
    @TableField("DEPT_PK_ORG")
    private String pk_org;


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
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

    public String getPk_dept() {
        return pk_dept;
    }

    public void setPk_dept(String pk_dept) {
        this.pk_dept = pk_dept;
    }

    public String getPk_org() {
        return pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }
}
