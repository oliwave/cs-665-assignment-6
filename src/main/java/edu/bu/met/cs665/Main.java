/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.coffee.Americano;
import edu.bu.met.cs665.coffee.LatteMacchiato;
import edu.bu.met.cs665.machine.MachineFacade;
import edu.bu.met.cs665.tea.BlackTea;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project. This could prove convenient to test as you are
   * developing.
   * However, please note that every assignment/final projects requires JUnit
   * tests.
   */
  public static void main(String[] args) {
    MachineFacade machine = new MachineFacade();

    machine.makeCoffee(new LatteMacchiato(), false, new String[] { "Milk", "Sugar", "Sugar", "Sugar", "Sugar" });
  }

}
