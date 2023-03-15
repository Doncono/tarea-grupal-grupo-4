
package Protect;


public class Doctor extends Persona {
    //variable para encapsular

    private int edad;
    public String nombre;
    public String direccion;
    public String experiencia;

    public Doctor(int edad) {
        this.edad = edad;
        Establecerespecialidad("especialidad"+ nombre);
    }

    public void imprimiredad() {
        System.out.println("La edad es: " + edad);
    }
    
    public void setnombre(String name) {
        this.nombre=name;
    }
    
    public void setexperiencia(String name) {
        this.experiencia=name;
    }
    public void setdireccion(String name) {
        this.direccion=name;
    }
    
    public String getnombre() {
        return nombre;
    }

    
    public String getexperiencia() {
        return experiencia;
    }

    
    public String direccion() {
        return direccion;
    }

   
    public String informacionpersona() {
        return "Doctor";
    }

}

    
