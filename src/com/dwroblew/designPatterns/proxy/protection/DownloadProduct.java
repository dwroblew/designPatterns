package com.dwroblew.designPatterns.proxy.protection;

public class DownloadProduct implements Downloadable
{
   private String productName;

   public DownloadProduct( String productName )
   {
      this.productName = productName;
   }

   @Override
   public void download( Customer customer )
   {
      System.out.println( customer.getName() + " hat das Product" + productName + " erforgliech "
                                                                                + "heruntergeladen" );

   }
}
