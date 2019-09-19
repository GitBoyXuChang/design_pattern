package com.xuchang.patterns.behavioral.strategy;


/**
 * 策略模式
 * 定义：定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户
 * 类型：行为性
 * 适用场景：
 * 系统有很多类，而他们的区别仅仅在于他们的行为不同
 * 一个系统需要动态地在几种算法中选择一种
 * 优点：
 * 符合开闭原则
 * 避免使用多重条件转移语句
 * 提高算法的保密性和安全性
 * 缺点：
 * 客户端必须知道所有的策略类，并自行决定使用哪个策略类
 * 产生很多策略类
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();



    }


}
