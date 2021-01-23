package com.luqiao.interf.mapper;

import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.entity.Psndoc;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guotao
 * @since 2021-01-15
 */
public interface PsndocMapper extends BaseMapper<Psndoc> {

    Integer mergeinfo(Psndoc org);
}
