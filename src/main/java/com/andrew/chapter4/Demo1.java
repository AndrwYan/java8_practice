package com.andrew.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("鱼", false, 800, Dish.Type.FISH),
                new Dish("鸭", false, 800, Dish.Type.META),
                new Dish("牛肉", false, 800, Dish.Type.META),
                new Dish("狗肉", false, 800, Dish.Type.META),
                new Dish("猪肉", false, 800, Dish.Type.OTHER),
                new Dish("虎肉", false, 800, Dish.Type.META)
                );

        //stream的一系列操作
        List<String> collect = menu.stream()
                .filter(a -> a.getCalories() > 500)
                .map(Dish::getName)//取菜名
                .limit(4)
                .collect(Collectors.toList());



        System.out.println(collect);
    }
}
