package com.dwroblew.designPatterns.bridgePattern;

public class YellowRectangle implements DrawAPI
{
   @Override
   public void draw( int x, int y, int length, int width )
   {
      System.out.println( "Das gelbe Rechteck mit einer Länge von " + length + " und einer Breite von " + width
                          + " wurde erfolgreich gezeichnet!" );
   }
}
