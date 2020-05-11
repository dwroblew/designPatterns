package com.dwroblew.designPatterns.flyWeight;

import java.util.HashMap;

public class TreeFactory
{
   private static HashMap<TreeType, Tree> treeMap = new HashMap<>();

   public static Tree getTree( TreeType treeType )
   {
      if ( !treeMap.containsKey( treeType ) )
      {
         Tree tree = null;
         switch ( treeType )
         {
            case TANNE:
               tree = new Tanne();
               System.out.println( "Tanne wurde erstellt!" );
               break;
            case BIRKE:
               tree = new Birke();
               System.out.println( "Birke wurde erstellt!" );
               break;
         }
         treeMap.put( treeType, tree );
      }
      return treeMap.get( treeType );
   }
}
