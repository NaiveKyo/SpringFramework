package io.github.naivekyo.bean.custom_label;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 自定义 BeanDefinitionParser 解析器
 * @since 2022/3/17 14:33
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    // Element 对应的类
    @Override
    protected Class<?> getBeanClass(Element element) {
        return MyUser.class;
    }

    // 从 Element 中解析并提取对应的元素
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        
        // 将提出的信息放入 BeanDefinitionBuilder 中, 待完成所有 bean 的解析后统一注册到 beanFactory 中
        if (StringUtils.hasText(userName)) {
            builder.addPropertyReference("userName", userName);
        }
        if (StringUtils.hasText(email)) {
            builder.addPropertyReference("email", email);
        }
    }
}
