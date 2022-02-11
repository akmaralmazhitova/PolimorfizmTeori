package com.company;

public class Child extends Parent{
    @Override
    public void eat() {
        super.eat();
        System.out.println("i am vegeterian.");
    }
}
