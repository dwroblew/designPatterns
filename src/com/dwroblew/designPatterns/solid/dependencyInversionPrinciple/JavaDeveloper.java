package com.dwroblew.designPatterns.solid.dependencyInversionPrinciple;

public class JavaDeveloper implements Developer
{
   @Override
   public void develop()
   {
      writeJavaCode();

   }

   public void writeJavaCode()
   {
      System.out.println( "Ich schreibe Java-Code" );
   }
}
