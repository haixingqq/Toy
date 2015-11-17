package com.robin.toy.cart;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanFactoryUtils {
		static Logger  logger = Logger.getLogger(BeanFactoryUtils.class);
		public static BeanFactory beanFactory;
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			   ApplicationContext context = new ClassPathXmlApplicationContext(  new String[] {"classpath:spring-mybatis.xml"});  
			   beanFactory =  (BeanFactory) context; 
			   logger.info("GET SPRINGCONTEXT IS FINISHIED");
		       while(!new Scanner(System.in).next().toLowerCase().equals("exit")){
				    logger.info("IF YOU WANT TO EXIT PLEASE PRINT ''exit' OR 'EXIT");
				   continue;
			}  
		}
		public static Object getBean(String name){
			getBeanFactory();
			return beanFactory.getBean(name);
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public  static Object getBean(Class clazz){
			getBeanFactory();
			return beanFactory.getBean(clazz);
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static Object getBean(String name,Class clazz){
			getBeanFactory();
			return beanFactory.getBean(name, clazz);
		}
		private static synchronized void getBeanFactory(){
	    	    	if(null==beanFactory){
	    	    	   	logger.info("GET SPRING APPLICATIONCONTEXT");
	     	    	    ApplicationContext context = new ClassPathXmlApplicationContext(  new String[] {"classpath:spring-mybatis.xml"});  
	     		       beanFactory =  (BeanFactory) context; 
	     	           logger.info("GET APPLICATIONCONTEXT FINISHIED");
	    	    	}
	    }
	
	

}
