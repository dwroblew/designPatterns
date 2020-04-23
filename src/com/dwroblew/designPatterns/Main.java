package com.dwroblew.designPatterns;

import com.dwroblew.designPatterns.builder.CivilEngineer;
import com.dwroblew.designPatterns.builder.HouseBuilder;
import com.dwroblew.designPatterns.builder.WoodHouseBuilder;
import com.dwroblew.designPatterns.solid.openClosed.AreaCalculator;
import com.dwroblew.designPatterns.solid.openClosed.Circle;
import com.dwroblew.designPatterns.solid.openClosed.Rectangle;

import java.util.Arrays;

import static com.dwroblew.designPatterns.solid.singleResponsibility.ShoppingList.shoppingList;

public class Main
{

   public static void main( String[] args )
   {
      // Single Responsibility Principle
      shoppingList();

      //open - closed principle
      var ac = new AreaCalculator();
      System.out.println( ac.calculateArea( Circle.circles() ) + ac.calculateArea( Rectangle.rectangles() ) );

      //builder pattern

      var whb = new WoodHouseBuilder();
      var engineer = new CivilEngineer( whb );
      engineer.constructHouse();
      var house = engineer.getHouse();
      System.out.println( house);

   }

}
