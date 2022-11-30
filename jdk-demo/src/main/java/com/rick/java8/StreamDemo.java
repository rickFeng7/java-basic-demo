package com.rick.java8;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fengrui03
 * @date 2022/11/15
 */
public class StreamDemo {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Person p1 = new Person().setName("张三").setAge(18);
        Person p2 = new Person().setName("李四").setAge(19);
        Person p3 = new Person().setName("张三").setAge(18);
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        // 根据equals去重，需重写toString方法
        List<Person> list = people.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    @Data
    @Accessors(chain = true)
    static class Person {
        private String name;
        private int age;

    }
}
