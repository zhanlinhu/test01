package main.java.cn.edu.ctbu.domain;

public class Student {
    private String uid;
    private String name;
    private String sex;
    private Integer age;

    public Student() {
    }

    public Student(String uid, String name, String sex, Integer age) {
        this.uid = uid;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
