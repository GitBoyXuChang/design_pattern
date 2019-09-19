package com.xuchang.patterns.structural.decorator;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
