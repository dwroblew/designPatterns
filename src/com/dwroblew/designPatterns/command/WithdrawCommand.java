package com.dwroblew.designPatterns.command;

public class WithdrawCommand implements BankTransactionCommand
{
   private BankAccount bankAccount;
   private int amount;

   public WithdrawCommand( BankAccount bankAccount, int amount )
   {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute()
   {
      bankAccount.withdraw( amount );
   }
}
