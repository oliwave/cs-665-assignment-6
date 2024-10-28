/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: MakeCoffee.java
 * Description: This class is responsible for the methods and attributes of a MakeCoffee.
 */

package edu.bu.met.cs665.coffee;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.machine.MakeBeverage;

/**
 * This is the MakeCoffee class.
 * This class is responsible for making coffee only.
 */
public class MakeCoffee implements MakeBeverage {

  /**
   * Make beverage.
   * 
   * @param beverage make the beverage
   */
  @Override
  public void makeBeverage(Beverage beverage) {
    String temperature = beverage.isHot() ? "Hot" : "Cold";
    String name = beverage.getName();
    int sugar = beverage.getCondimentUnits("Sugar");
    int milk = beverage.getCondimentUnits("Milk");
    System.out.println("We're makeing coffee, especially "
        + temperature + " " + name + " with "
        + milk + " unit of Milk and " + sugar
        + " unit of Sugar");
  }

}
