package com.dwroblew.designPatterns.abstractFactoryPattern;

public class ControllerBoard
{
   private QuadrocopterFactory usedFactory;
   private Regulator regulator;
   private Engine engine;

   public ControllerBoard( QuadrocopterFactory usedFactory )
   {
      this.usedFactory = usedFactory;
      createQuadrocpoterParts();
   }

   private void createQuadrocpoterParts()
   {
      regulator = usedFactory.createRegulator();
      engine = usedFactory.createEngine();
   }
}
