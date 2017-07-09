package com.techlabs.factory.shape_creator;

import com.techlabs.factory.shape.Circle;
import com.techlabs.factory.shape.Shape;
import com.techlabs.factory.shape.Rectangle;
import com.techlabs.factory.shape.Square;

public class ShapeCreator {

	public Shape getShape(String shapeType) {

		shapeType = shapeType.toLowerCase();

		if (shapeType.equals("circle"))
			return new Circle();
		if (shapeType.equals("rectangle"))
			return new Rectangle();
		if (shapeType.equals("square"))
			return new Square();

		return null;
	}
}
