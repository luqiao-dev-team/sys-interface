package com.luqiao.interf.job;

import com.luqiao.interf.controller.CustsupController;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SampleTask{
    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(CustsupController.class);

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
    }
    public void execute(){
        logger.info("Sampletask executes: The time is now " + dateFormat().format(new Date()));

    }
}
