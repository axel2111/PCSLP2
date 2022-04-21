
package pe.edu.pucp.progamesoft.rrhh.model;
// axel Romero 20172469
public class Persona extends Colaborador{
    private String DNI ; 
    private String nombre ;
    private String apellidoPaterno ; 

    public Persona(String DNI, String nombre, String apellidoPaterno, String telefono, String direccion) {
        super(telefono, direccion);
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    
    @Override 
    public String consultarDatos(){
        return "Persona natural: " + DNI + " - " +nombre + " - " +apellidoPaterno ; 
    }
    
}
