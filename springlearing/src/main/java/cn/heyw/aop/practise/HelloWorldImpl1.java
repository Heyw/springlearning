package cn.heyw.aop.practise;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl1 implements HelloWorld {

	@Override
	public void printHelloWorld() {
		 System.out.println("Enter into HelloWorldImpl1.printHelloWold!");
	}

	@Override
	public void doPrint() {
		 System.out.println("Enter into HelloWorldImpl2.doPrint()!");
	}

}
