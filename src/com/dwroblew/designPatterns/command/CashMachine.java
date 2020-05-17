package com.dwroblew.designPatterns.command;

public class CashMachine
{
   public void executeBankTransaction( BankTransactionCommand command )
   {
      command.execute();
   }
}
