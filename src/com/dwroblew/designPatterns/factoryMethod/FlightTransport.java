package com.dwroblew.designPatterns.factoryMethod;

public class FlightTransport extends Transport
{
   @Override
   protected void transportProducts()
   {
      System.out.println( "Die Produkte werden über den Flugweg transportiert" );
   }
}
