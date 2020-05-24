package com.itbruce.domain;

public class User {
    private Integer id;
    private String address;
    private String name;
    private String education;

    private String zhuXian;

    private String fenZhi;

    public User() {

    }

    public User(Integer id, String address, String name, String education, String zhuXian, String fenZhi) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.education = education;
        this.zhuXian = zhuXian;
        this.fenZhi = fenZhi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getZhuXian() {
        return zhuXian;
    }

    public void setZhuXian(String zhuXian) {
        this.zhuXian = zhuXian;
    }

    public String getFenZhi() {
        return fenZhi;
    }

    public void setFenZhi(String fenZhi) {
        this.fenZhi = fenZhi;
    }

/*    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", zhuXian='" + zhuXian + '\'' +
                ", fenZhi='" + fenZhi + '\'' +
                '}';
    }*/
}
