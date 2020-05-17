package com.dwroblew.designPatterns.command.commandUndo;

import java.util.ArrayList;
import java.util.List;

public class CashMachine
{
   private List<BankTransactionCommand> commands = new ArrayList<>();

   public void executeBankTransaction( BankTransactionCommand command )
   {
      command.execute();
      //in Datenbank schreiben
      commands.add( command );
   }

   public void undoBankTransaction( BankTransactionCommand command )
   {
      command.undo();
   }
}
