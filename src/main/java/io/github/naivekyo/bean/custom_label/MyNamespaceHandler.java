package io.github.naivekyo.bean.custom_label;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 自定义 Handler 将 bean 注册到 Spring 容器
 * @since 2022/3/17 14:40
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }

}
