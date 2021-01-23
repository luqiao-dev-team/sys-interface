package com.luqiao.interf.service;

import com.baomidou.mybatisplus.service.IService;
import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.entity.Org;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guotao
 * @since 2021-01-13
 */
public interface OrgService extends IService<Org> {

    String queryOrgInfo();
}
