package com.luqiao.interf.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.luqiao.interf.entity.Psndoc;
import com.luqiao.interf.entity.RequestInfo;
import com.luqiao.interf.mapper.PsndocMapper;
import com.luqiao.interf.service.PsndocService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.luqiao.interf.util.ConstantURL;
import com.luqiao.interf.util.MD5Util;
import com.luqiao.interf.util.MyHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guotao
 * @since 2021-01-15
 */
@Service
public class PsndocServiceImpl extends ServiceImpl<PsndocMapper, Psndoc> implements PsndocService {

    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(PsndocServiceImpl.class);

    @Override
    public String queryPsndocInfo() {

        RequestInfo requestInfo = new RequestInfo();
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = simpleDateFormat.format(date);
//        System.out.println("date:"+date2);
        //时间戳
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String newts = simpleDateFormat2.format(date);
        String key = "inspur2"+date2+"NCSDHS";
        key = MD5Util.md5Encryption(key);
        key = MD5Util.base64Encryption(key);
//        System.out.println("key:"+key);
        requestInfo.setKey(key);
        requestInfo.setExoSystem("inspur");
        requestInfo.setBilltype("2");
        requestInfo.setBillname("人员");
        requestInfo.setNewts(newts);
        String body = JSON.toJSONString(requestInfo);
//        System.out.println("人员查询接口请求参数:"+body);
        logger.info("人员查询接口请求参数："+body);
        String str = MyHttpUtils.postBody(ConstantURL.PSNDOCPOST,body);
        return str;
    }
}
