package com.spring04.writing_code_using_the_bean_factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class Main04 {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		System.out.println("Spring 04");

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("triangle04.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		triangle.draw();

	}

}