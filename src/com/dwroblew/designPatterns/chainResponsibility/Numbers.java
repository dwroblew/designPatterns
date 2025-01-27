package com.dwroblew.designPatterns.chainResponsibility;

public class Numbers
{
   private int number1;
   private int number2;
   private String operator;

   public Numbers( int number1, int number2, String operator )
   {
      this.number1 = number1;
      this.number2 = number2;
      this.operator = operator;
   }

   public int getNumber1()
   {
      return number1;
   }

   public void setNumber1( int number1 )
   {
      this.number1 = number1;
   }

   public int getNumber2()
   {
      return number2;
   }

   public void setNumber2( int number2 )
   {
      this.number2 = number2;
   }

   public String getOperator()
   {
      return operator;
   }

   public void setOperator( String operator )
   {
      this.operator = operator;
   }
}
