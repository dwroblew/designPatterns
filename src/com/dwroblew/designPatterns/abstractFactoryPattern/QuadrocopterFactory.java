package com.dwroblew.designPatterns.abstractFactoryPattern;

public abstract class QuadrocopterFactory
{
   public abstract Regulator createRegulator();
   public abstract Engine createEngine();
}
