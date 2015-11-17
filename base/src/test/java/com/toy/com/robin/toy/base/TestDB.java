package com.toy.com.robin.toy.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.robin.toy.base.test.ITest;

@RunWith(SpringJUnit4ClassRunner.class)		
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDB {
	@Autowired
	ITest iTest;
	@Test
	public void testdb(){
		System.out.println(iTest.select1()+"====="+iTest.getOrders());
	}

}
