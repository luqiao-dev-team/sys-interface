package com.luqiao.interf.service;

import com.luqiao.interf.entity.Psndoc;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guotao
 * @since 2021-01-15
 */
public interface PsndocService extends IService<Psndoc> {
    String queryPsndocInfo();
}
