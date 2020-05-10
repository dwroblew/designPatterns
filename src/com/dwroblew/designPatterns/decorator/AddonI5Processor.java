package com.dwroblew.designPatterns.decorator;

public class AddonI5Processor extends MacBookAddon
{
   public AddonI5Processor( MacBook macBook )
   {
      super( macBook );
   }

   @Override
   public String getDescription()
   {
      return macBook.getDescription() + " , zusätzlich mit I5 Processor";
   }

   @Override
   public double getPrice()
   {
      return macBook.getPrice() + 200.00;
   }

   @Override
   public void increaseVolume()
   {
      macBook.increaseVolume();

   }
}
