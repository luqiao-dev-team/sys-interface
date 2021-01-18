package com.luqiao.interf.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 * 收支项目信息
 * @author guotao
 * @since 2021-01-15
 */
@TableName("YY_INOUTBC")
public class Inoutbc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("INOUTBC_ID")
    private String inoutbcId;
    /**
     * 收支编码
     */
    @TableField("INOUTBC_CODE")
    private String code;
    /**
     * 收支项目
     */
    @TableField("INOUTBC_NAME")
    private String name;
    /**
     * 上级收支项目
     */
    @TableField("INOUTBC_PK_PARENT")
    private String pk_parent;
    /**
     * 主键
     */
    @TableField("INOUTBC_PK_INOUTBC")
    private String pk_inoutbusiclass;
    /**
     * 时间戳
     */
    @TableField("INOUTBC_TS")
    private String ts;

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

    public String getPk_parent() {
        return pk_parent;
    }

    public void setPk_parent(String pk_parent) {
        this.pk_parent = pk_parent;
    }

    public String getPk_inoutbusiclass() {
        return pk_inoutbusiclass;
    }

    public void setPk_inoutbusiclass(String pk_inoutbusiclass) {
        this.pk_inoutbusiclass = pk_inoutbusiclass;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getInoutbcId() {
        return inoutbcId;
    }

    public void setInoutbcId(String inoutbcId) {
        this.inoutbcId = inoutbcId;
    }


}
