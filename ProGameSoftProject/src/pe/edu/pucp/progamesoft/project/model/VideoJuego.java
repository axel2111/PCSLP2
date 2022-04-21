
package pe.edu.pucp.progamesoft.project.model;

// axel Romero 20172469
public class VideoJuego extends Producto {
    private Genero genero ;
    private Consola consola ; 
    private boolean unJugador ; 
    private boolean multijugador ; 

    public VideoJuego(String nombre, String descripcion,Genero genero, Consola consola, boolean unJugador, boolean multijugador) {
        super(nombre, descripcion);
        this.genero = genero;
        this.consola = consola;
        this.unJugador = unJugador;
        this.multijugador = multijugador;
    }
    
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public boolean isUnJugador() {
        return unJugador;
    }

    public void setUnJugador(boolean unJugador) {
        this.unJugador = unJugador;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }
    
    @Override
    public String consultarDatos() {
        return getIdProducto() + " - " + getNombre() + " - " + getGenero().getNombre() + " - " + getConsola().getNombre();
    }
    
    
}
