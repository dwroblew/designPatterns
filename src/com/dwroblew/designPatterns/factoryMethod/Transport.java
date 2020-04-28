package com.dwroblew.designPatterns.factoryMethod;

public abstract class Transport
{
   private String destination;

   protected abstract void transportProducts();

   protected void collectProductsFromCustomer()

   {
      System.out.println( "Die Produkte vom Kunden wurden abgeholt" );
   }

}
