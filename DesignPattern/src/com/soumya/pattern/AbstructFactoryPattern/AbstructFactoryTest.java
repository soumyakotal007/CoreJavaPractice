package com.soumya.pattern.AbstructFactoryPattern;



public class AbstructFactoryTest {
 public static void main(String[] args) {
	System.out.println("-------------Abstruct factory test-------------------");

	AbstructFactory shapeFactory = FactoryProvider.getFactory("SHAPE");
	Shape shape = null;
	shape = shapeFactory.getShape("CIRCLE");
	System.out.println(shape.draw());
	shape = shapeFactory.getShape("SQUARE");
	System.out.println(shape.draw());
	shape = shapeFactory.getShape("TRIANGLE");
	System.out.println(shape.draw());
	shape = shapeFactory.getShape("WEIRED");
	System.out.println(shape.draw());
	
	AbstructFactory colorFactory = FactoryProvider.getFactory("COLOR");
	Color color = null;
	color = colorFactory.getColor("RED");
    System.out.println(color.getColor());
    
    color = colorFactory.getColor("GREEN");
    System.out.println(color.getColor());
    
    color = colorFactory.getColor("BLUE");
    System.out.println(color.getColor());
    
    color = colorFactory.getColor("GANGBANG");
    System.out.println(color.getColor());
}
}
