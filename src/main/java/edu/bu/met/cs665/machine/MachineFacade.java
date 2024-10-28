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

  public static MachineFacade getInstance() {
    if (mf == null) {
      mf = new MachineFacade();
    }

    return mf;
  }

  public MachineFacade() {
    this.machine = new Machine();
  }

  public void makeCoffee(Coffee coffee, boolean isHot, String[] condiments) {
    makeBeverage(coffee, isHot, condiments, new MakeCoffee());

  }

  public void makeTea(Tea tea, boolean isHot, String[] condiments) {
    makeBeverage(tea, isHot, condiments, new MakeTea());
  }

  /**
   * Make beverage with the current beverage setting.
   *
   * @param isHot make hot or cold beverage
   */
  private void makeBeverage(Beverage beverage, boolean isHot, String[] condiments, MakeBeverage makeBeverage) {
    this.machine.prepareBeverage(beverage);
    this.machine.changeMakeBeverage(makeBeverage);
    addCondiments(condiments);
    this.machine.makeBeverage(isHot);
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
