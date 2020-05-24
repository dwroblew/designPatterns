package com.dwroblew.designPatterns.iterator;

import java.util.ArrayList;

public class CarRadio implements ChannelCollection
{
   ArrayList<Channel> channels;

   public CarRadio()
   {
      this.channels = new ArrayList<>();
   }

   @Override
   public void addChannel( Channel c )
   {
      channels.add( c );

   }

   @Override
   public void removeChannel( Channel c )
   {
      channels.remove( c );

   }

   @Override
   public ChannelIterator createIterator()
   {
      return new ChannelIteratorShuffle( channels );
   }
}
