package com.soumya.pattern.AbstructFactoryPattern;

interface AbstructFactory {
 public abstract Shape getShape(String shapeStr);
 public abstract Color getColor(String colorStr);
}
