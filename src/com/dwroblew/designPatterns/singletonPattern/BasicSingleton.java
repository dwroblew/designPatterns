package com.dwroblew.designPatterns.singletonPattern;

public class BasicSingleton
{
   private static final BasicSingleton instance = new BasicSingleton();

   private BasicSingleton()
   {
      System.out.println( "Das BasicSingleton wurde erstellt!" );
   }

   public static BasicSingleton getInstance()
   {
      return instance;
   }
}
