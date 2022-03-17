package io.github.naivekyo.bean.lookup;

/**
 * @author NaiveKyo
 * @version 1.0
 * @since 2022/3/16 11:41
 */
public abstract class GetBeanTest {
    
    public void showMe() {
        this.getBean().showMe();
    }
    
    public abstract User getBean();
}
