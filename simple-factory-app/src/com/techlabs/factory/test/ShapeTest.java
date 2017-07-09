package com.techlabs.factory.test;

import com.techlabs.factory.shape.Shape;
import com.techlabs.factory.shape_creator.ShapeCreator;

public class ShapeTest {

	public static void drawShape(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {

		ShapeCreator shapeCreator = new ShapeCreator();

		Shape shape1 = shapeCreator.getShape("CIRCLE");
		Shape shape2 = shapeCreator.getShape("RECTANGLE");
		Shape shape3 = shapeCreator.getShape("SQUARE");

		drawShape(shape1);
		drawShape(shape2);
		drawShape(shape3);
	}
}
