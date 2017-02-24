package org.hl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/ctx.xml")
public class Main {

    @Test
    public void testName() throws Exception {

        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.warn("我去");
        System.out.println("呃呃呃");
    }
}
