package com.xuchang.patterns.creational.factorymethod;

/**
 * 圆
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}