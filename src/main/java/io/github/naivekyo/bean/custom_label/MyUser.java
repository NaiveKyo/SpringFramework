package io.github.naivekyo.bean.custom_label;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 接收配置文件的 POJO
 * 
 * @since 2022/3/17 14:23
 */
public class MyUser {
    
    private String userName;
    
    private String email;

    public MyUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
