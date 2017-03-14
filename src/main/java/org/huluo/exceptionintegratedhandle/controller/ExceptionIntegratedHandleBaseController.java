package org.huluo.exceptionintegratedhandle.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

//以注解加继承的方式实现Spring的异常统一处理
//期望被统一处理的controller需要继承这个类
public class ExceptionIntegratedHandleBaseController {

    @ExceptionHandler
    public String handleException(HttpServletRequest request, Exception ex) {
        System.out.println("异常被处理掉了:以注解加继承的方式");
        System.out.println("异常的信息是:" + ex.getClass().getName());
        return "error";
    }
}
