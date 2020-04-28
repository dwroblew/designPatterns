package com.dwroblew.designPatterns.factoryMethod.programmingTask;

public class Shield extends Item
{
   private int defenseValue;

   public Shield( String name, int id, int defenseValue )
   {
      super( name, id );
      this.defenseValue = defenseValue;
   }

   @Override
   public void useItem()
   {
      System.out.println( "das Schild mit dem Namen " + this.getName() + " hat einen " +
                          "Verteidigungswert von " + this.getDefenseValue() + " Punkten.");

   }

   public int getDefenseValue()
   {
      return defenseValue;
   }

   public void setDefenseValue( int defenseValue )
   {
      this.defenseValue = defenseValue;
   }
}
