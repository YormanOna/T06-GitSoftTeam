package ec.edu.espe.restaurant.controller;

import ec.edu.espe.restaurant.controller.CustomerController;
import org.bson.Document;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class CustomerControllerTest {
    
    public CustomerControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RegisterAndBuildDocument method, of class CustomerController.
     */
    @Test
    public void testRegisterAndBuildDocument() {
        System.out.println("RegisterAndBuildDocument");
        String firstName = "ALLAN";
        String lastName = "Panchi";
        String identification = "1727275198";
        String cellphone = "0995151315";
        String email = "allanpanchi66@gmail.com";
        String typeOfService = "AAAA";
        String cost = "1.71";
        String timeOfTreatment = "12";
        String date = "1233";
        String hourOfAttention = "323";
        CustomerController instance = null;
        Document expResult = null;
        Document result = instance.RegisterAndBuildDocument(firstName, lastName, identification, cellphone, email, typeOfService, cost, timeOfTreatment, date, hourOfAttention);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateTotalCost method, of class CustomerController.
     */
    @Test
    public void testCalculateTotalCost() {
        System.out.println("calculateTotalCost");
        double cost = 20;
        double sessions = 2;
        CustomerController instance = null;
        double expResult = 40;
        double result = instance.calculateTotalCost(20, 2);
        assertEquals(40, result, 0.0);
    }
    
}
