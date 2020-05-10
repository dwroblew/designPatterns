package com.dwroblew.designPatterns.facade;

public class FacadeLuggageManagement
{
   private AirportSystem airportSystem;
   private AirPlane airPlane;
   private LocalLogisticsCompany localLogisticsCompany;
   private Hotel hotel;

   public FacadeLuggageManagement()
   {
      this.airportSystem = new AirportSystem();
      this.airPlane = new AirPlane();
      this.localLogisticsCompany = new LocalLogisticsCompany();
      this.hotel = new Hotel();
   }

   public void sendLuggage()
   {
      airportSystem.checkLuggage();
      airportSystem.transportToAirplane();
      airPlane.putLuggageToPlane();
      airPlane.takeLuggageOut();
      localLogisticsCompany.putLuggageToTruck();
      localLogisticsCompany.transportToHotel();
      hotel.transportLuggageToGuest();
   }
}
