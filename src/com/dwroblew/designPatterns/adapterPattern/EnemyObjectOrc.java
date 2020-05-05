package com.dwroblew.designPatterns.adapterPattern;

public class EnemyObjectOrc implements EnemyObject
{
   private String name;
   private String health;


   @Override
   public void attack()
   {
    System.out.println( "Der Ork greift an!!!" );
   }

   @Override
   public void sleep()
   {
      System.out.println( "Der Ork hat sich schlafen gelegt!" );
   }

   @Override
   public void sayHello()
   {
      System.out.println( "Der Ork sagt Hallo! Achtung: Das könnte eine Falle sein....." );
   }
}
