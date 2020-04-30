package com.dwroblew.designPatterns.singletonPattern;

import static java.util.Objects.isNull;

public class LazySingleton
{
   private static LazySingleton instance;

   private LazySingleton()
   {
      System.out.println( "Das LazySingleton wurde erstellt!" );
   }

   public static LazySingleton getInstance()
   {
      if ( isNull( instance ) )
         instance = new LazySingleton();

      return instance;
   }


}
