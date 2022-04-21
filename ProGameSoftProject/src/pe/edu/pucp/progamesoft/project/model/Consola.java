
package pe.edu.pucp.progamesoft.project.model;
// axel Romero 20172469
public class Consola extends Producto {
    private int almacenamiento ;
    private int numNucleos ;
    private TipoConectividad conectividad ; 

    public Consola( String nombre, String descripcion,int almacenamiento, int numNucleos, TipoConectividad conectividad) {
        super(nombre, descripcion);
        this.almacenamiento = almacenamiento;
        this.numNucleos = numNucleos;
        this.conectividad = conectividad;
    }
    
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public TipoConectividad getConectividad() {
        return conectividad;
    }

    public void setConectividad(TipoConectividad conectividad) {
        this.conectividad = conectividad;
    }

    @Override
    public String consultarDatos() {
        return getIdProducto()+ " - " + getNombre() + " - " + getAlmacenamiento() + " - " + getConectividad() ; 
    }
    
    
    
}
