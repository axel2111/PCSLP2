
package pe.edu.pucp.progamesoft.project.model;
// axel Romero 20172469
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import pe.edu.pucp.progamesoft.rrhh.model.Colaborador;
import pe.edu.pucp.progamesoft.rrhh.model.Persona;

public class Proyecto {
    private static int idProyecto = 0 ; 
    private String nombre ; 
    private Date fechaInicio ; 
    private Date fechaFin ; 
    private EstadoProyecto estado ; 
    private Persona responsable ;
    private Producto producto ;
    private ArrayList<Colaborador> colaboradores ;

    public Proyecto(String nombre, Date fechaInicio, Date fechaFin, EstadoProyecto estado) {
        idProyecto = idProyecto + 1 ;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public static int getIdProyecto() {
        return idProyecto;
    }

    public static void setIdProyecto(int idProyecto) {
        Proyecto.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
    
    
    public String generarReporte(){
        String reporte = "" ; 
        Date fechaIni = getFechaFin() ;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy") ; 
        //System.out.println(sdf.format(fechaIni));
        reporte += "ID del proyecto: "  + getIdProyecto() + "\n" ; 
        reporte += "Nombre "  + getNombre()+ "\n" ; 
        reporte += "Fecha Inicio: "  +sdf.format(getFechaInicio()) + "\n" ; 
        reporte += "Fecha Fin: "  + sdf.format(getFechaFin()) + "\n" ; 
        reporte += "----------------------------------------------\n";
        
        reporte += "Producto a desarrollar \n"; 
        reporte += getProducto().consultarDatos() + "\n" ; 
        reporte += "----------------------------------------------\n";
        reporte +=" Responsable\n";
       // reporte += "Persona natural: " + getResponsable().getDNI() + " - " + getResponsable().getNombre() + " " + getResponsable().getApellidoPaterno() +"\n"; 
        reporte += getResponsable().consultarDatos()   + "\n";
        reporte += "----------------------------------------------\n";
        reporte += "Colaboradores: \n" ; 
        
        for (Colaborador col:colaboradores){
            reporte += col.consultarDatos()  + "\n";
        }
        
        return reporte ;
    }
    
}
