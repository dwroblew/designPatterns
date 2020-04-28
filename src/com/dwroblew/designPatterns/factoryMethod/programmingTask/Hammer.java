package com.dwroblew.designPatterns.factoryMethod.programmingTask;

public class Hammer extends Item
{
   private int attackValue;

   public Hammer( String name, int id, int attackValue )
   {
      super( name, id );
      this.attackValue = attackValue;
   }

   @Override
   public void useItem()
   {
      System.out.println(
         "Der Hammer mit dem Namen " + this.getName() + " hat einen " + "Angriffswert von " + this.attackValue
         + " Punkten." );

   }

   public int getAttackValue()
   {
      return attackValue;
   }

   public void setAttackValue( int attackValue )
   {
      this.attackValue = attackValue;
   }
}
