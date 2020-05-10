package com.dwroblew.designPatterns.decorator;

public class MacBookPro implements MacBook
{
   @Override
   public String getDescription()
   {
      return "MacBookPro \n  Standard Ausstattung";
   }

   @Override
   public double getPrice()
   {
      return 1199.99;
   }

   @Override
   public void increaseVolume()
   {
      System.out.println( "Die Lautstärke des MacBookPro's wurde erhöht" );

   }
}
