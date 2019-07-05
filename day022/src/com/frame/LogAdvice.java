package com.frame;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

import com.user.User;

public class LogAdvice {
	public void printLog() {
		Date d = new Date();
		System.out.println(d+"[����α�] ����Ͻ� ���� ����...");
	}
	
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object [] args = jp.getArgs();
		System.out.println(method+" : "+args[0]);
		System.out.println("[before] ����Ͻ� ���� ����...");
	}
	
	public void afterLog(JoinPoint jp, Object returnObj) {
		System.out.println("[after] ����Ͻ� ���� ����...");
		System.out.println("Log Result: "+returnObj);
//		if(returnObj instanceof User) {
//			System.out.println(returnObj);
//		}
	}
	
	public void exLog(JoinPoint jp, Exception ex) {
		Date d = new Date();
		System.out.println(d+"[EX�α�]Exception...");
		System.out.println(ex.getMessage());
	}
	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		System.out.println("Before Action");
		Object obj = pjp.proceed(); // select ����
		System.out.println("after Action");
		
		stopWatch.stop();
		System.out.println("Processing Time : "+stopWatch.getTotalTimeSeconds());
		return obj;
	}
}
