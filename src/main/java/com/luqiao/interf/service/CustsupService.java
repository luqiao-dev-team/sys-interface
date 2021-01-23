package com.luqiao.interf.service;

import com.luqiao.interf.entity.Custsup;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhouguoan
 * @since 2021-01-12
 */
public interface CustsupService extends IService<Custsup> {
    String queryCustsupInfo();

    String updteCustsup(Map<String,String> map);

    String updtefbshCustsup(Map<String,String> map);
}
