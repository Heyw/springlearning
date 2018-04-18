package cn.heyw.springlearing;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.heyw.domain.TUser;
import cn.heyw.service.UserService;

public class MybatisTest {
     private UserService service;
     @Before
     public void before(){
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
    	 service=(UserService) context.getBean("userService");
     }
     @Test
     public void testAddUser(){
    	 TUser user=new TUser();
    	 user.setUserBirthday(new Date());
    	 user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
    	 user.setUserName("hhh");
    	 user.setUserSalary(9000.00);
    	 service.addUser(user);
     }
}
