package org.huluo.springsourcecodestudy;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;

/**
 * 测试一下Spring的PropertiesBeanDefinitionReader的api从.properties文件中读取数据生成一个BeanDefinition
 */
public class SpringPropertiesBeanDefinitionReaderApiTest {
    public static void main(String[] args) {


        //定义BeanDefinitionRegistry
        BeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();
        //使用BeanDefinitionRegistry实例 构造BeanDefinitionReader
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(registry);
        //载入文件
        reader.loadBeanDefinitions("propertiesBeanDefinitionReaderapitest.properties");

        BeanDefinition beanDefinition = registry.getBeanDefinition("mybean");

        System.out.println("is lazy initializing ? " +  beanDefinition.isLazyInit());
        System.out.println("scope is :" + beanDefinition.getScope());
        System.out.println("java class is " + beanDefinition.getBeanClassName());
        System.out.println("is abstract??" + beanDefinition.isAbstract());
    }
}
