package Ejercicios;
public class Ejercicio9 {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente();
        Trabajador trabajador1 = new Trabajador();


        cliente1.setNombre("Kogi");
        cliente1.setEdad(22);
        cliente1.setTelefono(310507);
        cliente1.setCredito(1000000);

        trabajador1.setNombre("Pepito");
        trabajador1.setEdad(30);
        trabajador1.setTelefono(111111);
        trabajador1.setSalario(4000000);

        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());
        
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());
    }   
}

abstract class Persona {
    String nombre;
    int edad;
    int telefono;

    abstract public void setNombre(String nombre);
    abstract public String getNombre();
    abstract public void setEdad(int edad);
    abstract public int getEdad();
    abstract public void setTelefono(int telefono);
    abstract public int getTelefono();


    public Persona(){
        System.out.println("Este es el constructor del vehiculo");
    }
}

class Cliente extends Persona{
    private int credito;

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
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

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
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}    