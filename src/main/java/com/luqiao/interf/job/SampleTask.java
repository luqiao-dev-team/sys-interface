package com.luqiao.interf.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SampleTask{
    /**日志对象*/
    private static final Logger logger = LoggerFactory.getLogger(SampleTask.class);

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
    }
    public void execute(){
        logger.info("Sampletask executes: The time is now " + dateFormat().format(new Date()));

    }
}
