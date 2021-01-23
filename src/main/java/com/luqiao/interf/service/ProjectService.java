package com.luqiao.interf.service;

import com.luqiao.interf.entity.Project;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guotao
 * @since 2021-01-15
 */
public interface ProjectService extends IService<Project> {
    String queryProjectInfo();
}
