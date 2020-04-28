package com.dwroblew.designPatterns.factoryMethod.programmingTask;

public abstract class ItemFactory
{
   public abstract Item createItem( int id );

   public Item generateRandomItem()
   {
      int randomValue = (int) ( Math.random() * 2 + 1 );
      return createItem( randomValue );
   }
}
