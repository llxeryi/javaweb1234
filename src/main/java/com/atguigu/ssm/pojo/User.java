package com.atguigu.ssm.pojo;

/**
 * ClassName: User
 * Package: com.atguigu.ssm.pojo
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public class User {
    private String email;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public User() {
    }
}
