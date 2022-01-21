package com.devalgas.factorypattern.shape;

/**
 * @author devalgas kamga on 21/01/2022. 22:17
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
