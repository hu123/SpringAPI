package org.huluo.springrmi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring-rmi-client.xml")
public class SpringRmiClient {
    @Autowired
    private SpringRmiStudentService studentService;

    @Test
    public void springRmiClient() throws Exception {
        System.out.println("来自Spring RMI服务端的结果" + studentService.getNumber());
    }
}
