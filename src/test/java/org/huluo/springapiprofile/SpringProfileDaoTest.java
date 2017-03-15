package org.huluo.springapiprofile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/ctx-profiletest.xml")
/**
 *使用该注解激活produce情况下的profile
 * 激活profile的条件还有其他的方式,并且是更常用的方式
 * 比如说像在web.xml里去配置
 *  <context-param>
 *      <param-name>spring.profiles.active</param-name>
 *      <param-value>jpa</param-value>
 *  </context-param>
 *  该配置的意思是激活 名字为 jpa的profile
 */
@ActiveProfiles(value = "produce")
public class SpringProfileDaoTest {


    @Autowired
    private SpringProfileDao springProfileDao;

    @Test
    public void testName() throws Exception {
        System.out.println(springProfileDao.getUsername());
        System.out.println(springProfileDao.getPassword());
        System.out.println(springProfileDao.getDbType());
    }
}