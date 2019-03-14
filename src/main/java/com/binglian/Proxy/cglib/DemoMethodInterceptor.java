package com.binglian.Proxy.cglib;

import static org.hamcrest.CoreMatchers.nullValue;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;



public class DemoMethodInterceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println("before in cglib");
		Object result=null;
		try{
			result=proxy.invokeSuper(object, args);
		}catch (Exception e){
			System.out.println("get ex:"+e.getMessage());
			throw e;
		}finally{
			System.out.println("after in cglib");
		}
		return result;
	}

	

}
