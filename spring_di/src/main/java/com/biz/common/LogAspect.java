package com.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
	public void logWrite() {
		System.out.println("lgo Write");
	}
	//@Pointcut("execution(* com.biz..*Impl.*(..))")
	@Before("* com.biz..*Impl.*(..)")
	public void prevCehck() {
		System.out.println("-----------prevCehck");
	}
	@After("* com.biz..*Impl.*(..)")
	public void close() {
		System.out.println("------------close");
	}
}
