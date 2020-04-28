package com.dwroblew.designPatterns.factoryMethod;

public class SeeTransport extends Transport
{
   @Override
   protected void transportProducts()
   {
      System.out.println( "Die Produkte werden über den Seeweg transportiert" );
   }
}
