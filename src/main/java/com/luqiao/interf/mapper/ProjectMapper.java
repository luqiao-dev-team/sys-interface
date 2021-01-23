package com.luqiao.interf.mapper;

import com.luqiao.interf.entity.Inoutbc;
import com.luqiao.interf.entity.Project;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guotao
 * @since 2021-01-15
 */
public interface ProjectMapper extends BaseMapper<Project> {
    Integer mergeinfo(Project project);
}
