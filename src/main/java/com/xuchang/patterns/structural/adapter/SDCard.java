package com.xuchang.patterns.structural.adapter;

public interface SDCard {
    /**
     * 读取SD卡方法
     */

    String readSD();

    /**
     * 写入SD卡功能
     */
    int writeSD(String msg);
}