package com.weguard;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
public class Test {

	@org.junit.Test
	public void test(){
		
	//  BeanFactory be=new XmlBeanFactory()
        Resource resource=new ClassPathResource("beanFactory.xml");
        BeanFactory bf= new XmlBeanFactory (resource);
      //  OpenTabb o= (OpenTabb) bf.getBean("openTabb");
       // System.out.println(o);
        ClassPathXmlApplicationContext ca=new ClassPathXmlApplicationContext("beanFactory.xml");
        System.out.println(ca);
       // OpenTabb op= (OpenTabb) ca.getBean("openTabb");
      //  System.out.println(op);
	}
}
