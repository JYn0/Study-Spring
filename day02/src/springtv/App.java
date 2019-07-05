package springtv;

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
		
		TV stv = (TV)factory.getBean("stv"); // factory -> spring한테 tv주라고 함
		stv.turnOn();
		stv.volumeUp(20);
		System.out.println(stv);
		
		factory.close();
	}

}
