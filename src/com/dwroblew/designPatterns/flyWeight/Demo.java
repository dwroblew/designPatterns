package com.dwroblew.designPatterns.flyWeight;

public class Demo
{
   public static void main( String[] args )
   {
      var tree1 = TreeFactory.getTree( TreeType.TANNE );
      tree1.drawTree(10,10,50  );
      var tree2 = TreeFactory.getTree( TreeType.BIRKE );
      tree2.drawTree( 11,14,800 );
      var tree3 = TreeFactory.getTree( TreeType.BIRKE );
      tree3.drawTree( 3,5,10 );
      var tree4 = TreeFactory.getTree( TreeType.TANNE );
      tree4.drawTree( 4,6,7 );
   }
}
