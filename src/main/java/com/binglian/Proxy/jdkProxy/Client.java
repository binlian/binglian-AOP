package com.binglian.Proxy.jdkProxy;

import java.lang.reflect.Proxy;

import com.binglian.Proxy.pattern.RealSubject;
import com.binglian.Proxy.pattern.Subject;

public class Client {

	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
		
		Subject subject=(Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),
				new Class[]{Subject.class}, new JdkProxySubject(new RealSubject()));
	
//		subject.request();
		subject.hell();
	}
}
