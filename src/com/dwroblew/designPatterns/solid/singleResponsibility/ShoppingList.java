package com.dwroblew.designPatterns.solid.singleResponsibility;

import java.util.ArrayList;

public class ShoppingList
{
   private ArrayList<String> entries = new ArrayList<>();
   private static int count = 0;

   public ArrayList<String> getEntries()
   {
      return entries;
   }

   public void setEntries( ArrayList<String> entries )
   {
      this.entries = entries;
   }

   public void addEntry( String text )
   {
      entries.add( ( count++ ) + ": " + text );

   }

   public void removeEntry( int index )
   {
      entries.remove( index );
   }

   public static void shoppingList()
   {
      var list = new ShoppingList();
      list.addEntry( "apple" );
      list.addEntry( "banana" );
      list.addEntry( "cucumber" );

      System.out.println( list );
   }


   @Override
   public String toString()
   {
      var shoppingList = new StringBuilder( "ShoppingList: \n" );

      for ( String e : entries )
      {
         shoppingList.append( e ).append( " \n" );
      }
      return shoppingList.toString();
   }
}
