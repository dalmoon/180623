package com.biz.user;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
	public void logWrite() {
		System.out.println("log write");
	}
	
	@Pointcut("execution(public * com.biz.user.UserServiceImpl.*(..))")
    public void aaa() {
        // pointcut annotation 값을 참조하기 위한 dummy method
    }
	
	@Before("execution(public * com.biz.user.UserServiceImpl.*(..))")
	//@Before("aaa()")
	public void prevCehck() {
		System.out.println("-----------prevCehck");
	}
	@After("execution(public * com.biz.user.UserServiceImpl.*(..))")
	//@After("aaa()")
	public void close() {
		System.out.println("-----------close"); 
	}

	
}

