package com.dwroblew.designPatterns.flyWeight;

import java.awt.*;

public class Tanne implements Tree
{
   private Color color;
   private TreeType treeType;

   public Tanne()
   {
      this.color = Color.GREEN;
      this.treeType = TreeType.TANNE;
   }

   @Override
   public Color getColor()
   {
      return color;
   }

   @Override
   public TreeType getTreeType()
   {
      return treeType;
   }

   @Override
   public void drawTree( int x, int y, int height )
   {
      System.out.println( "Tanne wurde an Position(" + x + "/" + y + ") mit einer Höhe von  " + height + " "
                          + "gezeichnet!");
   }
}
