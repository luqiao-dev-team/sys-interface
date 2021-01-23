package com.luqiao.interf.job;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.luqiao.interf.entity.*;
import com.luqiao.interf.mapper.*;
import com.luqiao.interf.service.*;
import com.luqiao.interf.util.ConstantURL;
import com.luqiao.interf.util.MyHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class SampleTask{
    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(SampleTask.class);

    @Autowired
    private OrgMapper orgMapper;
    @Autowired
    private OrgService orgServiceImpl;
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private DeptService deptServiceImpl;
    @Autowired
    private PsndocMapper psndocMapper;
    @Autowired
    private PsndocService psndocServiceImpl;
    @Autowired
    private CustsupMapper custsupMapper;
    @Autowired
    private CustsupService custsupServiceImpl;
    @Autowired
    private InoutbcMapper inoutbcMapper;
    @Autowired
    private InoutbcService inoutbcServiceImpl;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private ProjectService projectServiceImpl;

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
    }
    public void execute(){
        logger.info("Sampletask executes: The time is now " + dateFormat().format(new Date()));

    }

    /**
     * 业务单元(组织)查询定时任务
     * @author guotao
     * @since 2021-01-18
     */
    public void orgTask(){
        try{
            //请求业务单元查询接口
            String result = orgServiceImpl.queryOrgInfo();
//        logger.info("业务单元接口返回数据：" + result);
            System.out.println("业务单元接口返回数据：" + result);
            JSONObject outJson = JSONObject.parseObject(result);
            String code = outJson.getString("statusCode");
            if("200".equals(code)){
                String detail = outJson.getString("detail");
                List<Org> list =  JSONObject.parseArray(detail, Org.class);
//            System.out.println("count:"+list.size());
//            System.out.println("id:"+list.get(0).getPk_org());
                if(list.size() > 0){
                    logger.info("开始插入/更新业务单元数据");
                    for(int i = 0;i < list.size();i++){
                        orgMapper.mergeinfo(list.get(i));
                    }
                    logger.info("业务单元数据入库完成");
                }
            }
        }catch (Exception e){
            logger.error("业务单元查询异常："+e);
        }
    }


    /**
     * 部门查询定时任务
     * @author guotao
     * @since 2021-01-18
     */
    public void deptTask(){
        //请求部门查询接口
        String result = deptServiceImpl.querydeptInfo();
//        System.out.println("部门查询接口返回数据：" + result);
        logger.info("部门查询接口返回数据：" + result);
        JSONObject outJson = JSONObject.parseObject(result);
        String code = outJson.getString("statusCode");
        if("200".equals(code)){
            String detail = outJson.getString("detail");
            List<Dept> list =  JSONObject.parseArray(detail, Dept.class);
//            System.out.println("count:"+list.size());
            if(list.size() > 0){
                logger.info("开始插入/更新部门信息数据");
                for(int i = 0;i < list.size();i++){
                    deptMapper.mergeinfo(list.get(i));
                }
                logger.info("部门信息数据入库完成");
            }
        }
    }


    /**
     * 人员查询定时任务
     * @author guotao
     * @since 2021-01-18
     */
    public void psndocTask(){
        //请求人员查询接口
        String result = psndocServiceImpl.queryPsndocInfo();
//        System.out.println("人员查询接口返回数据：" + result);
        logger.info("人员查询接口返回数据：" + result);
        JSONObject outJson = JSONObject.parseObject(result);
        String code = outJson.getString("statusCode");
        if("200".equals(code)){
            String detail = outJson.getString("detail");
            List<Psndoc> list =  JSONObject.parseArray(detail, Psndoc.class);
            if(list.size() > 0){
                logger.info("开始插入/更新人员信息数据");
                for(int i = 0;i < list.size();i++){
                    psndocMapper.mergeinfo(list.get(i));
                }
                logger.info("人员信息数据入库完成");
            }
        }
    }


    /**
     * 客商查询定时任务
     * @author guotao
     * @since 2021-01-18
     */
    public void custsupTask(){
        //请求客商查询接口
        String result = custsupServiceImpl.queryCustsupInfo();
//        System.out.println("客商查询接口返回数据：" + result);
        logger.info("客商查询接口返回数据：" + result);
        JSONObject outJson = JSONObject.parseObject(result);
        String code = outJson.getString("statusCode");
        if("200".equals(code)){
            String detail = outJson.getString("detail");
            List<Custsup> list =  JSONObject.parseArray(detail, Custsup.class);
            if(list.size() > 0){
                logger.info("开始插入/更新客商信息数据");
                for(int i = 0;i < list.size();i++){
                    custsupMapper.mergeinfo(list.get(i));
                }
                logger.info("客商信息数据入库完成");
            }
        }
    }


    /**
     * 收支项目查询定时任务
     * @author guotao
     * @since 2021-01-18
     */
    public void inoutbcTask(){
        //请求收支项目查询接口
        String result = inoutbcServiceImpl.queryInoutbcInfo();
//        System.out.println("收支项目查询接口返回数据：" + result);
        logger.info("收支项目查询接口返回数据：" + result);
        JSONObject outJson = JSONObject.parseObject(result);
        String code = outJson.getString("statusCode");
        if("200".equals(code)){
            String detail = outJson.getString("detail");
            List<Inoutbc> list =  JSONObject.parseArray(detail, Inoutbc.class);
            if(list.size() > 0) {
                logger.info("开始插入/更新收支项目信息数据");
                for(int i = 0;i < list.size();i++){
                    inoutbcMapper.mergeinfo(list.get(i));
                }
                logger.info("收支项目信息数据入库完成");
            }

        }
    }


    /**
     * 核算项目查询定时任务
     * @author guotao
     * @since 2021-01-18
     */
    public void projectTask(){
        //请求核算项目查询接口
        String result = projectServiceImpl.queryProjectInfo();
//        System.out.println("核算项目查询接口返回数据：" + result);
        logger.info("核算项目查询接口返回数据：" + result);
        JSONObject outJson = JSONObject.parseObject(result);
        String code = outJson.getString("statusCode");
        if("200".equals(code)){
            String detail = outJson.getString("detail");
            List<Project> list =  JSONObject.parseArray(detail, Project.class);
            if(list.size() > 0) {
                logger.info("开始插入/更新核算项目信息数据");
                for(int i = 0;i < list.size();i++){
                    projectMapper.mergeinfo(list.get(i));
                }
                logger.info("核算项目信息数据入库完成");
            }
        }
    }


    /**
     * 客商新增定时任务
     * @author guotao
     * @since 2021-01-19
     */
    public void custsupNewTask(){
        //先查询供应商数据表
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        list = custsupMapper.getgyshList();
        //再对分包商商数据表进行查询
        List<Map<String,String>> list2 = new ArrayList<Map<String,String>>();
        list2 = custsupMapper.getfbshList();

//        String result = custsupServiceImpl.updteCustsup(list.get(0));
//        logger.info("客商新增接口请求参数："+result);

        //将供应商新增数据进行上传
        for(int i = 0 ; i < list.size(); i++){
            String result = custsupServiceImpl.updteCustsup(list.get(i));
            logger.info("客商新增接口请求参数："+result);
        }

        //将分包商新增数据进行上传
        for(int i = 0 ; i < list2.size(); i++){
            String result = custsupServiceImpl.updtefbshCustsup(list2.get(i));
            logger.info("客商新增接口请求参数："+result);
        }

    }

}
