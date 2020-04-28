package com.dwroblew.designPatterns.factoryMethod;

public class SeaStreetFlightLogistics extends Logistics
{
   @Override
   protected Transport transportFactory( String transportType )
   {
      if ( transportType.equals( "see" ) )
      {
         return new SeeTransport();

      }
      else if ( transportType.equals( "flight" ) )
      {
         return new FlightTransport();
      }
      else if ( transportType.equals( "street" ) )
      {
         return new StreetTransport();
      }
      else
      {
         System.out.println( "Ungültiger Transport Typ" );
         return null;
      }

   }
}
