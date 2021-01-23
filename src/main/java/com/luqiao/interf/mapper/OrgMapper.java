package com.luqiao.interf.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.entity.Org;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guotao
 * @since 2021-01-12
 */

public interface OrgMapper extends BaseMapper<Org> {

    List<Org> getOrgList();

    List<Org> queryById(@Param("orgPkOrg") String pk_org);

    Integer insert(Org org);

    Integer mergeinfo(Org org);
}
