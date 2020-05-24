package com.dwroblew.designPatterns.iterator;

public class Demo
{
   public static void main( String[] args )
   {
      var radio = new CarRadio();
      radio.addChannel( new Channel( "Antenne Bayern", 103.7 ) );
      radio.addChannel( new Channel( "Bayern 3", 103.7 ) );
      radio.addChannel( new Channel( "KissFm", 103.7 ) );

      var normalIterator = radio.createIterator();

      while ( normalIterator.hasNext() )
      {
         var channel = normalIterator.next();
         System.out.println( channel );
      }

   }
}
