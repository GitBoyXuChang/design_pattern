package com.xuchang.patterns.creational.simplefactory;

/**
 * 正方形
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}