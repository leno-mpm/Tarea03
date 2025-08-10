/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mile
 */
public class PoliticaCancelacionIT {
    
    public PoliticaCancelacionIT() {
    }

    /**
     * Test of verificarCancelacion method, of class PoliticaCancelacion.
     */
    @Test
    public void testVerificarCancelacion() {
        System.out.println("verificarCancelacion");
        Reserva reserva = null;
        PoliticaCancelacion instance = new PoliticaCancelacion();
        boolean expResult = false;
        boolean result = instance.verificarCancelacion(reserva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class PoliticaCancelacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PoliticaCancelacion instance = new PoliticaCancelacion();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class PoliticaCancelacion.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        PoliticaCancelacion instance = new PoliticaCancelacion();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PoliticaCancelacion.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        PoliticaCancelacion instance = new PoliticaCancelacion();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class PoliticaCancelacion.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        PoliticaCancelacion instance = new PoliticaCancelacion();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
