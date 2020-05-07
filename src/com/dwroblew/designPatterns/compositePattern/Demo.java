package com.dwroblew.designPatterns.compositePattern;

public class Demo
{
   public static void main( String[] args )
   {
      Directory vehicle = new Directory( "vehicle" );
      File car = new File( "car", "dwroblew" );
      Directory boote = new Directory( "boote" );
      File speedBoot = new File( "speedBoot", "dwroblew" );
      File fishingBoat = new File( "fishing boat", "dwroblew" );

      boote.add( speedBoot );
      boote.add( fishingBoat );
      vehicle.add( car );
      vehicle.add( boote );

      vehicle.print("");

   }
}
