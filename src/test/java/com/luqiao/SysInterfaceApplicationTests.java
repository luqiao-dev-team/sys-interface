package com.luqiao;

import com.luqiao.interf.entity.Custsup;
import com.luqiao.interf.job.ContractTask;
import com.luqiao.interf.mapper.CustsupMapper;
import com.luqiao.interf.mapper.PmContractMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SysInterfaceApplicationTests {

	@Autowired
	private PmContractMapper contractMapper;

	@Test
	void contextLoads() {
//		System.out.println("Mybatis plus test......");
//		List<Custsup> custsupList = custsupMapper.getCustsupList();
//		custsupList.forEach(System.out::println);
//		System.out.println("Mybatis plus test finish");
		ContractTask testTask = new ContractTask();
		testTask.setContractMapper(contractMapper);
		testTask.execute4SkContract();
	}

}
