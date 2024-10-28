/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: MakeBeverage.java
 * Description: This class is responsible for the methods and attributes of a MakeBeverage.
 */

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverage.Beverage;

/**
 * This is the MakeBeverage interface.
 * This interface is responsible for representing the behavior of making beverage.
 */
public interface MakeBeverage {

  /**
   * Make beverage.
   * 
   * @param beverage the beverage that the machine is going to make
   */
  public void makeBeverage(Beverage beverage);

}
