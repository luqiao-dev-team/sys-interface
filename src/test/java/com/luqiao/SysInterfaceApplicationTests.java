package com.luqiao;

import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.mapper.CustsupMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SysInterfaceApplicationTests {

	@Autowired
	private CustsupMapper custsupMapper;

	@Test
	void contextLoads() {
		System.out.println("Mybatis plus test......");
		List<Custsup> custsupList = custsupMapper.getCustsupList();
		custsupList.forEach(System.out::println);
	}

}
