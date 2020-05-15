package com.dwroblew.designPatterns.proxy.virtuell;

public class Company
{
   private String name;
   private String address;
   private CustomerList listOfCCustomers;

   public Company( String name, String address, CustomerList listOfCCustomers )
   {
      this.name = name;
      this.address = address;
      this.listOfCCustomers = listOfCCustomers;
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

   public CustomerList getListOfCCustomers()
   {
      return listOfCCustomers;
   }

   public void setListOfCCustomers( CustomerList listOfCCustomers )
   {
      this.listOfCCustomers = listOfCCustomers;
   }
}
