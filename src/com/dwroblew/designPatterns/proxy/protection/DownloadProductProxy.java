package com.dwroblew.designPatterns.proxy.protection;

public class DownloadProductProxy implements Downloadable
{
   private final int NUM_DOWNLOADS_ALLOWED = 3;
   private int numberDownloads = 0;
   private DownloadProduct downloadProduct;

   public DownloadProductProxy( String name )
   {
      this.downloadProduct = new DownloadProduct( name );
   }

   @Override
   public void download( Customer customer )
   {
      if ( numberDownloads < NUM_DOWNLOADS_ALLOWED )
      {
         numberDownloads++;
         downloadProduct.download( customer );

      }
      else
      {
         System.out.println( customer.getName() + " hat das Produckt schon 3x heruntergeladen" );
      }
   }
}
