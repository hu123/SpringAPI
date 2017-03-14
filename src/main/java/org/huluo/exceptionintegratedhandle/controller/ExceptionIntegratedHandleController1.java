package org.huluo.exceptionintegratedhandle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionIntegratedHandleController1 extends ExceptionIntegratedHandleBaseController {

    @RequestMapping("/world")
    @ResponseBody
    public Object world() {
        throw new RuntimeException("我这里是手动抛出的异常,期望被SpringMVC集中处理");
    }

}
