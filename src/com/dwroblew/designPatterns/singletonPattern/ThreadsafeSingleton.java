package com.dwroblew.designPatterns.singletonPattern;

import static java.util.Objects.isNull;

public class ThreadsafeSingleton
{
   private static ThreadsafeSingleton instance;

   private ThreadsafeSingleton()
   {
   }

   // public static synchronized ThreadsafeSingleton getInstance()
   // {
   //    if(isNull(instance))
   //       instance = new ThreadsafeSingleton();
   //    return instance;
   // }

   //double-checked logging

   public static ThreadsafeSingleton getInstance()
   {
      if ( isNull( instance ) )
      {
         synchronized ( ThreadsafeSingleton.class )
         {
            if ( isNull( instance ) )
               instance = new ThreadsafeSingleton();
         }
      }

      return instance;
   }
}
