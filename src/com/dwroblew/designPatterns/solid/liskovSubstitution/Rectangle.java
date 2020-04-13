package com.dwroblew.designPatterns.solid.liskovSubstitution;

public class Rectangle
{
   protected double width;
   protected double height;

   public Rectangle( double width, double height )
   {
      this.width = width;
      this.height = height;
   }

   public double area()
   {
      return width * height;
   }
   public boolean isSquare()
   {
      return width == height;
   }

   public double getWidth()
   {
      return width;
   }

   public void setWidth( double width )
   {
      this.width = width;
   }

   public double getHeight()
   {
      return height;
   }

   public void setHeight( double height )
   {
      this.height = height;
   }
}
