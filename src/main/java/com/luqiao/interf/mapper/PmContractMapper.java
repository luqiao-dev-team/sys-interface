package com.luqiao.interf.mapper;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.luqiao.interf.entity.PmContract;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guotao
 * @since 2021-01-19
 */
@Mapper
public interface PmContractMapper extends BaseMapper<PmContract> {

    @Override
    List<PmContract> selectList(Wrapper<PmContract> wrapper);

    List<HashMap<String,String>> getContractListByCondition(HashMap<String,String> whereSql);
}
