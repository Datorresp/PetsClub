/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class ClubIT {
    
    public ClubIT() {
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
     * Test of getName method, of class Club.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Club instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setName method, of class Club.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Club instance = null;
        instance.setName(name);
        
        fail(".");
    }

    /**
     * Test of getNit method, of class Club.
     */
    @org.junit.Test
    public void testGetNit() {
        System.out.println("getNit");
        Club instance = null;
        String expResult = "";
        String result = instance.getNit();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of setNit method, of class Club.
     */
    @org.junit.Test
    public void testSetNit() {
        System.out.println("setNit");
        String nit = "";
        Club instance = null;
        instance.setNit(nit);
        
        fail(".");
    }

    /**
     * Test of addClient method, of class Club.
     */
    @org.junit.Test
    public void testAddClient() {
        System.out.println("addClient");
        Client e = null;
        Club instance = null;
        instance.addClient(e);
        
        fail(".");
    }

    /**
     * Test of addPet method, of class Club.
     */
    @org.junit.Test
    public void testAddPet() {
        System.out.println("addPet");
        String id = "";
        Pet e = null;
        Club instance = null;
        String expResult = "";
        String result = instance.addPet(id, e);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of ClientInfo method, of class Club.
     */
    @org.junit.Test
    public void testClientInfo() {
        System.out.println("ClientInfo");
        String id = "";
        Club instance = null;
        String expResult = "";
        String result = instance.ClientInfo(id);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of petInfo method, of class Club.
     */
    @org.junit.Test
    public void testPetInfo() {
        System.out.println("petInfo");
        String idc = "";
        String idp = "";
        Club instance = null;
        String expResult = "";
        String result = instance.petInfo(idc, idp);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoNit method, of class Club.
     */
    @org.junit.Test
    public void testComparetoNit() {
        System.out.println("comparetoNit");
        Club c = null;
        Club instance = null;
        int expResult = 0;
        int result = instance.comparetoNit(c);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of comparetoName method, of class Club.
     */
    @org.junit.Test
    public void testComparetoName() {
        System.out.println("comparetoName");
        Club c = null;
        Club instance = null;
        int expResult = 0;
        int result = instance.comparetoName(c);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of toString method, of class Club.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Club instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of OrdenPorNombre method, of class Club.
     */
    @org.junit.Test
    public void testOrdenPorNombre() {
        System.out.println("OrdenPorNombre");
        Club instance = null;
        instance.OrdenPorNombre();
        
        fail(".");
    }

    /**
     * Test of OrdenarPorApellido method, of class Club.
     */
    @org.junit.Test
    public void testOrdenarPorApellido() {
        System.out.println("OrdenarPorApellido");
        Club instance = null;
        instance.OrdenarPorApellido();
        
        fail(".");
    }

    /**
     * Test of OrdenarPorID method, of class Club.
     */
    @org.junit.Test
    public void testOrdenarPorID() {
        System.out.println("OrdenarPorID");
        Club instance = null;
        instance.OrdenarPorID();
        
        fail(".");
    }

    /**
     * Test of OrdenarPorFavoritePet method, of class Club.
     */
    @org.junit.Test
    public void testOrdenarPorFavoritePet() {
        System.out.println("OrdenarPorFavoritePet");
        Club instance = null;
        instance.OrdenarPorFavoritePet();
        
        fail(".");
    }

    /**
     * Test of OrdenarPorEdad method, of class Club.
     */
    @org.junit.Test
    public void testOrdenarPorEdad() {
        System.out.println("OrdenarPorEdad");
        Club instance = null;
        instance.OrdenarPorEdad();
        
        fail(".");
    }

    /**
     * Test of buscarBinarioNombreS method, of class Club.
     */
    @org.junit.Test
    public void testBuscarBinarioNombreS() {
        System.out.println("buscarBinarioNombreS");
        String name = "";
        Club instance = null;
        int expResult = 0;
        int result = instance.buscarBinarioNombreS(name);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of buscarBinarioApellidoS method, of class Club.
     */
    @org.junit.Test
    public void testBuscarBinarioApellidoS() {
        System.out.println("buscarBinarioApellidoS");
        String LastName = "";
        Club instance = null;
        int expResult = 0;
        int result = instance.buscarBinarioApellidoS(LastName);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of buscarBinarioIdS method, of class Club.
     */
    @org.junit.Test
    public void testBuscarBinarioIdS() {
        System.out.println("buscarBinarioIdS");
        String Id = "";
        Club instance = null;
        int expResult = 0;
        int result = instance.buscarBinarioIdS(Id);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of buscarBinarioEdadS method, of class Club.
     */
    @org.junit.Test
    public void testBuscarBinarioEdadS() {
        System.out.println("buscarBinarioEdadS");
        int age = 0;
        Club instance = null;
        int expResult = 0;
        int result = instance.buscarBinarioEdadS(age);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of buscarBinarioMascotaFav method, of class Club.
     */
    @org.junit.Test
    public void testBuscarBinarioMascotaFav() {
        System.out.println("buscarBinarioMascotaFav");
        String fav = "";
        Club instance = null;
        int expResult = 0;
        int result = instance.buscarBinarioMascotaFav(fav);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of loadTextFile method, of class Club.
     */
    @org.junit.Test
    public void testLoadTextFile() throws Exception {
        System.out.println("loadTextFile");
        String csv = "";
        String sep = "";
        Club instance = null;
        instance.loadTextFile(csv, sep);
        
        fail(".");
    }

    /**
     * Test of allClient method, of class Club.
     */
    @org.junit.Test
    public void testAllClient() {
        System.out.println("allClient");
        Club instance = null;
        String expResult = "";
        String result = instance.allClient();
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of compareTo method, of class Club.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = null;
        Club instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        
        fail(".");
    }

    /**
     * Test of compare method, of class Club.
     */
    @org.junit.Test
    public void testCompare() {
        System.out.println("compare");
        Object o1 = null;
        Object o2 = null;
        Club instance = null;
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        
        fail(".");
    }
    
}
