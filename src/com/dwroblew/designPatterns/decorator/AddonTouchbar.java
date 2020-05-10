package com.dwroblew.designPatterns.decorator;

public class AddonTouchbar extends MacBookAddon
{
   public AddonTouchbar( MacBook macBook )
   {
      super( macBook );
   }

   @Override
   public String getDescription()
   {
      return macBook.getDescription() + " , zusätzlich mit touchbar";
   }

   @Override
   public double getPrice()
   {
      return macBook.getPrice() + 400.00;
   }

   @Override
   public void increaseVolume()
   {
      System.out.println( "Die Lautstärke des MacBooks wurde über die Touchbar erhöht!" );

   }
}
