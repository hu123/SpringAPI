package org.huluo.spring.beanvalidation.controller;

import org.huluo.spring.beanvalidation.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BeanValidationController {

    private static final Logger logger = LoggerFactory.getLogger(BeanValidationController.class);

    @ResponseBody
    @RequestMapping("/beanValidation")
    public Object student(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            List<ObjectError> objectErrors = bindingResult.getAllErrors();

            for (ObjectError objectError : objectErrors) {
                logger.warn(objectError.getObjectName() + "," + objectError.getDefaultMessage());
            }
            return "bean error";
        }
        return "bean right ";
    }
}
