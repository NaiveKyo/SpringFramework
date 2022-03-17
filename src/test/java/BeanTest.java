import io.github.naivekyo.bean.MyBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author NaiveKyo
 * @version 1.0
 * @since 2022/3/14 10:12
 */
public class BeanTest {
    
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");

        MyBean bean = ac.getBean(MyBean.class);

        System.out.println(bean.getTestStr());
    }
    
    @Test
    public void test2() {
        
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        
        MyBean bean = bf.getBean(MyBean.class);

        System.out.println(bean.getTestStr());
        
    }
}
