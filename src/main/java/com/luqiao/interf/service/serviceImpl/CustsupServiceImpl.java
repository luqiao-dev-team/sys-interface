package com.luqiao.interf.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.luqiao.interf.entity.BodyInfo;
import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.entity.DataInfo;
import com.luqiao.interf.entity.RequestInfo;
import com.luqiao.interf.mapper.CustsupMapper;
import com.luqiao.interf.service.CustsupService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.luqiao.interf.util.ConstantURL;
import com.luqiao.interf.util.MD5Util;
import com.luqiao.interf.util.MyHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhouguoan
 * @since 2021-01-12
 */
@Service
public class CustsupServiceImpl extends ServiceImpl<CustsupMapper, Custsup> implements CustsupService {

    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(CustsupServiceImpl.class);

    @Override
    public String queryCustsupInfo() {

        RequestInfo requestInfo = new RequestInfo();
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = simpleDateFormat.format(date);
//        System.out.println("date:"+date2);
        //时间戳
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String newts = simpleDateFormat2.format(date);
        String key = "inspur3"+date2+"NCSDHS";
        key = MD5Util.md5Encryption(key);
        key = MD5Util.base64Encryption(key);
//        System.out.println("key:"+key);
        requestInfo.setKey(key);
        requestInfo.setExoSystem("inspur");
        requestInfo.setBilltype("3");
        requestInfo.setBillname("客商");
        requestInfo.setNewts(newts);
        String body = JSON.toJSONString(requestInfo);
//        System.out.println("客商查询接口请求参数:"+body);
        logger.info("客商查询接口请求参数："+body);
        String str = MyHttpUtils.postBody(ConstantURL.CUSTSUPOST,body);
        return str;
    }

    /**
     * 供应商信息新增
     * @param map
     * @return
     */
    @Override
    public String updteCustsup(Map<String, String> map) {
        System.out.println("GYSH_TIME:"+map.get("GYSH_TIME"));
        BodyInfo body = new BodyInfo();
        DataInfo data = new DataInfo();
        RequestInfo requestInfo = new RequestInfo();
        body.setCode(map.get("GYSH_SH"));
        body.setSupprop(map.get("GYSH_SFNBDW"));
        body.setName(map.get("GYSH_MC"));
        body.setSupplierclass("b");
        data.setBody(body);
        data.setDmakedate(map.get("GYSH_TIME"));
        data.setVoperatorid(map.get("EXTVALUE"));
        data.setPk_org(map.get("YYDWID"));
        requestInfo.setData(data);
        requestInfo.setBillname("供应商申请");
        requestInfo.setBilltype("cust");
        requestInfo.setExoSystem("inspur");
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = simpleDateFormat.format(date);
        String key = "inspurcust"+date2+"NCSDHS";
        key = MD5Util.md5Encryption(key);
        key = MD5Util.base64Encryption(key);
        requestInfo.setKey(key);
        String str = JSON.toJSONString(requestInfo);
        logger.info("客商新增接口请求参数："+str);
        String result = MyHttpUtils.postBody(ConstantURL.CUSTSUPOST,str);
        return result;
    }


    /**
     * 分包商信息新增
     * @param map
     * @return
     */
    @Override
    public String updtefbshCustsup(Map<String, String> map) {
        System.out.println("GYSH_TIME:"+map.get("GYSH_TIME"));
        BodyInfo body = new BodyInfo();
        DataInfo data = new DataInfo();
        RequestInfo requestInfo = new RequestInfo();
        body.setCode(map.get("FBSH_SH"));
        body.setSupprop(map.get("FBSH_SFNBDW"));
        body.setName(map.get("FBSH_MC"));
        body.setSupplierclass("b");
        data.setBody(body);
        data.setDmakedate(map.get("FBSH_TIME"));
        data.setVoperatorid(map.get("EXTVALUE"));
        data.setPk_org(map.get("YYDWID"));
        requestInfo.setData(data);
        requestInfo.setBillname("供应商申请");
        requestInfo.setBilltype("cust");
        requestInfo.setExoSystem("inspur");
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = simpleDateFormat.format(date);
        String key = "inspurcust"+date2+"NCSDHS";
        key = MD5Util.md5Encryption(key);
        key = MD5Util.base64Encryption(key);
        requestInfo.setKey(key);
        String str = JSON.toJSONString(requestInfo);
        logger.info("客商新增接口请求参数："+str);
        String result = MyHttpUtils.postBody(ConstantURL.CUSTSUPOST,str);
        return result;
    }
}
