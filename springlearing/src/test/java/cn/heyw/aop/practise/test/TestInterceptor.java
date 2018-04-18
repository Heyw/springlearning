package cn.heyw.aop.practise.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterceptor {
	@Test
     public void test(){
    	 @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/practise/config/aopintercepter.xml");
    	 HandlerTest bean = context.getBean(HandlerTest.class);
    	 bean.test();
     }
}
