package com.soumya.pattern.AbstructFactoryPattern;

public class FactoryProvider {
  public static AbstructFactory getFactory(String factoryName)
  {
	  if(factoryName != null && factoryName.equals("SHAPE"))
	  {
		  return new ShapeFactory();
	  }
	  else if(factoryName != null && factoryName.equals("COLOR"))
	  {
		  return new ColorFactory();
	  }
	  return null;
  }
}
