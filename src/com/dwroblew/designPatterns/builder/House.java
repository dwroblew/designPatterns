package com.dwroblew.designPatterns.builder;

public class House
{
   private String basement;
   private String material;
   private String kitchen;
   private String roof;

   public void setBasement( String basement )
   {
      this.basement = basement;
   }

   public void setMaterial( String material )
   {
      this.material = material;
   }

   public void setKitchen( String kitchen )
   {
      this.kitchen = kitchen;
   }

   public void setRoof( String roof )
   {
      this.roof = roof;
   }

   @Override
   public String toString()
   {
      return "House{" + "basement='" + basement + '\'' + ", material='" + material + '\'' + ", kitchen='"
             + kitchen + '\'' + ", roof='" + roof + '\'' + '}';
   }
}
