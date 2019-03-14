package com.binglian.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * //匹配方法标注有AdminOnly的注解的方法
 * @Pointcut("@annotation(com.binglian.anno.AdminOnly) && within(com.binglian..*)")
 * //匹配标注有NeedSecured的类底下的方法 //class级别
 * @Pointcut("@within(com.binglian.anno.NeedSecured) && within(com.binglian..*)")
 * //匹配标注有NeedSecured的类及其子类的方法 //runtime级别
 * 在spring context的环境下,二者没有区别
 * @Pointcut("@target(com.binglian.anno.NeedSecured) && within(com.binglian..*)")
 * //匹配传入的参数类标注有Repository注解的方法
 * @Pointcut("@args(com.binglian.anno.NeedSecured) && within(com.binglian..*)")
 * Created by cat on 2016-12-04.
 */

@Aspect
@Component
public class AnnoAspectConfig {

	
//	@Pointcut("@annotation(com.binglian.anno.NeedSecured) && within(com.binglian..*)")
//	public void matchAnno(){}
//
//	
//	@Before("matchAnno()")
//	public void before(){
//		System.out.println("");
//		System.out.println("###before");
//	}
}
