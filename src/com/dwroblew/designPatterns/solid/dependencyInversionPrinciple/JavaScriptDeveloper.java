package com.dwroblew.designPatterns.solid.dependencyInversionPrinciple;

public class JavaScriptDeveloper implements Developer
{
   @Override
   public void develop()
   {
      writeJavaScriptCode();
   }

   public void writeJavaScriptCode()
   {
      System.out.println( "Ich schreibe Java Script -Code" );
   }
}
