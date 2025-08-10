package ec.edu.espol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViajeCrucero {
    private Date fechaSalida;
    private List<Cabina> cabinas= new ArrayList<>();// {Balcon, , Estándar, Económica};
    private List<Reserva> reservas = new ArrayList<>();
    private String itinerario;
    private List<Observador> observadores = new ArrayList<>();
    private Crucero crucero;

    public ViajeCrucero(Date fechaSalida, List<Cabina> cabinas, String itinerario, Crucero crucero) {//Asumir que cuando se crea un viaje, ya se tienen las cabinas disponibles
        this.fechaSalida = fechaSalida;
        this.cabinas=cabinas;
        this.itinerario = itinerario;
        this.crucero = crucero;
    }
    
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        agregarObservador(reserva.getUsuario());
        for(Cabina cabina : cabinas) {
            if (cabina.equals(reserva.getCabina())) {
                cabina.setEstado(EstadoCabina.OCUPADA);
                break;
            }
        }
    }

    public void eliminarReserva(Reserva reserva) {
        for (Cabina cabina : cabinas) {
            if (cabina.equals(reserva.getCabina())) {
                cabina.setEstado(EstadoCabina.DISPONIBLE);
                break;
            }   
        }
        reservas.remove(reserva);
        eliminarObservador(reserva.getUsuario());
    }
        

    // Métodos para observadores
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.notificar(mensaje);
            Reserva reservaBuscada= buscarReserva(observador);
            reservaBuscada.setEstado(EstadoReserva.PENDIENTE);
            observador.accionNotificar(reservaBuscada);
        }
    }

    private Reserva buscarReserva(Observador observador) {
        for(Reserva reserva : observador.getReservas()) {

            if(reservas.contains(reserva)) {
                return reserva;
            }
        }
        return null; // No se encontró la reserva del observador
    }

    // Reprogramar fecha de salida
    public void reprogramarFecha(Date nuevaFecha) {
        this.fechaSalida = nuevaFecha;
        notificarObservadores("El viaje del crucero: ha sido reprogramado para el " + nuevaFecha);
    }

    // Cancelar viaje
    public void cancelarViaje() {

        notificarObservadores("El viaje del crucero para la fecha " + fechaSalida + " ha sido cancelado. Se procesarán reembolsos automáticos o podrá modificar su reserva sin cargos.");
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public List<Cabina> getCabinas() {
        return cabinas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void addNuevaCabina(Cabina cabina) {
        cabinas.add(cabina);
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
        notificarObservadores("El itinerario del viaje ha cambiado: " + itinerario);
    }

    public List<Cabina> buscarCabinasDisponibles(String tipo) {
        List<Cabina> disponibles = new ArrayList<>();
        for (Cabina c : cabinas) {
            if (c.isDisponible() && (tipo == null || c.getTipo().equalsIgnoreCase(tipo))) {
                disponibles.add(c);
            }
        }
        return disponibles;
    }

    public boolean verificarCabina(String tipo) {
        for (Cabina c : cabinas) {
            if (c.getTipo().equalsIgnoreCase(tipo)) {
                return true;
            }
        }
        return false;
    }

    public Crucero getCrucero() {
        return crucero;
    }

    public Cabina asignarCabinaDisponible() {
        for (Cabina c : cabinas) {
            if (c.isDisponible()) {
                c.setEstado(EstadoCabina.OCUPADA);
                return c;
            }
        }
        return null; 
    }
        
}
