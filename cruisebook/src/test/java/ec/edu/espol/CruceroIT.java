/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mile
 */
public class CruceroIT {
    
    public CruceroIT() {
    }

    /**
     * Test of agregarViaje method, of class Crucero.
     */
    @Test
    public void testAgregarViaje() {
        System.out.println("agregarViaje");
        ViajeCrucero viaje = null;
        Crucero instance = null;
        instance.agregarViaje(viaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarViaje method, of class Crucero.
     */
    @Test
    public void testEliminarViaje() {
        System.out.println("eliminarViaje");
        ViajeCrucero viaje = null;
        Crucero instance = null;
        instance.eliminarViaje(viaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getViajesProgramados method, of class Crucero.
     */
    @Test
    public void testGetViajesProgramados() {
        System.out.println("getViajesProgramados");
        Crucero instance = null;
        List<ViajeCrucero> expResult = null;
        List<ViajeCrucero> result = instance.getViajesProgramados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Crucero.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Crucero instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Crucero.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Crucero instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestino method, of class Crucero.
     */
    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Crucero instance = null;
        String expResult = "";
        String result = instance.getDestino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestino method, of class Crucero.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Crucero instance = null;
        instance.setDestino(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Crucero.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Crucero instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Crucero.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Crucero instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarViajesProgramados method, of class Crucero.
     */
    @Test
    public void testMostrarViajesProgramados() {
        System.out.println("mostrarViajesProgramados");
        Crucero instance = null;
        instance.mostrarViajesProgramados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarViajePorFecha method, of class Crucero.
     */
    @Test
    public void testBuscarViajePorFecha() {
        System.out.println("buscarViajePorFecha");
        Date nuevaFecha = null;
        Crucero instance = null;
        ViajeCrucero expResult = null;
        ViajeCrucero result = instance.buscarViajePorFecha(nuevaFecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
