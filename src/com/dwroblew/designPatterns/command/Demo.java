package com.dwroblew.designPatterns.command;

public class Demo
{
   public static void main( String[] args )
   {
      var damianAccount = new BankAccount();
      System.out.println( "Bankkonto erfolgreich eröffnet: " + damianAccount );

      var cashMachine = new CashMachine();
      var command1 = new DepositCommand( damianAccount,2000 );
      var command2 = new WithdrawCommand( damianAccount,5000 );
      var command3 = new DepositCommand( damianAccount,2000 );

      cashMachine.executeBankTransaction( command1 );
      cashMachine.executeBankTransaction( command2 );
      cashMachine.executeBankTransaction( command3 );



   }
}
