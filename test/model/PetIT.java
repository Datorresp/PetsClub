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
import static org.testng.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 *
 * @author diegoa.torres
 */
public class PetIT {
    
    public PetIT() {
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
     * Test of getId method, of class Pet.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Pet instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setId method, of class Pet.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Pet instance = null;
        instance.setId(id);
        
        fail(".");
    }

    /**
     * Test of getName method, of class Pet.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Pet instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setName method, of class Pet.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Pet instance = null;
        instance.setName(name);
        
        fail(".");
    }

    /**
     * Test of getType method, of class Pet.
     */
    @org.junit.Test
    public void testGetType() {
        System.out.println("getType");
        Pet instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setType method, of class Pet.
     */
    @org.junit.Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Pet instance = null;
        instance.setType(type);
        
        fail(".");
    }

    /**
     * Test of getSex method, of class Pet.
     */
    @org.junit.Test
    public void testGetSex() {
        System.out.println("getSex");
        Pet instance = null;
        char expResult = ' ';
        char result = instance.getSex();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setSex method, of class Pet.
     */
    @org.junit.Test
    public void testSetSex() {
        System.out.println("setSex");
        char sex = ' ';
        Pet instance = null;
        instance.setSex(sex);
        
        fail(".");
    }

    /**
     * Test of getBirthDate method, of class Pet.
     */
    @org.junit.Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Pet instance = null;
        Calendar expResult = null;
        Calendar result = instance.getBirthDate();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setBirthDate method, of class Pet.
     */
    @org.junit.Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        Calendar birthDate = null;
        Pet instance = null;
        instance.setBirthDate(birthDate);
        
        fail(".");
    }

    /**
     * Test of toString method, of class Pet.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Pet instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of edad method, of class Pet.
     */
    @org.junit.Test
    public void testEdad() {
        System.out.println("edad");
        Pet instance = null;
        int expResult = 0;
        int result = instance.edad();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoId method, of class Pet.
     */
    @org.junit.Test
    public void testComparetoId() {
        System.out.println("comparetoId");
        Pet p = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.comparetoId(p);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoName method, of class Pet.
     */
    @org.junit.Test
    public void testComparetoName() {
        System.out.println("comparetoName");
        Pet p = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.comparetoName(p);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoType method, of class Pet.
     */
    @org.junit.Test
    public void testComparetoType() {
        System.out.println("comparetoType");
        Pet p = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.comparetoType(p);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoSex method, of class Pet.
     */
    @org.junit.Test
    public void testComparetoSex() {
        System.out.println("comparetoSex");
        Pet p = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.comparetoSex(p);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoAge method, of class Pet.
     */
    @org.junit.Test
    public void testComparetoAge() {
        System.out.println("comparetoAge");
        Pet p = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.comparetoAge(p);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of compareTo method, of class Pet.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of compare method, of class Pet.
     */
    @org.junit.Test
    public void testCompare() {
        System.out.println("compare");
        Object o1 = null;
        Object o2 = null;
        Pet instance = null;
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        
        fail(".");
    }
    
}
