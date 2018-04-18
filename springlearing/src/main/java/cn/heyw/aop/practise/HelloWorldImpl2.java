package cn.heyw.aop.practise;

public class HelloWorldImpl2 implements HelloWorld {

	@Override
	public void printHelloWorld() {
          System.out.println("Enter into HelloWorldImpl2.printHelloWold()!");
	}

	@Override
	public void doPrint() {
		 System.out.println("Enter into HelloWorldImpl2.doPrint()!");
	}

}
