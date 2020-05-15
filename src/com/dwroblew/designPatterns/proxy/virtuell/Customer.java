package com.dwroblew.designPatterns.proxy.virtuell;

public class Customer
{
   private String name;
   private String address;
   private boolean bonusCard;

   public Customer( String name, String address, boolean bonusCard )
   {
      this.name = name;
      this.address = address;
      this.bonusCard = bonusCard;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress( String address )
   {
      this.address = address;
   }

   public boolean isBonusCard()
   {
      return bonusCard;
   }

   public void setBonusCard( boolean bonusCard )
   {
      this.bonusCard = bonusCard;
   }

   @Override
   public String toString()
   {
      return "Customer{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", bonusCard="
             + bonusCard + '}';
   }
}
