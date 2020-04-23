package com.dwroblew.designPatterns.builder;

public class CivilEngineer
{
   private HouseBuilder houseBuilder;

   public CivilEngineer( HouseBuilder houseBuilder )
   {
      this.houseBuilder = houseBuilder;
   }

   public void constructHouse()
   {
      this.houseBuilder.buildBasement();
      this.houseBuilder.buildKitchen();
      this.houseBuilder.buildMaterial();
      this.houseBuilder.buildRoof();

   }

   public House getHouse()
   {
      return this.houseBuilder.getHouse();
   }
}
