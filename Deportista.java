
package Protect;


public class Deportista extends Persona {
    //variable para encapsular
 private int edad;
 public String nombre;
 public String direccion;
 public String experiencia;
   
    
    public  Deportista(int edad){
        this.edad=edad;
        Establecerespecialidad("Posicion"+nombre);
    }
    //encapsulamiento
    
    public void imprimiredad(){
        System.out.println("La edad  es: " + edad);
    
    }
    public void setNombre(String name){
    this.nombre = name;
    }
    public void setexperiencia(String name){
    this.experiencia=name;
    }
    public void setdireccion(String name){
    this.direccion = name;
    }
    
    
    ///////abstraccion
    
   public String getnombre() {
        return "nombre";
    }

    
    public String getexperiencia() {
        return "experiencia";
    }

    
    public String direccion() {
        return "direccion";
    }

    
    public String informacionpersona() {
        return "Futbolista";
    }
    
    
}
