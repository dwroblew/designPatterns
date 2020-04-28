package com.dwroblew.designPatterns.factoryMethod;

public class StreetTransport extends Transport
{
   @Override
   protected void transportProducts()
   {
      System.out.println( "Die Produkte werden über den Straßenweg transportiert" );
   }
}
