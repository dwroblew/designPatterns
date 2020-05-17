package com.dwroblew.designPatterns.chainResponsibility;

public interface CalculateChain
{
   void setNextChain(CalculateChain calculateChain);
   void calculate(Numbers request);
}
