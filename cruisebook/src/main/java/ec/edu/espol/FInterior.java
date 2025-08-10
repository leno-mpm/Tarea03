package ec.edu.espol;

public class FInterior extends FabricaCabina {

    @Override
    public Cabina crearCabina(double precio, EstadoCabina estado, PoliticaCancelacion politicaCancelacion) {
        return new CabinaInterior(150.0, EstadoCabina.DISPONIBLE, politicaCancelacion);
    }

}
