package com.luqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.luqiao.interf.mapper")
@ImportResource("classpath:application-quartz.xml")
public class SysInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysInterfaceApplication.class, args);
	}

}
