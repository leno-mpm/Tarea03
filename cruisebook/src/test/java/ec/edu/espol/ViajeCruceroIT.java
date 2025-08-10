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
public class ViajeCruceroIT {
    
    public ViajeCruceroIT() {
    }

    /**
     * Test of agregarReserva method, of class ViajeCrucero.
     */
    @Test
    public void testAgregarReserva() {
        System.out.println("agregarReserva");
        Reserva reserva = null;
        ViajeCrucero instance = null;
        instance.agregarReserva(reserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarReserva method, of class ViajeCrucero.
     */
    @Test
    public void testEliminarReserva() {
        System.out.println("eliminarReserva");
        Reserva reserva = null;
        ViajeCrucero instance = null;
        instance.eliminarReserva(reserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarObservador method, of class ViajeCrucero.
     */
    @Test
    public void testAgregarObservador() {
        System.out.println("agregarObservador");
        Observador observador = null;
        ViajeCrucero instance = null;
        instance.agregarObservador(observador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarObservador method, of class ViajeCrucero.
     */
    @Test
    public void testEliminarObservador() {
        System.out.println("eliminarObservador");
        Observador observador = null;
        ViajeCrucero instance = null;
        instance.eliminarObservador(observador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reprogramarFecha method, of class ViajeCrucero.
     */
    @Test
    public void testReprogramarFecha() {
        System.out.println("reprogramarFecha");
        Date nuevaFecha = null;
        ViajeCrucero instance = null;
        instance.reprogramarFecha(nuevaFecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelarViaje method, of class ViajeCrucero.
     */
    @Test
    public void testCancelarViaje() {
        System.out.println("cancelarViaje");
        ViajeCrucero instance = null;
        instance.cancelarViaje();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSalida method, of class ViajeCrucero.
     */
    @Test
    public void testGetFechaSalida() {
        System.out.println("getFechaSalida");
        ViajeCrucero instance = null;
        Date expResult = null;
        Date result = instance.getFechaSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaSalida method, of class ViajeCrucero.
     */
    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        Date fechaSalida = null;
        ViajeCrucero instance = null;
        instance.setFechaSalida(fechaSalida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCabinas method, of class ViajeCrucero.
     */
    @Test
    public void testGetCabinas() {
        System.out.println("getCabinas");
        ViajeCrucero instance = null;
        List<Cabina> expResult = null;
        List<Cabina> result = instance.getCabinas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservas method, of class ViajeCrucero.
     */
    @Test
    public void testGetReservas() {
        System.out.println("getReservas");
        ViajeCrucero instance = null;
        List<Reserva> expResult = null;
        List<Reserva> result = instance.getReservas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNuevaCabina method, of class ViajeCrucero.
     */
    @Test
    public void testAddNuevaCabina() {
        System.out.println("addNuevaCabina");
        Cabina cabina = null;
        ViajeCrucero instance = null;
        instance.addNuevaCabina(cabina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItinerario method, of class ViajeCrucero.
     */
    @Test
    public void testGetItinerario() {
        System.out.println("getItinerario");
        ViajeCrucero instance = null;
        String expResult = "";
        String result = instance.getItinerario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItinerario method, of class ViajeCrucero.
     */
    @Test
    public void testSetItinerario() {
        System.out.println("setItinerario");
        String itinerario = "";
        ViajeCrucero instance = null;
        instance.setItinerario(itinerario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCabinasDisponibles method, of class ViajeCrucero.
     */
    @Test
    public void testBuscarCabinasDisponibles() {
        System.out.println("buscarCabinasDisponibles");
        String tipo = "";
        ViajeCrucero instance = null;
        List<Cabina> expResult = null;
        List<Cabina> result = instance.buscarCabinasDisponibles(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCabina method, of class ViajeCrucero.
     */
    @Test
    public void testVerificarCabina() {
        System.out.println("verificarCabina");
        String tipo = "";
        ViajeCrucero instance = null;
        boolean expResult = false;
        boolean result = instance.verificarCabina(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCrucero method, of class ViajeCrucero.
     */
    @Test
    public void testGetCrucero() {
        System.out.println("getCrucero");
        ViajeCrucero instance = null;
        Crucero expResult = null;
        Crucero result = instance.getCrucero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarCabinaDisponible method, of class ViajeCrucero.
     */
    @Test
    public void testAsignarCabinaDisponible() {
        System.out.println("asignarCabinaDisponible");
        ViajeCrucero instance = null;
        Cabina expResult = null;
        Cabina result = instance.asignarCabinaDisponible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
