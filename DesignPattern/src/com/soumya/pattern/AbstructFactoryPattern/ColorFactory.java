package com.soumya.pattern.AbstructFactoryPattern;

public class ColorFactory implements AbstructFactory{
   public Color getColor(String colorStr)
   {
	   if(colorStr != null && colorStr.equals("RED"))
	   {
		   return new RedColor();
	   }
	   else if(colorStr != null && colorStr.equals("GREEN"))
	   {
		   return new GreenColor();
	   }
	   else if(colorStr != null && colorStr.equals("BLUE"))
	   {
		   return new BlueColor();
	   }
	   else
	   {
		   return () -> "No color found!!!!!!";
	   }
   }

@Override
public Shape getShape(String shapeStr) {
	// TODO Auto-generated method stub
	return null;
}
}
