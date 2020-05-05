package com.dwroblew.designPatterns.adapterPattern.exercise1;

public class SomeCompanyMailServer implements MailServer
{

   @Override
   public void connectAndSendMail( String emailAddress, String content, String receiverName )
   {
      System.out.println("Verbindung zu Mailkonto erfolgreich aufgebaut...");
      System.out.println("Die E-Mail wurde an " + emailAddress + " gesendet...");
      System.out.println("Inhalt: " + content);

   }
}
