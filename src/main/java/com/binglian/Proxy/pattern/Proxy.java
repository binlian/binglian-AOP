package com.binglian.Proxy.pattern;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

public class Proxy  implements Subject {

	private RealSubject realSubject;
	
	
	public Proxy(RealSubject realSubject) {
		this.realSubject=realSubject;
	}
	
	@Override
	public void request() {
		
		System.out.println("before");
		
		try{
			realSubject.request();
		}catch (Exception e){
			System.out.println("ex:"+e.getMessage());
		}finally{
			System.out.println("after");
		}
	}

	@Override
	public void hell() {
		// TODO Auto-generated method stub
		realSubject.hell();
	}

}
