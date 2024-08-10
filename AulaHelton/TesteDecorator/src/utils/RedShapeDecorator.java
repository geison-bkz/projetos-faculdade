package utils;

import interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decorarShape) {
		super(decorarShape);
	}

	public void setRedBorder() {
		System.out.println("Borda Vermelha");
	}

	@Override
	public void draw() {
		decoratorShape.draw();
		setRedBorder();
	}

}
