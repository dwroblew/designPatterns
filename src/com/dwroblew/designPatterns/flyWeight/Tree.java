package com.dwroblew.designPatterns.flyWeight;

import java.awt.*;

public interface Tree
{
   Color getColor();

   TreeType getTreeType();

   void drawTree( int x, int y, int height );

}
