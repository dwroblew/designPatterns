package com.dwroblew.designPatterns.abstractFactoryPattern;

public class QuadroRegulator extends Regulator
{
   public QuadroRegulator()
   {
      System.out.println( "Der QuadroRegulator wurde erfolgreich erzeugt" );
   }

   @Override
   public void increaseVoltage()
   {
      System.out.println( "Die Spannung des QuadroRegulator wurde um 10v erhöht" );

   }
}
