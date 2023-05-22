package com.atguigu.ssm.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: Course
 * Package: com.atguigu.ssm.pojo
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public class Course {

    private Integer cId;
    private String name;
    private Integer hours;
    private Integer schools;
    private  String image;
    private MultipartFile logoImage;

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", schools=" + schools +
                ", image='" + image + '\'' +
                ", logoImage=" + logoImage +
                '}';
    }

    public MultipartFile getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(MultipartFile logoImage) {
        this.logoImage = logoImage;
    }

    public Course(Integer cId, String name, Integer hours, Integer schools, String image, MultipartFile logoImage) {
        this.cId = cId;
        this.name = name;
        this.hours = hours;
        this.schools = schools;
        this.image = image;
        this.logoImage = logoImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Course(Integer cId, String name, Integer hours, Integer schools, String image) {
        this.cId = cId;
        this.name = name;
        this.hours = hours;
        this.schools = schools;
        this.image = image;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSchools() {
        return schools;
    }

    public void setSchools(Integer schools) {
        this.schools = schools;
    }

    public Course(Integer cId, String name, Integer hours, Integer schools) {
        this.cId = cId;
        this.name = name;
        this.hours = hours;
        this.schools = schools;
    }

    public Course() {
    }
}
