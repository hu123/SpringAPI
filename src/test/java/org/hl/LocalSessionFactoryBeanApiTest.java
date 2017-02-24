package org.hl;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/ctx-hibernate.xml")
public class LocalSessionFactoryBeanApiTest {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;
//    @Autowired
//    private BasicDataSource basicDataSource;
    @Test
    public void testName() throws Exception {
        Session session = sessionFactory.openSession();
        System.out.println("session的toString方法:" + session);

    }
}
