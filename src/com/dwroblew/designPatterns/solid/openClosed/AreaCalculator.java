package com.dwroblew.designPatterns.solid.openClosed;

public class AreaCalculator
{
   public double calculateArea( Shape[] shapes )
   {
      double area = 0;

      for ( Shape shape : shapes )
      {
         area += shape.area();
      }
      return area;
   }
}
