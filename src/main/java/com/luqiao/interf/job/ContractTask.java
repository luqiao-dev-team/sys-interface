package com.luqiao.interf.job;

import com.alibaba.druid.support.json.JSONUtils;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.luqiao.interf.entity.PmContract;
import com.luqiao.interf.mapper.PmContractMapper;
import com.luqiao.interf.util.ConstantURL;
import com.luqiao.interf.util.MD5Util;
import com.luqiao.interf.util.MyHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ContractTask {
    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(ContractTask.class);

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
    @Autowired
    private PmContractMapper contractMapper;

    public void setContractMapper(PmContractMapper contractMapper) {
        this.contractMapper = contractMapper;
    }

    public void execute4SkContract(){
        logger.info("Shoukuan task begin execute: " + dateFormat().format(new Date()));
        List<HashMap<String,String>> contractList = new ArrayList<HashMap<String,String>>();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR,-30);
        Date startDay = cal.getTime();
        String sDay = dateFormat().format(startDay);
        logger.info("get contact conditions: after " + sDay);

        HashMap<String,String> tmpMap = new HashMap<String,String>();
//        String whereSql = " TS >= to_date('"+ sDay +"','yyyy-mm-dd hh24:mi:ss') and HTDJ_SZFX = 1 ";
        tmpMap.put("szfx","1");
        contractList = contractMapper.getContractListByCondition(tmpMap);

        if(null != contractList && contractList.size()>0){
            //格式化数据，调用用友接口
            String postUrl = ConstantURL.FCTARContactPOST;
            String reRst = "";
            Iterator<HashMap<String,String>> iter = contractList.iterator();
            while(iter.hasNext()){
                HashMap<String,String> pmCon = iter.next();
                String paraJson = tranf2json(pmCon);
                reRst = "success";//MyHttpUtils.postBody(postUrl,paraJson);
                logger.info("ContactTask post YY result: " + reRst);
                /*{
                   "statusCode":"200",
                   "message":"sucess",
                   "detail":{
                      "id":"0001A4100000005VE12P",
                      "ts":"2020-09-12 12:00:00"
                    }
                 }
                */
            }
        }else{

            logger.info("there is no record match the condition, wait for next time.");
        }

        logger.info("ContackTask get contact list size: " + contractList.size());
    }

    public String tranf2json(Object obj){
        String jsonPara = "";
        SimpleDateFormat ds = new SimpleDateFormat("yyyy-MM-dd");
        String dt = ds.format(new Date());
        String billName = "收款合同";
        String exoSystem = "inspur";
        String randomString = "NCSDHS";
        String billType = "Fct_ar";

        String key = exoSystem+billType+dt+randomString;
        logger.info("ContactTask the key before encrpt: " + key);

        key = MD5Util.base64Encryption(MD5Util.md5Encryption(key));

        HashMap tmpMap = new HashMap();
        tmpMap.put("key",key);
        tmpMap.put("exoSystem",exoSystem);
        tmpMap.put("billtype",billType);
        tmpMap.put("billname",billName);
        tmpMap.put("data",obj);

        jsonPara = JSONUtils.toJSONString(tmpMap);

        logger.info("ContactTask tranfer json is: " + jsonPara);
        return jsonPara;
    }
}
