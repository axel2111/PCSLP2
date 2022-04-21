
package pe.edu.pucp.progamesoft.rrhh.model;
// axel Romero 20172469
public class Organizacion extends Colaborador{
    private String ruc ; 
    private String razonSocial ; 

    public Organizacion(String ruc, String razonSocial, String telefono, String direccion) {
        super(telefono, direccion);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    
    
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    @Override 
    public String consultarDatos(){
        return "Organizacion: " + ruc +" - "+ razonSocial  ; 
    }
}
