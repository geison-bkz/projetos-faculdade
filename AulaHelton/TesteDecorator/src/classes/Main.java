package classes;

import utils.RedShapeDecorator;

public class Main {
	public static void main(String[] args) {
		RedShapeDecorator redShape = new RedShapeDecorator(new Circle());
		redShape.draw();
	}
	
}
