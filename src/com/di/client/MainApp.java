package com.di.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.di.beans.Student;

public class MainApp {

	public static void main(String args[])
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/di/cfgs/applicationContext.xml");
		System.out.println(ap.getBean("st",Student.class).hashCode());
		System.out.println(ap.getBean("st",Student.class).hashCode());
		System.out.println(ap.getBean("st",Student.class).hashCode());
	}
}
