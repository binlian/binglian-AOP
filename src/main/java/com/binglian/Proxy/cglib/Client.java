package com.binglian.Proxy.cglib;

import com.binglian.Proxy.pattern.RealSubject;
import com.binglian.Proxy.pattern.Subject;

import net.sf.cglib.proxy.Enhancer;

public class Client {

	public static void main(String[] args) {

		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(RealSubject.class);//目标类
		enhancer.setCallback(new DemoMethodInterceptor());//要插入的内容 代理
		Subject subject=(Subject) enhancer.create();//Cglib创建
		subject.hell();
	}

}
