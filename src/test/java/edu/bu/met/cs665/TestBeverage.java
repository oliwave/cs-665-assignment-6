// package edu.bu.met.cs665;

// import static org.junit.Assert.assertEquals;

// import org.junit.Test;

// import edu.bu.met.cs665.beverage.Beverage;
// import edu.bu.met.cs665.coffee.Americano;
// import edu.bu.met.cs665.machine.Machine;
// import edu.bu.met.cs665.tea.GreenTea;
// import edu.bu.met.cs665.tea.YellowTea;

// /**
//  * Write some Unit tests for your program like the examples below.
//  */

// public class TestBeverage {

    
//     @Test
//     public void testPerCondimentMaxUnit() {
//         Machine machine = new Machine(new Americano());

//         machine.addCondiment("Milk");
//         machine.addCondiment("Milk");
//         machine.addCondiment("Milk");
//         assertEquals(false,  machine.addCondiment("Milk"));
//     }


//     @Test
//     public void testMixedCondimentsUnits() {
//         Machine machine = new Machine(new Americano());

//         machine.addCondiment("Milk");
//         machine.addCondiment("Milk");
//         machine.addCondiment("Milk");

//         // Each condiment is allowed to only have 3 units
//         assertEquals(false,  machine.addCondiment("Milk"));
        
//         machine.addCondiment("Sugar");
//         machine.addCondiment("Sugar");
//         machine.addCondiment("Sugar");

//         // Each condiment is allowed to only have 3 units
//         assertEquals(false,  machine.addCondiment("Sugar"));
//     }


//     @Test
//     public void testGetHotYelloTea() {

//         Beverage beverage = new YellowTea();

//         Machine machine = new Machine(beverage);

//         machine.makeBeverage(true);

//         assertEquals("Yellow tea", beverage.getName());
//         assertEquals(true, beverage.isHot());
//     }

//     @Test
//     public void testGetColdAmericano() {

//         Beverage beverage = new Americano();

//         Machine machine = new Machine(beverage);

//         machine.makeBeverage(false);

//         assertEquals("Americano", beverage.getName());
//         assertEquals(false, beverage.isHot());
//     }

//     @Test
//     public void testGetGeenTeaWithTwoUnitOfSugar() {

//         Beverage beverage = new GreenTea();

//         Machine machine = new Machine(beverage);

//         machine.addCondiment("Sugar");
//         machine.addCondiment("Sugar");

//         assertEquals("Green tea", beverage.getName());
//         assertEquals(2, beverage.getCondimentUnits("Sugar"));
//     }


// }
