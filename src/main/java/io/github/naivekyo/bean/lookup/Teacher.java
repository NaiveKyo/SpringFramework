package io.github.naivekyo.bean.lookup;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 继承 User 类
 * @since 2022/3/16 11:39
 */
public class Teacher extends User {

    @Override
    public void showMe() {
        System.out.println("I'm teacher.");
    }
}
