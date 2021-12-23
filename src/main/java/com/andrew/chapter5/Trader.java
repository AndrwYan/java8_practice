package com.andrew.chapter5;

/*
* 测试Stream的api需要用到的领域
* 交易和交易员
* */
public class Trader {

    private final String name;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    private final String city;

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
