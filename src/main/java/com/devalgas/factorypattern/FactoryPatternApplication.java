package com.devalgas.factorypattern;

import com.devalgas.factorypattern.shape.Shape;
import com.devalgas.factorypattern.shape.ShapeFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ShapeFactory shapeFactory = new ShapeFactory();

		//get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Circle
		shape1.draw();

		//get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//call draw method of Rectangle
		shape2.draw();

		//get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//call draw method of square
		shape3.draw();
	}
}
