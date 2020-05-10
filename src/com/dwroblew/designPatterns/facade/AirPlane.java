package com.dwroblew.designPatterns.facade;

public class AirPlane
{
   public void putLuggageToPlane()
   {
      System.out.println( "Das Gepäck wird in das Flugzeug eingeladen ..." );
   }

   public void takeLuggageOut()
   {
      System.out.println( "Das Gepäck wird aus dem Flugzeug ausgeladen...." );

   }
}
