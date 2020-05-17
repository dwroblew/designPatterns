package com.dwroblew.designPatterns.command;

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
}
