package com.robin.toy.cart;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robin.toy.api.ITest;

@Service("robintest")
public class Test implements ITest{
	static Logger  logger = Logger.getLogger(Test.class);
	@Autowired
	com.robin.toy.base.test.ITest test;
	public String test() {
		return test.select1()+"======="+test.getOrders();
	}

}
