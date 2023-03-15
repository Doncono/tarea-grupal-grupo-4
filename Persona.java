
package Protect;


public abstract class Persona {
    private String especialidad;
    public Persona(){
        
    }
    // metodos set y get//
    public void Establecerespecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public String ObtenerEspecialidad(){
        return this.especialidad;
    }
    
    public void imprimirEspecialidad(){
     System.out.println("Especialidad: "+especialidad);
     
     
    }
     // metodos abstractos//
    abstract String getnombre();
    abstract String getexperiencia();
    abstract String direccion();
    
     
    abstract String informacionpersona();
    
}

    
