package com.dwroblew.designPatterns.iterator;

public class Channel
{
   private String name;
   private double frequenzy;

   public Channel( String name, double frequenzy )
   {
      this.name = name;
      this.frequenzy = frequenzy;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public double getFrequenzy()
   {
      return frequenzy;
   }

   public void setFrequenzy( double frequenzy )
   {
      this.frequenzy = frequenzy;
   }

   @Override
   public String toString()
   {
      return "Du hörst gerade " + name + " (Frequenz: " + frequenzy + ")";
   }
}
