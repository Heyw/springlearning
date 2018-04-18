package cn.heyw.aop.practise.test;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class AopInterceptor implements MethodInterceptor {
    @Pointcut("execution(* cn.heyw.aop.practise.HelloWorld*.*Print(..)")
	public void pointcut(){}
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	@Around("pointcut()")
   public void doArround(){
	   System.out.println("dosomething?");
   }
}
