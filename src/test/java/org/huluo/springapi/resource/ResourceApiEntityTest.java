package org.huluo.springapi.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/ctx-resource.xml")
public class ResourceApiEntityTest {
    @Autowired
    private ResourceApiEntity resourceApiEntity;

    @Test
    public void testName() throws Exception {
        Resource resource = resourceApiEntity.getResource();
        File file = resource.getFile();
        System.out.println("资源路径是:" + file.getPath());
    }
}