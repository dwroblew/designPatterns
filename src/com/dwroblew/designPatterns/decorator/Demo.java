package com.dwroblew.designPatterns.decorator;

public class Demo
{
   public static void main( String[] args )
   {
      var macbookPro = new MacBookPro();
      var macBookProTouchbar = new AddonTouchbar( macbookPro );

      System.out.println( macBookProTouchbar.getDescription());
      System.out.println(  macBookProTouchbar.getPrice());
      macBookProTouchbar.increaseVolume();

      var macBookWithTouchAndI5 = new AddonI5Processor( macBookProTouchbar );
      System.out.println( macBookWithTouchAndI5.getDescription());
      System.out.println(  macBookWithTouchAndI5.getPrice());


   }
}
