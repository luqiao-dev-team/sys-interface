package com.luqiao.interf.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.entity.Org;
import com.luqiao.interf.entity.RequestInfo;
import com.luqiao.interf.mapper.CustsupMapper;
import com.luqiao.interf.mapper.OrgMapper;
import com.luqiao.interf.service.CustsupService;
import com.luqiao.interf.service.OrgService;
import com.luqiao.interf.util.ConstantURL;
import com.luqiao.interf.util.MD5Util;
import com.luqiao.interf.util.MyHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guotao
 * @since 2021-01-13
 */
@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, Org> implements OrgService {

    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(OrgServiceImpl.class);


    @Override
    public String queryOrgInfo() {
//        String url = "http://10.166.130.13:9088/service/org/query";

        RequestInfo requestInfo = new RequestInfo();
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String date2 = simpleDateFormat.format(date);
        //时间戳
        String newts = simpleDateFormat2.format(date);
//        System.out.println("date:"+date2);
//        System.out.println("time:"+newts);
        String key = "inspur0"+date2+"NCSDHS";
        key = MD5Util.md5Encryption(key);
        key = MD5Util.base64Encryption(key);
//        System.out.println("key:"+key);
        requestInfo.setKey(key);
        requestInfo.setExoSystem("inspur");
        requestInfo.setBilltype("0");
        requestInfo.setBillname("业务单元");
        requestInfo.setNewts(newts);
        String body = JSON.toJSONString(requestInfo);
//        System.out.println("业务单元接口请求参数:"+body);
        logger.info("业务单元接口请求参数："+body);
        String str = MyHttpUtils.postBody(ConstantURL.ORGPOST,body);
        return str;
    }
}
