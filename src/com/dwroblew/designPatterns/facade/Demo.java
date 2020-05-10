package com.dwroblew.designPatterns.facade;

public class Demo
{
   public static void main( String[] args )
   {
      var bookingSystem = new FacadeLuggageManagement();
      bookingSystem.sendLuggage();
   }
}
