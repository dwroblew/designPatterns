package com.dwroblew.designPatterns.builder;

public abstract class HouseBuilder
{
   public abstract void buildBasement();
   public abstract void buildMaterial();
   public abstract void buildKitchen();
   public abstract void buildRoof();
   public abstract House getHouse();
}
