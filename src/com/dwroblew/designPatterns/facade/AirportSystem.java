package com.dwroblew.designPatterns.facade;

public class AirportSystem
{
   public void checkLuggage()
   {
      System.out.println("Das Gepäck wird aufgegeben...");
   }

   public void transportToAirplane()
   {
      System.out.println("Das Gepäck wird zum richtigen Flugzeug transportiert....");
   }
}
