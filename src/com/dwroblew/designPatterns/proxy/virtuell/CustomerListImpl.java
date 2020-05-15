package com.dwroblew.designPatterns.proxy.virtuell;

import java.util.ArrayList;
import java.util.List;

public class CustomerListImpl implements CustomerList
{
   @Override
   public List<Customer> getCustomerList()
   {
      List<Customer> customers = new ArrayList<>(  );
      customers.add( new Customer( "Damian","Weidenweg 2-6",true ) );
      customers.add( new Customer( "Alexa","Weidenweg 2-6",false ) );
      System.out.println( "Datenbankanfrage wurde durchgeführt!" );
      return customers;
   }
}
