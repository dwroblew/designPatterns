package com.dwroblew.designPatterns.command.commandUndo;

public class WithdrawCommand implements BankTransactionCommand
{
   private BankAccount bankAccount;
   private int amount;
   private boolean transactionSucceeded;

   public WithdrawCommand( BankAccount bankAccount, int amount )
   {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute()
   {
      transactionSucceeded = bankAccount.withdraw( amount );
   }

   @Override
   public void undo()
   {
      if ( transactionSucceeded )
      {
         bankAccount.setBalance( bankAccount.getBalance() + amount );
         System.out.println( "Auszahlung rückgängig gemacht! Neuer Kontostand: " + bankAccount.getBalance() );

      }
      else {
         System.out.println( "Undo konnte nicht durchgeführt werden " );
      }

   }
}
