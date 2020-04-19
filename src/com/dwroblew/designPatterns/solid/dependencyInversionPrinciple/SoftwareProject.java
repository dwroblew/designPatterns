package com.dwroblew.designPatterns.solid.dependencyInversionPrinciple;

   import java.util.List;

public class SoftwareProject
{
   private List<Developer> developers;

   public SoftwareProject( List<Developer> developers )
   {
      this.developers = developers;
   }

   public void implement()
   {
      for ( Developer dev : developers )
      {
         dev.develop();
      }
   }
}
