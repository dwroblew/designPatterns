package com.dwroblew.designPatterns.abstractFactoryPattern;

public abstract class Engine
{
   private double engineSpeed;

   public abstract void revCounter();

   public double getEngineSpeed()
   {
      return engineSpeed;
   }

   public void setEngineSpeed( double engineSpeed )
   {
      this.engineSpeed = engineSpeed;
   }
}
