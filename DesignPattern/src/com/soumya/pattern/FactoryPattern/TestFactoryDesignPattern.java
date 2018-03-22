package com.soumya.pattern.FactoryPattern;

public class TestFactoryDesignPattern {

	public static void main(String[] args) {
		System.out.println("--------------Factory Pattern Test-----------------");
		Shape shape = null;
		shape = ShapeFactory.drawShape("CIRCLE");
		System.out.println(shape.draw());
		shape = ShapeFactory.drawShape("SQUARE");
		System.out.println(shape.draw());
		shape = ShapeFactory.drawShape("TRIANGLE");
		System.out.println(shape.draw());
		shape = ShapeFactory.drawShape("WEIRED");
		System.out.println(shape.draw());

	}

}
