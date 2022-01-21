package com.devalgas.factorypattern.shape;

/**
 * @author devalgas kamga on 21/01/2022. 22:16
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
