package com.dwroblew.designPatterns.abstractFactoryPattern;

public class FlyFactory extends QuadrocopterFactory
{
   @Override
   public Regulator createRegulator()
   {
      return new FlyRegulator();
   }

   @Override
   public Engine createEngine()
   {
      return new FlyEngine();
   }
}
