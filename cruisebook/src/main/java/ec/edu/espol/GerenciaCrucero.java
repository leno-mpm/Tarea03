package ec.edu.espol;

public class GerenciaCrucero {
    public void resolverProblema(String descripcion, Usuario usuario) {
        if (descripcion == null || usuario == null) throw new IllegalArgumentException("Los parámetros no pueden ser nulos");
        System.out.println("Gerencia del crucero atiende problema: " + descripcion);
        System.out.println("Gerencia proporciona solución definitiva para usuario: " + usuario.getNombre());
        
    }
}
