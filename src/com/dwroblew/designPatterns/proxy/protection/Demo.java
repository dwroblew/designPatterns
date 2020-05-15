package com.dwroblew.designPatterns.proxy.protection;


public class Demo
{
   public static void main( String[] args )
   {
      DownloadProduct javaEbook = new DownloadProduct( "Java E-Book" );
      Customer damian = new Customer( "Damian" );
      javaEbook.download( damian ) ;
      javaEbook.download( damian ) ;
      javaEbook.download( damian ) ;

      DownloadProductProxy patternEbook = new DownloadProductProxy( "Design Patterns E-Book" );
      patternEbook.download( damian );
      patternEbook.download( damian );
      patternEbook.download( damian );
      patternEbook.download( damian );

   }
}
