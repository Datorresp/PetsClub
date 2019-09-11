/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testng.Assert.*;

/**
 *
 * @author diegoa.torres
 */
public class ClientIT {
    
    public ClientIT() {
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
     * Test of getId method, of class Client.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Client instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
        fail();
    }

    /**
     * Test of setId method, of class Client.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Client instance = null;
        instance.setId(id);
        
        fail();
    }

    /**
     * Test of getName method, of class Client.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Client instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of setName method, of class Client.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Client instance = null;
        instance.setName(name);
         
        fail(".");
    }

    /**
     * Test of getLastName method, of class Client.
     */
    @org.junit.Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Client instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of setLastName method, of class Client.
     */
    @org.junit.Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Client instance = null;
        instance.setLastName(lastName);
         
        fail(".");
    }

    /**
     * Test of getPet method, of class Client.
     */
    @org.junit.Test
    public void testGetPet() {
        System.out.println("getPet");
        Client instance = null;
        char expResult = ' ';
        char result = instance.getPet();
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of setPet method, of class Client.
     */
    @org.junit.Test
    public void testSetPet() {
        System.out.println("setPet");
        char pet = ' ';
        Client instance = null;
        instance.setPet(pet);
         
        fail(".");
    }

    /**
     * Test of getCal method, of class Client.
     */
    @org.junit.Test
    public void testGetCal() {
        System.out.println("getCal");
        Client instance = null;
        Calendar expResult = null;
        Calendar result = instance.getCal();
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of setCal method, of class Client.
     */
    @org.junit.Test
    public void testSetCal() {
        System.out.println("setCal");
        Calendar cal = null;
        Client instance = null;
        instance.setCal(cal);
         
        fail(".");
    }

    /**
     * Test of addPet method, of class Client.
     */
    @org.junit.Test
    public void testAddPet() {
        System.out.println("addPet");
        Pet pet = null;
        Client instance = null;
        instance.addPet(pet);
         
        fail(".");
    }

    /**
     * Test of toString method, of class Client.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Client instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of petInfo method, of class Client.
     */
    @org.junit.Test
    public void testPetInfo() {
        System.out.println("petInfo");
        String id = "";
        Client instance = null;
        String expResult = "";
        String result = instance.petInfo(id);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of edad method, of class Client.
     */
    @org.junit.Test
    public void testEdad() {
        System.out.println("edad");
        Client instance = null;
        int expResult = 0;
        int result = instance.edad();
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of comparetoName method, of class Client.
     */
    @org.junit.Test
    public void testComparetoName() {
        System.out.println("comparetoName");
        Client c = null;
        Client instance = null;
        int expResult = 0;
        int result = instance.comparetoName(c);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of comparetoLastName method, of class Client.
     */
    @org.junit.Test
    public void testComparetoLastName() {
        System.out.println("comparetoLastName");
        Client c = null;
        Client instance = null;
        int expResult = 0;
        int result = instance.comparetoLastName(c);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of comparetoId method, of class Client.
     */
    @org.junit.Test
    public void testComparetoId() {
        System.out.println("comparetoId");
        Client c = null;
        Client instance = null;
        int expResult = 0;
        int result = instance.comparetoId(c);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of comparetoFavoritePet method, of class Client.
     */
    @org.junit.Test
    public void testComparetoFavoritePet() {
        System.out.println("comparetoFavoritePet");
        Client c = null;
        Client instance = null;
        int expResult = 0;
        int result = instance.comparetoFavoritePet(c);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of comparetoAge method, of class Client.
     */
    @org.junit.Test
    public void testComparetoAge() {
        System.out.println("comparetoAge");
        Client c = null;
        Client instance = null;
        int expResult = 0;
        int result = instance.comparetoAge(c);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of loadTextFile method, of class Client.
     */
    @org.junit.Test
    public void testLoadTextFile() throws Exception {
        System.out.println("loadTextFile");
        String csv = "";
        String sep = "";
        Client instance = null;
        Pet expResult = null;
        Pet result = instance.loadTextFile(csv, sep);
        assertEquals(expResult, result);
         
        fail(".");
    }

    /**
     * Test of OrdenarPorID method, of class Client.
     */
    @org.junit.Test
    public void testOrdenarPorID() {
        System.out.println("OrdenarPorID");
        Client instance = null;
        instance.OrdenarPorID();
         
        fail(".");
    }

    /**
     * Test of OrdenPorNombre method, of class Client.
     */
    @org.junit.Test
    public void testOrdenPorNombre() {
        System.out.println("OrdenPorNombre");
        Client instance = null;
        instance.OrdenPorNombre();
         
        fail(".");
    }

    /**
     * Test of OrdenPorTipo method, of class Client.
     */
    @org.junit.Test
    public void testOrdenPorTipo() {
        System.out.println("OrdenPorTipo");
        Client instance = null;
        instance.OrdenPorTipo();
         
        fail(".");
    }

    /**
     * Test of OrdenPorSexo method, of class Client.
     */
    @org.junit.Test
    public void testOrdenPorSexo() {
        System.out.println("OrdenPorSexo");
        Client instance = null;
        instance.OrdenPorSexo();
         
        fail(".");
    }
    
}
