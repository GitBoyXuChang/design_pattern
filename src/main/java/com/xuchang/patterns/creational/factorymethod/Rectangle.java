package com.xuchang.patterns.creational.factorymethod;

/**
 * 矩形
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("画一个矩形");
   }
}