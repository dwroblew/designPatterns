package com.dwroblew.designPatterns.singletonPattern;

import static java.util.Objects.isNull;

public class StandardInterestRate
{
   private static StandardInterestRate instance;
   private double interestRate;

   private StandardInterestRate()
   {
      this.interestRate = 3.0;
   }

   public static StandardInterestRate getInstance(  )
   {
      if ( isNull( instance ) )
         instance = new StandardInterestRate();

      return instance;
   }

   public double getInterestRate()
{
   return interestRate;
}

   public void setInterestRate( double interestRate )
   {
      this.interestRate = interestRate;
   }
}
