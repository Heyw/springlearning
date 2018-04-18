package cn.heyw.aop.practise.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.heyw.aop.practise.HelloWorld;

public class TestAop {
      public static void main(String[] args) {
		     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/aop/practise/config/aoppractise.xml");
		     HelloWorld  bean = (HelloWorld) context.getBean("helloworld1");
		     HelloWorld  bean2 = (HelloWorld) context.getBean("helloworld2");
		     bean.doPrint();
		     System.out.println();
		     bean.printHelloWorld();
		     
		     bean2.doPrint();
		     System.out.println();
		     bean2.printHelloWorld();
	}
}
