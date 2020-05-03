package com.dwroblew.designPatterns.prototypPattern;

public class Address implements Cloneable
{
   private String street;
   private int houseNumber;
   private String plz;

   public Address( String street, int houseNumber, String plz )
   {
      this.street = street;
      this.houseNumber = houseNumber;
      this.plz = plz;
   }

   public String getStreet()
   {
      return street;
   }

   public void setStreet( String street )
   {
      this.street = street;
   }

   public int getHouseNumber()
   {
      return houseNumber;
   }

   public void setHouseNumber( int houseNumber )
   {
      this.houseNumber = houseNumber;
   }

   public String getPlz()
   {
      return plz;
   }

   public void setPlz( String plz )
   {
      this.plz = plz;
   }

   @Override
   public String toString()
   {
      return "Address{" + "street='" + street + '\'' + ", houseNumber=" + houseNumber + ", plz='" + plz + '\''
             + '}';
   }

   @Override
   public Address clone()
   {
      try
      {
         return (Address) super.clone();
      }
      catch ( CloneNotSupportedException ex )
      {
         System.out.println( "Adresse konnte nicht geklonnt werden" );
      }
      return null;
   }
}
