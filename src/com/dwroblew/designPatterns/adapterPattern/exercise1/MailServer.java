package com.dwroblew.designPatterns.adapterPattern.exercise1;

public interface MailServer
{

   void connectAndSendMail( String emailAddress, String content, String receiverName );

}
