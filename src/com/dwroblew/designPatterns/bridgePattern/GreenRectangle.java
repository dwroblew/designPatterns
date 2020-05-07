package com.dwroblew.designPatterns.bridgePattern;

public class GreenRectangle implements DrawAPI
{
   @Override
   public void draw( int x, int y, int length, int width )
   {
      System.out.println( "Das grüne Rechteck mit einer Länge von " + length + " und einer Breite von " + width
                          + " wurde erfolgreich gezeichnet!" );
   }
}
