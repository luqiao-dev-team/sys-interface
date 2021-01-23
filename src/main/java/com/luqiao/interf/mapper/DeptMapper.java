package com.luqiao.interf.mapper;

import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.entity.Dept;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guotao
 * @since 2021-01-14
 */
public interface DeptMapper extends BaseMapper<Dept> {

    Integer insert(Dept org);

    Integer mergeinfo(Dept dept);
}
