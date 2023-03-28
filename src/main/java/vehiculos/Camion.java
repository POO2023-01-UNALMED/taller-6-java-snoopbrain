package vehiculos;

public class Camion extends Vehiculo {
    int ejes;                       // número de ejes del camión
    private static int contador=0;  // número total de camiones creados
        
    // constructor de la clase Camion
    public Camion(String placa, String nombre, int precio, int peso, Fabricante f, int algo){
        super(placa, 2, 80, nombre, precio, peso, "4X2", f);   // invoca el constructor de la clase padre (Vehiculo)
        ejes = algo;                // inicializa el número de ejes del camión
        contador = contador + 1;                 // incrementa el contador de camiones creados
    }
    
    // método setter para el número de ejes del camión
    public void setEjes(int e){
        ejes = e;
    }
    
    // método getter para el número de ejes del camión
    public int getEjes(){
        return ejes;
    }
    
    // método getter para el número total de camiones creados
    public static int getContador(){
        return contador;
    } 
}