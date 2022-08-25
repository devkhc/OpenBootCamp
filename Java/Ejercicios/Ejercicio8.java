package Ejercicios;
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();

        persona1.setNombre("Kogi");
        persona1.setEdad(22);
        persona1.setTelefono(310507);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
    }
    
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

