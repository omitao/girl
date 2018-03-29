package com.omitao.girl.aspect;


import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by omitao on 2018/2/11
 */
@Aspect
@Component
public class HttpAspect {

    Logger logger = LoggerFactory.getLogger(HttpAspect.class);



    @Pointcut("execution(public * com.omitao.girl.controller.GirlController.addGirl(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(){

        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();

        logger.info("url={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("ip={}",request.getRemoteAddr());
        logger.info("port={}",request.getRemotePort());
        logger.info("1111111");
    }

    @After("log()")
    public void  doAfter(){
        logger.info("22222222");

    }

    @AfterReturning(value = "log()",returning = "object")
    public void  doAfterReturning(Object object){
        logger.info("response={}",object);
        logger.info("33333333");

    }
}
