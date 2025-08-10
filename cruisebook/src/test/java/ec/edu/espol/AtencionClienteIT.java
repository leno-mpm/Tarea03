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
public class AtencionClienteIT {
    
    public AtencionClienteIT() {
    }

    /**
     * Test of atenderProblema method, of class AtencionCliente.
     */
    @Test
    public void testAtenderProblema() {
        System.out.println("atenderProblema");
        String descripcion = "";
        Usuario usuario = null;
        AtencionCliente instance = null;
        boolean expResult = false;
        boolean result = instance.atenderProblema(descripcion, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escalarAGerencia method, of class AtencionCliente.
     */
    @Test
    public void testEscalarAGerencia() {
        System.out.println("escalarAGerencia");
        String descripcion = "";
        Usuario usuario = null;
        AtencionCliente instance = null;
        instance.escalarAGerencia(descripcion, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
