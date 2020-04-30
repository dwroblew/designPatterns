package com.dwroblew.designPatterns.abstractFactoryPattern;

public abstract class Regulator
{
   private double currentVoltage;
   private double currentCurrent;

   public abstract void increaseVoltage();

   public double getCurrentVoltage()
   {
      return currentVoltage;
   }

   public void setCurrentVoltage( double currentVoltage )
   {
      this.currentVoltage = currentVoltage;
   }

   public double getCurrentCurrent()
   {
      return currentCurrent;
   }

   public void setCurrentCurrent( double currentCurrent )
   {
      this.currentCurrent = currentCurrent;
   }
}
