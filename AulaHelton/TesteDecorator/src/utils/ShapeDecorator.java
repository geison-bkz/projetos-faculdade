package utils;

import interfaces.Shape;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratorShape;

	public ShapeDecorator(Shape decorarShape) {
		this.decoratorShape = decorarShape;
	}

	public void draw() {
		decoratorShape.draw();
	}

}
