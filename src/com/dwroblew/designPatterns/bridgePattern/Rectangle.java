package com.dwroblew.designPatterns.bridgePattern;

public class Rectangle extends Shape
{
   private int x;
   private int y;
   private int length;
   private int width;

   public Rectangle( DrawAPI drawAPI, int x, int y, int length, int width )
   {
      super( drawAPI );
      this.x = x;
      this.y = y;
      this.length = length;
      this.width = width;
   }

   @Override
   public void draw()
   {
      drawAPI.draw( x,y,length,width );

   }
}
