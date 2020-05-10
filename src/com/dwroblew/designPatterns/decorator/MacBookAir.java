package com.dwroblew.designPatterns.decorator;

public class MacBookAir implements MacBook
{
   @Override
   public String getDescription()
   {
      return "MacBook Air \n Standard Ausstattung";
   }

   @Override
   public double getPrice()
   {
      return 799.99;
   }

   @Override
   public void increaseVolume()
   {
      System.out.println( "Die Lautstärke des MacBook Air wurde erhöht" );
   }
}
