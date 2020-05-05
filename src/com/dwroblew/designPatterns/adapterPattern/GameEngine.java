package com.dwroblew.designPatterns.adapterPattern;

public class GameEngine
{
   public static void main( String[] args )
   {
      //adapterPattern
      EnemyObject orc1 = new EnemyObjectOrc();
      orc1.attack();
      orc1.sayHello();

      EnemyObject wizard1 = new AdapterWizard( new Wizard() );
      wizard1.attack();
      wizard1.sayHello();

   }
}
