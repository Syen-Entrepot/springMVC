package com.cn.pojo;

/**
 * @author Syen
 * @date 2019/7/28 0028-上午 0:05
 */
public class Order {
    private  String id;
    private  String name;
    private Double totel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotel() {
        return totel;
    }

    public void setTotel(Double totel) {
        this.totel = totel;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totel=" + totel +
                '}';
    }
}
