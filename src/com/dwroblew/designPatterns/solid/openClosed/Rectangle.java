package com.dwroblew.designPatterns.solid.openClosed;

public class Rectangle extends Shape
{
   private double width;
   private double height;

   public Rectangle( double width, double height )
   {
      this.width = width;
      this.height = height;
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

   public static Rectangle[] rectangles()
   {
      var rec1 = new Rectangle( 1, 2 );
      var rec2 = new Rectangle( 5, 5 );
      var rec3 = new Rectangle( 2, 4 );
      var rec4 = new Rectangle( 2, 6 );

      return new Rectangle[] { rec1, rec2, rec3, rec4 };

   }

   @Override
   public double area()
   {
      return width * height;
   }
}
