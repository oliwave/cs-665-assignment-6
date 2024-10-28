/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Machine.java
 * Description: This class is responsible for the methods and attributes of a Machine.
 */

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverage.Beverage;

/**
 * This is the Machine class.
 * This class is responsible for representing a beverage Machine.
 */
class Machine {

  private Beverage beverage;

  /**
   * Make beverage with the current beverage setting.
   * 
   * @param isHot make hot or cold beverage
   */
  public void makeBeverage(boolean isHot) {
    this.beverage.makeBeverage(isHot);
  }

  void changeMakeBeverage(MakeBeverage makeBeverage) {
    this.beverage.changeMakeBeverage(makeBeverage);
  }

  /**
   * The Machine allows you to change and prepare any beverage.
   * 
   * @param beverage the beverage you wish to make
   */
  public void prepareBeverage(Beverage beverage) {
    this.beverage = beverage;
  }

  /**
   * Specify the condiment you want to add to the beverage.
   * 
   * @param condiment name of condiment
   * @return true if the beverage can add this condiment
   */
  public boolean addCondiment(String condiment) {
    return beverage.addCondiment(condiment);
  }

}
