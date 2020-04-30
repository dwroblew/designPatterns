package com.dwroblew.designPatterns.abstractFactoryPattern;

public class QuadroEngine extends  Engine
{
   public QuadroEngine()
   {
      System.out.println( "Die QuadroEngine wurde erfolgreich erzeugt" );
   }

   @Override
   public void revCounter()
   {
      System.out.println( "Die aktuelle Drehzahl der QuadroEngine beträgt 300 Umdrehungen/Minute"  );
   }
}
