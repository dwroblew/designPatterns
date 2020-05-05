package com.dwroblew.designPatterns.adapterPattern.exercise1;

public class AdapterGoogleMail implements MailServer
{
   private GoogleMailServer server;

   public AdapterGoogleMail( GoogleMailServer server )
   {
      this.server = server;
   }

   @Override
   public void connectAndSendMail( String emailAddress, String content, String receiverName )
   {
      server.buildConnection();
      server.sendEmail( emailAddress,content );

   }
}
