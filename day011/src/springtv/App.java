package springtv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Spring Start .....");
		
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("mytv.xml");
		// xml에 의해 container가 만들어짐 (xml:환경설정파일), => Spring Container 만듦
		
		System.out.println("Spring Started");
		// 모든 객체는 Spring이 관리한다
		
		TV stv = (TV)factory.getBean("sstv"); // factory -> spring한테 tv주라고 함
		stv.turnOn();
		stv.volumeUp(10);
		System.out.println(stv);
		
		TV stv2 = (TV)factory.getBean("sstv");
		stv2.turnOn();
		stv2.volumeUp(10);
		System.out.println(stv2);
		
		factory.close();
	}

}
