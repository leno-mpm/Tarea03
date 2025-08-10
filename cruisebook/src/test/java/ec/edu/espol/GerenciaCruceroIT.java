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
public class GerenciaCruceroIT {
    
    public GerenciaCruceroIT() {
    }

    /**
     * Test of resolverProblema method, of class GerenciaCrucero.
     */
    @Test
    public void testResolverProblema() {
        System.out.println("resolverProblema");
        String descripcion = "";
        Usuario usuario = null;
        GerenciaCrucero instance = new GerenciaCrucero();
        instance.resolverProblema(descripcion, usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
