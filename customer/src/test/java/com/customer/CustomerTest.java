package com.customer;

import com.robin.toy.cart.BeanFactoryUtils;
import com.robin.toy.cart.Test;

public class CustomerTest {

	private void mian() {
	     BeanFactoryUtils beanFactoryUtils=new BeanFactoryUtils();
         Test test = (Test) beanFactoryUtils.getBean("robintest");
         System.out.println(test.test());

	}
}
