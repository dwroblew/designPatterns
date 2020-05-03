package com.dwroblew.designPatterns.prototypPattern;

public class Employee implements Cloneable
{
   private String firstName;
   private String lastName;
   private Address address;

   public Employee( String firstName, String lastName, Address address )
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName( String firstName )
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName( String lastName )
   {
      this.lastName = lastName;
   }

   public Address getAddress()
   {
      return address;
   }

   public void setAddress( Address address )
   {
      this.address = address;
   }

   @Override
   public String toString()
   {
      return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address="
             + address + '}';
   }

   @Override
   public Employee clone()
   {
      try
      {
         var employeeCopy = (Employee) super.clone();
         employeeCopy.address = employeeCopy.address.clone();
         return employeeCopy;
      }
      catch ( CloneNotSupportedException ex )
      {
         System.out.println( "Klonen von Employee hat nicht geklappt" );
      }
      return null;

   }
}
