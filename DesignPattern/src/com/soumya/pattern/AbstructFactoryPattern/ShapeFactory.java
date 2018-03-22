package com.soumya.pattern.AbstructFactoryPattern;

import com.soumya.pattern.AbstructFactoryPattern.Circle;
import com.soumya.pattern.AbstructFactoryPattern.Shape;
import com.soumya.pattern.AbstructFactoryPattern.Squre;
import com.soumya.pattern.AbstructFactoryPattern.Triangle;

public class ShapeFactory implements AbstructFactory{
  public Shape getShape(String shapeName)
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

	@Override
	public Color getColor(String colorStr) {
		return () -> "No Color Avalilable.....";
	}

}
