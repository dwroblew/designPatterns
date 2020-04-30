package com.dwroblew.designPatterns.abstractFactoryPattern;

public class QuadroFactory extends QuadrocopterFactory
{
   @Override
   public Regulator createRegulator()
   {
      return new QuadroRegulator();
   }

   @Override
   public Engine createEngine()
   {
      return new QuadroEngine();
   }
}
