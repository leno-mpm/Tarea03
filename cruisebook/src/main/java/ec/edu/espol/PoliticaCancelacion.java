package ec.edu.espol;

public class PoliticaCancelacion {
    private int id;
    private String descripcion;

    public boolean verificarCancelacion(Reserva reserva) {
        if (reserva.getEstado() == EstadoReserva.CONFIRMADA) {
            return true;
        }
        return false;
    }

    public int getId() {
        return this.id;
    }   
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
