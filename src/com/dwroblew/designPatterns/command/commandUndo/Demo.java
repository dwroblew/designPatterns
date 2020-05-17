package com.dwroblew.designPatterns.command.commandUndo;

public class Demo
{
   public static void main( String[] args )
   {
      var olaAccount = new BankAccount();
      System.out.println( "Bankkonto erfolgreich eröffnet: " + olaAccount );

      var cashMachine = new CashMachine();
      var command1 = new DepositCommand( olaAccount, 2000 );
      var command2 = new WithdrawCommand( olaAccount, 5000 );
      var command3 = new DepositCommand( olaAccount, 2000 );

      cashMachine.executeBankTransaction( command2 );
      cashMachine.undoBankTransaction( command2 );
      // cashMachine.executeBankTransaction( command2 );
      // cashMachine.executeBankTransaction( command3 );



   }
}
