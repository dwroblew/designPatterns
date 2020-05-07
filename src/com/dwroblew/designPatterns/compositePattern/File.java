package com.dwroblew.designPatterns.compositePattern;

public class File extends FileSystemComponent
{
   private String owner;

   public File( String name,String owner )
   {
      this.setName( name );
      this.owner = owner;
   }

   @Override
   public void print(String spacing )
   {
      System.out.println( spacing + this.getName() + " (Ersteller: " + this.owner + ")" );
   }

   public String getOwner()
   {
      return owner;
   }

   public void setOwner( String owner )
   {
      this.owner = owner;
   }
}
