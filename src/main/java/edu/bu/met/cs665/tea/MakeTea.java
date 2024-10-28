/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: MakeTea.java
 * Description: This class is responsible for the methods and attributes of a MakeTea.
 */

package edu.bu.met.cs665.tea;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.machine.MakeBeverage;

/**
 * This is the MakeTea class.
 * This class is responsible for makeing Tea.
 */
public class MakeTea implements MakeBeverage {

  /**
   * Make beverage.
   * 
   * @param beverage the beverage that the Machine is making
   */
  @Override
  public void makeBeverage(Beverage beverage) {
    String temperature = beverage.isHot() ? "Hot" : "Cold";
    String name = beverage.getName();
    int sugar = beverage.getCondimentUnits("Sugar");
    int milk = beverage.getCondimentUnits("Milk");
    System.out.println("We're makeing tea, especially "
        + temperature + " " + name + " with "
        + milk + " unit of Milk and " + sugar
        + " unit of Sugar");
  }

}
