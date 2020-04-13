package com.dwroblew.designPatterns.solid.openClosed;

public class Circle extends Shape
{
   private double radius;

   public Circle( double radius )
   {
      this.radius = radius;
   }

   public double getRadius()
   {
      return radius;
   }

   public void setRadius( double radius )
   {
      this.radius = radius;
   }

   public static Circle[] circles()
   {
      var c1 = new Circle( 2 );
      var c2 = new Circle( 5 );

      return new Circle[] { c1, c2 };

   }

   @Override
   public double area()
   {
      return radius * radius * Math.PI;
   }
}
