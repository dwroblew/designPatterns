package com.dwroblew.designPatterns.chainResponsibility;

public class Demo
{
   public static void main( String[] args )
   {
      CalculateChain chain1 = new AddOperation();
      CalculateChain chain2 = new SubtractOperation();
      CalculateChain chain3 = new MultiplyOperation();
      CalculateChain chain4 = new DivideOperation();

      chain1.setNextChain( chain2 );
      chain2.setNextChain( chain3 );
      chain3.setNextChain( chain4 );

      Numbers request = new Numbers( 10, 2, "/" );

      chain1.calculate( request );

   }
}
