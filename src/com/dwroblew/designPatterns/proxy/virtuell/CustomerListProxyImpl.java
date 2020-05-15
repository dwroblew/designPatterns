package com.dwroblew.designPatterns.proxy.virtuell;

import java.util.List;

import static java.util.Objects.isNull;

public class CustomerListProxyImpl implements CustomerList
{
   private CustomerList customerList;

   @Override
   public List<Customer> getCustomerList()
   {
      if ( isNull( customerList ) )
      {
         System.out.println( "Die Kundenliste wird erzeugt und Daten werden aus der Datenbank geladen." );
         customerList = new CustomerListImpl();
      }
      return customerList.getCustomerList();
   }
}
