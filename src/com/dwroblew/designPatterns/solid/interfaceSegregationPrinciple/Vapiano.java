package com.dwroblew.designPatterns.solid.interfaceSegregationPrinciple;

public class Vapiano implements Payment, Order ,RatingService
{
   @Override
   public void payCreditCard()
   {
   }

   @Override
   public void payCash()
   {
   }

   @Override
   public void paySmartphone()
   {
   }

   @Override
   public void customerRatingService()
   {
   }

   @Override
   public void takeTelephoneOrder()
   {
   }
}
