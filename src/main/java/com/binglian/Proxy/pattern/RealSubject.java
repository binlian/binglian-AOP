package com.binglian.Proxy.pattern;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("real subject execute request");
	}

	@Override
	public void hell() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
