package com.dwroblew.designPatterns.iterator;


public interface ChannelCollection
{
   void addChannel( Channel c);
   void removeChannel( Channel c);
   ChannelIterator createIterator();
}
