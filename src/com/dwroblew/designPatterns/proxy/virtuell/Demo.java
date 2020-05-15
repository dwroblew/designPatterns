package com.dwroblew.designPatterns.proxy.virtuell;

import java.util.List;

public class Demo
{
   public static void main( String[] args )
   {
      CustomerList list = new CustomerListProxyImpl();
      Company company = new Company( "Bauwaren Heinz", "Sägestraße 12, München", list );
      System.out.println( company.getName() );

      List<Customer> customers = list.getCustomerList();

      customers.forEach( System.out :: println );





   }
}
