package com.binglian.config;

import static org.hamcrest.CoreMatchers.nullValue;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceAspectConfig {

	
	@Pointcut("@annotation(com.binglian.anno.AdminOnly) && within(com.binglian..*)")
	public void matchAnno(){}
	
	
	@Pointcut("execution(* *..find*(Long)) && within(com.binglian..*)")
	public void matchLongArg(){}
	
	
	@Pointcut("execution(public * com.binglian.service..*Service.*(..) throws java.lang.IllegalAccessException) && within(com.binglian..*)")
    public void matchException(){}
	
	@Pointcut("execution(String com.binglian..*.*(..)) && within(com.binglian..*)")
    public void matchReturn(){}
	
	
	
	/************advice**************/

	
//	@After("matchAnno()")
//	public void after(){
//		System.out.println("###after");
//	}
	
//	@AfterThrowing("matchException()")
//	public void after(){
//		System.out.println("###after");
//	}
	
//	@AfterReturning(value="matchReturn",returning="result")
//	public void after(Object result){
//		System.out.println("###after returning"+result);
//	}
	
	
	@Around("matchAnno()")
	public Object after(ProceedingJoinPoint joinPoint){
		System.out.println("###before");
		Object result=null;
		try{
			result=joinPoint.proceed();
		}catch (Throwable e){
			System.out.println("###ex");
		}finally{
			System.out.println("###finally");
		}
		
		return result;
	}
	
}
