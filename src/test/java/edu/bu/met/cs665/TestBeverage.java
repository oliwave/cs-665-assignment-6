package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.coffee.Americano;
import edu.bu.met.cs665.coffee.Coffee;
import edu.bu.met.cs665.coffee.LatteMacchiato;
import edu.bu.met.cs665.machine.MachineFacade;
import edu.bu.met.cs665.tea.GreenTea;
import edu.bu.met.cs665.tea.YellowTea;
import edu.bu.met.cs665.tea.Tea;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestBeverage {

  MachineFacade fc = new MachineFacade();

  @Test
  public void testPerCondimentMaxUnit() {
    MachineFacade fc = new MachineFacade();
    boolean isSuccess = fc.makeCoffee(new Americano(), false, new String[] { "Milk", "Milk", "Milk", "Milk" });
    assertEquals(false, isSuccess);
  }

  @Test
  public void testMixedCondimentsUnits() {
    MachineFacade fc = new MachineFacade();
    boolean isSuccess = fc.makeCoffee(new Americano(), false,
        new String[] { "Milk", "Milk", "Milk", "Milk", "Sugar", "Sugar", "Sugar", "Sugar" });

    // Each condiment is allowed to only have 3 units
    assertEquals(false, isSuccess);
  }

  @Test
  public void testGetHotYelloTea() {
    Tea beverage = new YellowTea();
    fc.makeTea(beverage, true,
        new String[] { "Milk", "Milk", "Milk", "Milk", "Sugar", "Sugar", "Sugar", "Sugar" });

    assertEquals("Yellow tea", beverage.getName());
    assertEquals(true, beverage.isHot());
  }

  @Test
  public void testGetColdAmericano() {

    Coffee beverage = new Americano();

    fc.makeCoffee(beverage, false,
        new String[] { "Milk", "Milk", "Milk", "Milk", "Sugar", "Sugar", "Sugar", "Sugar" });

    assertEquals("Americano", beverage.getName());
    assertEquals(false, beverage.isHot());
  }

  @Test
  public void testGetGeenTeaWithTwoUnitOfSugar() {

    Tea beverage = new GreenTea();
    fc.makeTea(beverage, true,
        new String[] { "Sugar", "Sugar" });

    assertEquals("Green tea", beverage.getName());
    assertEquals(2, beverage.getCondimentUnits("Sugar"));
  }

}
