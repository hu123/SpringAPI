package org.huluo.spring.beanvalidation.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/ctx-beanValidation.xml"})
public class StudentTest {

    @Autowired
    private Student student;

    @Test
    public void testBeanValidation() throws Exception {
    //因为不符合bean校验所以单元测试启动失败

    }
}