package com.xuchang.patterns.structural.facade;

/**
 * 定义：又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
 *
 * 外观模式定义了一个高层接口，让子系统更容易使用
 *
 * 类型：结构型
 *
 * 适用场景：
 * 子系统越来越复杂，增加外观模式提供简单接口调用
 * 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
 * 优点：
 * 简化了调用过程，无需了解深入子系统，防止带来风险
 * 减少系统依赖、松散耦合
 * 更好的划分访问层次
 * 符合迪米特法则，即最少知道原则
 *
 * 缺点：
 * 增加子系统、扩展子系统行为容易引入风险
 * 不符合开闭原则
 */
public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.onCPU();
        facade.onDDR();
        facade.onSSD();
    }

}
