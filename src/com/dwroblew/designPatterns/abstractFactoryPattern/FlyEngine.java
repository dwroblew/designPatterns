package com.dwroblew.designPatterns.abstractFactoryPattern;

public class FlyEngine extends Engine
{
   public FlyEngine()
   {
      System.out.println( "Die FlyEngine wurde erfolgreich erzeugt" );
   }

   @Override
   public void revCounter()
   {
      System.out.println( "Die aktuelle Drehzahl der FlyEngine beträgt 100 Umdrehungen/Minute"  );
   }
}
