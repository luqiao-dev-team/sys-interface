package com.luqiao.interf.job;

import com.luqiao.interf.job.tasks.SampleTask;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class SchedulerJobs {
    @Autowired
    SchedulerFactoryBean schedulerFactoryBean;
    public void scheduleJobs() throws SchedulerException {
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        startSampleTask(scheduler);
        //新增定时任务启动在这里追加
    }

    /*定时任务样例
    *
    * */
    public void startSampleTask(Scheduler scheduler) throws SchedulerException{
        JobDetail jobDetail = JobBuilder.newJob(SampleTask.class) .withIdentity("SampleTask", "group1").build();
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("SampleTaskTrigger", "group1") .withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);
    }
}
