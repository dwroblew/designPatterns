package com.dwroblew.designPatterns.abstractFactoryPattern;

public class FlyRegulator extends Regulator
{
   public FlyRegulator()
   {
      System.out.println( "Der FlyRegulator wurde erfolgreich erzeugt" );
   }

   @Override
   public void increaseVoltage()
   {
      System.out.println( "Die Spannung des FlyRegulator wurde um 10v erhöht" );
   }
}
