/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Beverage.java
 * Description: This class is responsible for the methods and attributes of a Beverage.
 */

package edu.bu.met.cs665.beverage;

import edu.bu.met.cs665.condiment.Condiment;
import edu.bu.met.cs665.condiment.Milk;
import edu.bu.met.cs665.condiment.Sugar;
import edu.bu.met.cs665.machine.MakeBeverage;
import java.util.HashMap;

/**
 * This is the Beverage abstract class.
 * This class is responsible for representing a abstract Beverage.
 */
public abstract class Beverage {

  protected boolean isHot;
  protected String name;
  protected MakeBeverage makeBeverage;
  protected HashMap<String, Condiment> condiments = new HashMap<String, Condiment>() {
    {
      put("Milk", new Milk());
      put("Sugar", new Sugar());
    }
  };

  /**
   * Make beverage with either hot or cold.
   *
   * @param isHot hot or cold beverage
   */
  public void makeBeverage(boolean isHot) {
    this.isHot = isHot;
    this.makeBeverage.makeBeverage(this);
  }
  
  public void changeMakeBeverage(MakeBeverage makeBeverage) {
    this.makeBeverage = makeBeverage;
  }

  /**
   * Add condiment to the current beverage.
   *
   * @param condiment specify the name of condiment
   * @return return false if the drink is not able to add condiment
   */
  public boolean addCondiment(String condiment) {
    return this.condiments.get(condiment).addUnit();
  }

  /**
   * Check if the beverage is hot or cold.
   *
   * @return the hot or cold beverage
   */
  public boolean isHot() {
    return isHot;
  }

  /**
   * Getter method for beverage's name.
   *
   * @return The beverage's name.
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for beverage's name.
   *
   * @param name The beverage's name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the units of the condient added to the beverage.
   * 
   * @param name Condiment name
   * @return the number of units for this condiment
   */
  public int getCondimentUnits(String name) {
    return this.condiments.get(name).getUnit();
  }
}
