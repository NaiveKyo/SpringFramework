package io.github.naivekyo.bean.lookup;

/**
 * @author NaiveKyo
 * @version 1.0
 * @since 2022/3/16 11:51
 */
public class Student extends User {

    @Override
    public void showMe() {
        System.out.println("I'm student.");
    }
}
