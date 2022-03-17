package io.github.naivekyo.bean.replace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 测试类
 * @since 2022/3/16 14:23
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-replace.xml");
        
        TestChangeMethod test = (TestChangeMethod) context.getBean("testChangeMethod");
        
        test.changeMe();
    }
}
