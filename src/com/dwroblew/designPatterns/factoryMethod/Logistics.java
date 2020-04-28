package com.dwroblew.designPatterns.factoryMethod;

public abstract class Logistics
{
   //Delegation an die Subklasse (Erzeugung des konkreten Objekts )
   protected abstract Transport transportFactory( String transportType );

   public void manageTransportFactory( String transportType )
   {
      var transport = transportFactory( transportType );

      transport.collectProductsFromCustomer();
      transport.transportProducts();

   }
}
