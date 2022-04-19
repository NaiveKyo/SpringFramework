import io.github.naivekyo.bean.MyBean;
import io.github.naivekyo.bean.custom_label.MyUser;
import io.github.naivekyo.factory_bean.Car;
import io.github.naivekyo.factory_bean.CarFactoryBean;
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
    
    @Test
    public void test3() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        MyUser user = (MyUser) context.getBean("testBean");
        System.out.println(user.getUserName() + " " + user.getEmail());
    }
    
    @Test
    public void test4() {
        
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        
        MyBean bean = (MyBean) bf.getBean("myBean");

        System.out.println(bean.getTestStr());
    }
    
    @Test
    public void test5() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application-context.xml"));

        Car bean = (Car) bf.getBean("car");
        CarFactoryBean factoryBean = (CarFactoryBean) bf.getBean("&car");
        System.out.println(bean);
        System.out.println(factoryBean);

        System.out.println(bean.getBrand() + "\n" + bean.getMaxSpeed() + " \n" + bean.getPrice());
    }
}
