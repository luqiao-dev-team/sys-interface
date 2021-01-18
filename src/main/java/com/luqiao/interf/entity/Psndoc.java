package com.luqiao.interf.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 * 人员信息
 * @author guotao
 * @since 2021-01-15
 */
@TableName("YY_PSNDOC")
public class Psndoc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("PSNDOC_ID")
    private String psndocId;
    /**
     * 人员编码
     */
    @TableField("PSNDOC_CODE")
    private String code;
    /**
     * 人员名称
     */
    @TableField("PSNDOC_NAME")
    private String name;
    /**
     * 主键
     */
    @TableField("PSNDOC_PK_PSNDOC")
    private String pk_psndoc;
    /**
     * 身份账号
     */
    @TableField("PSNDOC_IDCARD")
    private String idcard;
    /**
     * 时间戳
     */
    @TableField("PSNDOC_TS")
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

    public String getPk_psndoc() {
        return pk_psndoc;
    }

    public void setPk_psndoc(String pk_psndoc) {
        this.pk_psndoc = pk_psndoc;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }


    public String getPsndocId() {
        return psndocId;
    }

    public void setPsndocId(String psndocId) {
        this.psndocId = psndocId;
    }


}
