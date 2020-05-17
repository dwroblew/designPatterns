package com.dwroblew.designPatterns.command.commandUndo;

public interface BankTransactionCommand
{
   void execute();
   void undo();
}
