/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Condiment.java
 * Description: This class is responsible for the methods and attributes of a Condiment.
 */

package edu.bu.met.cs665.condiment;

/**
 * This is the Condiment class.
 * This class is responsible for representing a Condiment in a Beverage.
 */
public class Condiment {

  private static final int MAX_UNIT = 3;

  protected String name;
  protected int unit;

  /**
   * Getter method for the condiment name.
   * 
   * @return the name of the Condiment
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for the condiment name.
   * 
   * @param name set the condiment name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter method for the total amount of this condiment.
   * 
   * @return the amount of the condiment
   */
  public int getUnit() {
    return this.unit;
  }

  /**
   * Setter method for adding a unit of the condiment.
   * 
   * <p>The maximum for each condiment is 3 units.
   * 
   * @return false if it exceeds the threshhold for each condiment
   */
  public boolean addUnit() {
    if (this.unit + 1 > MAX_UNIT) {
      return false;
    }
    this.unit++;
    return true;
  }

}
