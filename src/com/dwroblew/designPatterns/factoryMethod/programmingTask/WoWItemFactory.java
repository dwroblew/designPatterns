package com.dwroblew.designPatterns.factoryMethod.programmingTask;

public class WoWItemFactory extends ItemFactory
{
   @Override
   public Item createItem( int id )
   {
      if ( id == 1 )
      {
         return new Shield( "Gottesschield", 1, 30 );
      }
      else if ( id == 2 )
      {
         return new Hammer( "Kriegshammer", 2, 40 );
      }
      else
      {
         System.out.println( "Fehler..." );
         return null;
      }
   }
}
