package ec.edu.espol;

public class FSuite extends FabricaCabina {

    @Override
    public Cabina crearCabina(double precio, EstadoCabina estado, PoliticaCancelacion politicaCancelacion) {
        return new CabinaSuite(300.0, EstadoCabina.DISPONIBLE, politicaCancelacion);
    }

}
