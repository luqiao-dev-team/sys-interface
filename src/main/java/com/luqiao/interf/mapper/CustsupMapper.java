package com.luqiao.interf.mapper;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.luqiao.interf.entity.Custsup;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhouguoan
 * @since 2021-01-12
 */
@Mapper
public interface CustsupMapper extends BaseMapper<Custsup> {

    List<Custsup> getCustsupList();

    @Override
    Integer insert(Custsup custsup);

    @Override
    Integer updateById(Custsup custsup);

    @Override
    Integer selectCount(Wrapper<Custsup> wrapper);

    @Override
    Integer deleteById(Serializable serializable);
}
