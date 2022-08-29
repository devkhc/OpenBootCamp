package Examples;

public class privateProperties {

    public static void main(String [] args) {
        Vehiculo coche = new Vehiculo(); /* Create a new object from a class*/
        Vehiculo moto = new Vehiculo();

        /* set... to define the value of the variable */
        coche.setTipo("Coupe");  /*object + set(variable) */
        coche.setVelocidadMaxima(100);
        coche.setCorriente(true);

        moto.setTipo("Scooter");
        moto.setVelocidadMaxima(70);

        /*get... to return the value of the variable*/
        System.out.println("El vehiculo " + coche.isCorriente()+ " " + coche.getTipo() + " tiene una velocidad maxima de " + coche.getVelocidadMaxima() + " Km/h"); 
        
        System.out.println(moto.getTipo());
        System.out.println(moto.getVelocidadMaxima());
    }
}

class Vehiculo {
    //Atributes
    private String tipo; /*Define the variable private so it can be used only inside the class*/
    private int velocidadMaxima;
    private boolean corriente;    

    // Methods
    public void setTipo (String tipo){  // Use void bc the methods does not return
        this.tipo = tipo;
    }
    public String getTipo(){ //Set data type to make sure what it is returning
        return this.tipo;
    }
    public void setVelocidadMaxima (int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setCorriente (boolean corriente){
        this.corriente = corriente;
    }
    public boolean isCorriente() { /* For a boolean you have to use is as a get */
        return this.corriente;
    }
}