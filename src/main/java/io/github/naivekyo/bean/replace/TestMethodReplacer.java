package io.github.naivekyo.bean.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author NaiveKyo
 * @version 1.0
 * @since 2022/3/16 14:21
 */
public class TestMethodReplacer implements MethodReplacer {
    
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("替换了原有的方法!");
        return null;
    }
    
}
