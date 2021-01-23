package com.luqiao.interf.service;

import com.luqiao.interf.entity.Dept;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guotao
 * @since 2021-01-14
 */
public interface DeptService extends IService<Dept> {
    String querydeptInfo();
}
