package com.sjl.bean;


import java.io.Serializable;

/**
 * @author Administrator
 */
public class User implements Serializable {

  private long id;
  private String username;
  private long age;
  private String sex;
  private String address;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", address='" + address + '\'' +
            '}';
  }
}
