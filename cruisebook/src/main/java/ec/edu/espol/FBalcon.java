package ec.edu.espol;

public class FBalcon extends FabricaCabina {

    @Override
    public Cabina crearCabina(double precio, EstadoCabina estado, PoliticaCancelacion politicaCancelacion) {
        return new CabinaBalcon(100.0, EstadoCabina.DISPONIBLE, politicaCancelacion);
    }

}
