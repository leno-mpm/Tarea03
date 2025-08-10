package ec.edu.espol;

public class FFamiliar extends FabricaCabina {
    @Override
    public Cabina crearCabina(double precio, EstadoCabina estado, PoliticaCancelacion politicaCancelacion) {
        return new CabinaFamiliar(250.0, EstadoCabina.DISPONIBLE, politicaCancelacion);
    }
}
