package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;          // indica si la camioneta tiene volcó
    private static int contador=0;  // número total de camionetas creadas
    
    // constructor de la clase Camioneta
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante f, boolean a){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", f);  // invoca el constructor de la clase padre (Vehiculo)
        volco = a;                  // inicializa si la camioneta tiene volcó o no
        contador++;                 // incrementa el contador de camionetas creadas
    }
    
    // método setter para indicar si la camioneta tiene volcó o no
    public void setVolco(boolean b){
        volco = b;
    }
    
    // método getter para verificar si la camioneta tiene volcó o no
    public boolean isVolco(){
        return volco;
    }
    
    // método getter para el número total de camionetas creadas
    public static int getContador(){
        return contador;
    }
}