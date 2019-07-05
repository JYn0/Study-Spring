package springtv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Spring Start .....");
		
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("mytv.xml");
		// xml�� ���� container�� ������� (xml:ȯ�漳������), => Spring Container ����
		
		System.out.println("Spring Started");
		// ��� ��ü�� Spring�� �����Ѵ�
		
		TV stv = (TV)factory.getBean("stv"); // factory -> spring���� tv�ֶ�� ��
		stv.turnOn();
		stv.volumeUp(20);
		System.out.println(stv);
		
		factory.close();
	}

}
