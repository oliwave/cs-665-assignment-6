/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Machine.java
 * Description: This class is responsible for the methods and attributes of a Machine.
 */

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.coffee.Coffee;
import edu.bu.met.cs665.coffee.MakeCoffee;
import edu.bu.met.cs665.tea.MakeTea;
import edu.bu.met.cs665.tea.Tea;

/**
 * This is the Machine class.
 * This class is responsible for representing a beverage Machine.
 */
public class MachineFacade {

  private Machine machine;

  private static MachineFacade mf;

  /**
   * Getter method for getting the MachineFacade instance.
   * 
   * @return Return the MachineFacade
   */
  public static MachineFacade getInstance() {
    if (mf == null) {
      mf = new MachineFacade();
    }

    return mf;
  }

  /**
   * Create the object of MachindeFacade.
   */
  public MachineFacade() {
    this.machine = new Machine();
  }

  /**
   * Getter method for getting Machine.
   * 
   * @return Return the machine instnace
   */
  public Machine getMachine() {
    return machine;
  }

  /**
   * Make coffee with ice or condiments.
   * 
   * @param coffee     The Coffee type of beverage
   * @param isHot      Is hot beverage or not
   * @param condiments The condiments for the Coffee
   */
  public boolean makeCoffee(Coffee coffee, boolean isHot, String[] condiments) {
    return makeBeverage(coffee, isHot, condiments, new MakeCoffee());
  }

  /**
   * Make tea with ice or condiments.
   * 
   * @param tea        The Tea type of beverage
   * @param isHot      Is hot beverage or not
   * @param condiments The condiments for the Tea
   */
  public boolean makeTea(Tea tea, boolean isHot, String[] condiments) {
    return makeBeverage(tea, isHot, condiments, new MakeTea());
  }

  /**
   * Make beverage with the current beverage setting.
   *
   * @param isHot make hot or cold beverage
   */
  private boolean makeBeverage(Beverage beverage,
      boolean isHot,
      String[] condiments,
      MakeBeverage makeBeverage) {
    this.machine.prepareBeverage(beverage);
    this.machine.changeMakeBeverage(makeBeverage);
    boolean isSuccess = addCondiments(condiments);
    this.machine.makeBeverage(isHot);
    return isSuccess;
  }

  /**
   * Specify the condiment you want to add to the beverage.
   * 
   * @param condiment name of condiment
   * @return true if the beverage can add this condiment
   */
  private boolean addCondiments(String[] condiments) {
    boolean isAllSuccess = false;

    for (String condiment : condiments) {
      boolean temp = this.machine.addCondiment(condiment);

      if (!temp) {
        isAllSuccess = temp;
      }
    }

    return isAllSuccess;
  }

}
