package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> listado = new ArrayList();  // lista de todos los países creados
    private int contador;    // contador de vehículos vendidos de este país
    
    public Pais(String n){
        nombre = n;
        listado.add(this);   // agrega este país a la lista de países creados
        contador = 0;        // inicializa el contador de vehículos vendidos de este país en 0
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void contar(){
        contador = contador + 1;     // incrementa el contador de vehículos vendidos de este país
     }
    
    public int getContador(){
         return contador;     // retorna el contador de vehículos vendidos de este país
     }
    
    public static Pais paisMasVendedor(){
         int s = 0;         // variable para almacenar el contador más grande encontrado hasta ahora
         Pais p = null;     // variable para almacenar el país que tiene el contador más grande encontrado hasta ahora
         for(int i = 0; i < listado.size(); i++){     // itera por cada país en la lista de países creados
             if (listado.get(i).getContador() > s){   // si el contador de vehículos vendidos de este país es mayor que s,
                s = listado.get(i).getContador();    // actualiza el valor de s
                p = listado.get(i);                  // actualiza el valor de p
             }      
         }
         return p;    // retorna el país con el contador más grande encontrado
    }
}