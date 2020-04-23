package com.dwroblew.designPatterns.builder;

public class WoodHouseBuilder extends HouseBuilder
{
   private House house;

   public WoodHouseBuilder()
   {
      this.house = new House();
   }

   @Override
   public void buildBasement()
   {
      house.setBasement( "Keller aus Stein, mit Strom- und Wasserleitungen" );

   }

   @Override
   public void buildMaterial()
   {
      house.setMaterial( "Holzlatten" );
   }

   @Override
   public void buildKitchen()
   {
      house.setKitchen( "Küche mit edlen Holzelementen" );

   }

   @Override
   public void buildRoof()
   {
      house.setRoof( "Holzdach" );

   }

   @Override
   public House getHouse()
   {
      return this.house;
   }
}
