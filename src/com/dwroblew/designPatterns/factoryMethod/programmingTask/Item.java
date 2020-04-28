package com.dwroblew.designPatterns.factoryMethod.programmingTask;

public  abstract class Item
{
   private String name;
   private final int id;

   public Item( String name, int id )
   {
      this.name = name;
      this.id = id;
   }

   public abstract void useItem();

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public int getId()
   {
      return id;
   }

}
