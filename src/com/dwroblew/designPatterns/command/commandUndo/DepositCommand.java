package com.dwroblew.designPatterns.command.commandUndo;

public class DepositCommand implements BankTransactionCommand
{
   private BankAccount bankAccount;
   private int amount;

   public DepositCommand( BankAccount bankAccount, int amount )
   {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute()
   {
      bankAccount.deposit( amount );
   }

   @Override
   public void undo()
   {
      bankAccount.setBalance( bankAccount.getBalance() - amount );
      System.out.println( "Einzahlung rückgängig gemacht! Neuer Kontostand: " + bankAccount.getBalance() );
   }

}
