package com.dwroblew.designPatterns.decorator;

public abstract class MacBookAddon implements MacBook
{
   protected MacBook macBook;

   public MacBookAddon( MacBook macBook )
   {
      this.macBook = macBook;
   }
}
