import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class HowHandleVoidMethodJUnitTest {
    @Test
    public void testVoidMethod() throws Exception {
        HowHandleVoidMethodJUnit howHandleVoidMethodJUnit = new HowHandleVoidMethodJUnit();
        Class<?> clazz = howHandleVoidMethodJUnit.getClass();
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        String string = (String) field.get(howHandleVoidMethodJUnit);

        assertEquals("helloworld", string);
        howHandleVoidMethodJUnit.voidMethod();

        String string1 = (String) field.get(howHandleVoidMethodJUnit);
        assertEquals("一个返回void的方法如何进行测试???",string1);
    }

}