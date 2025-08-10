/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mile
 */
public class ReservaBaseIT {
    
    public ReservaBaseIT() {
    }

    /**
     * Test of getId method, of class ReservaBase.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ReservaBase instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCabina method, of class ReservaBase.
     */
    @Test
    public void testGetCabina() {
        System.out.println("getCabina");
        ReservaBase instance = null;
        Cabina expResult = null;
        Cabina result = instance.getCabina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabina method, of class ReservaBase.
     */
    @Test
    public void testSetCabina() {
        System.out.println("setCabina");
        Cabina cabina = null;
        ReservaBase instance = null;
        instance.setCabina(cabina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setViajeCrucero method, of class ReservaBase.
     */
    @Test
    public void testSetViajeCrucero() {
        System.out.println("setViajeCrucero");
        ViajeCrucero viajeCrucero = null;
        ReservaBase instance = null;
        instance.setViajeCrucero(viajeCrucero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoliticaCancelacion method, of class ReservaBase.
     */
    @Test
    public void testGetPoliticaCancelacion() {
        System.out.println("getPoliticaCancelacion");
        ReservaBase instance = null;
        PoliticaCancelacion expResult = null;
        PoliticaCancelacion result = instance.getPoliticaCancelacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class ReservaBase.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        ReservaBase instance = null;
        EstadoReserva expResult = null;
        EstadoReserva result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class ReservaBase.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        ReservaBase instance = null;
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaReserva method, of class ReservaBase.
     */
    @Test
    public void testGetFechaReserva() {
        System.out.println("getFechaReserva");
        ReservaBase instance = null;
        Date expResult = null;
        Date result = instance.getFechaReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class ReservaBase.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        EstadoReserva estado = null;
        ReservaBase instance = null;
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class ReservaBase.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        ReservaBase instance = null;
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaReserva method, of class ReservaBase.
     */
    @Test
    public void testSetFechaReserva() {
        System.out.println("setFechaReserva");
        Date fechaReserva = null;
        ReservaBase instance = null;
        instance.setFechaReserva(fechaReserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizacionesImportantes method, of class ReservaBase.
     */
    @Test
    public void testActualizacionesImportantes() {
        System.out.println("actualizacionesImportantes");
        String mensaje = "";
        ReservaBase instance = null;
        instance.actualizacionesImportantes(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCostoTotal method, of class ReservaBase.
     */
    @Test
    public void testCalcularCostoTotal() {
        System.out.println("calcularCostoTotal");
        ReservaBase instance = null;
        Double expResult = null;
        Double result = instance.calcularCostoTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getViajeCrucero method, of class ReservaBase.
     */
    @Test
    public void testGetViajeCrucero() {
        System.out.println("getViajeCrucero");
        ReservaBase instance = null;
        ViajeCrucero expResult = null;
        ViajeCrucero result = instance.getViajeCrucero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
