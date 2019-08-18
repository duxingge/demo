package com.example.demo.aop.domain;

public class Waiter implements Iwaiter {
    public void getMenu(){
        System.out.println("给你菜单！");
    }
    public void giveFood() {
        System.out.println("给你食物！");
    }
}
