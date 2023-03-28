package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;            // número de asientos del automóvil
    private static int contador = 0;    // número total de automóviles creados
    
    // constructor de la clase Automovil
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante f, int algo){
        super(placa,4,100,nombre,precio,peso,"FWD",f);   // invoca el constructor de la clase padre (Vehiculo)
        puestos = algo;             // inicializa el número de asientos del automóvil
        contador = contador + 1;                 // incrementa el contador de automóviles creados
    }
    
    // método setter para el número de asientos del automóvil
    public void setPuestos(int n){
        puestos = n;
    }
    
    // método getter para el número de asientos del automóvil
    public int getPuestos(){
        return puestos;
    }
    
    // método getter para el número total de automóviles creados
    public static int getContador(){
        return contador;
    }
}
