package com.soumya.pattern.FactoryPattern;

public class ShapeFactory {
  public static Shape drawShape(String shapeName)
  {
	  if(shapeName != null && shapeName.equals("CIRCLE"))
	  {
		  return new Circle();
	  }
	  else if(shapeName != null && shapeName.equals("SQUARE"))
	  {
		  return new Squre();
	  }
	  else if(shapeName != null && shapeName.equals("TRIANGLE"))
	  {
		  return new Triangle();
	  }
	  else
	  {
		  return () -> "No Shape Avalilable.....";
	  }
	  
  }
}
