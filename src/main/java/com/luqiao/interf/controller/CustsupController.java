package com.luqiao.interf.controller;


import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.mapper.CustsupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhouguoan
 * @since 2021-01-12
 */
@RestController
@RequestMapping("/custsup")
public class CustsupController {

    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(CustsupController.class);

    @Autowired
    private CustsupMapper custsupMapper;

    @ApiOperation(value="用户测试接口",notes="查询接口样例")
    @GetMapping("getCustsupList")
    public List<Custsup> getCustsupList(){
        logger.info("查询用户信息，开始");
        List<Custsup> custsupList = new ArrayList<Custsup>();
        custsupList = custsupMapper.getCustsupList();
        logger.info("调用接口成功,获取用户数：",custsupList.size());
        return custsupList;
    }

}

