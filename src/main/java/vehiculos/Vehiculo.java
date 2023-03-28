package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion = "FWD";
    private Fabricante fabricante;
    private static int cantidadVehiculos;
    
    public Vehiculo(String p, int pt, int vm, String n, int pr, int ps, String t, Fabricante f){
        placa = p;
        puertas = pt;
        velocidadMaxima = vm;
        nombre = n;
        precio = pr;
        peso = ps;
        traccion = t;
        fabricante = f;
        cantidadVehiculos = cantidadVehiculos + 1;
        fabricante.contar();
        fabricante.getPais().contar();
    }
    
    public void setNombre(String n){
       nombre = n;
    }
    
    public void setPlaca(String n){
       placa = n;
    }
    
    public void setPuertas(int n){
       puertas = n;
    }
    
    public void setVelocidadMaxima(int n){
       velocidadMaxima = n;
    }
    
    public void setPrecio(int n){
       precio = n;
    }
    
    public void setPeso(int n){
       peso = n;
    }
    
    public void setTraccion(String n){
       traccion = n;
    }
    
    public void setFabricante(Fabricante n){
       fabricante = n;
    }
    
    public static void setCantidadVehiculos(int n){
        cantidadVehiculos = n;
    }
   
    public String getNombre(){
       return nombre;
    }
    
    public String getPlaca(){
       return placa;
    }
   
    public int getPuertas(){
       return puertas;
    }
    
    public int getVelocidadMaxima(){
       return velocidadMaxima;
    }
   
    public int getPrecio(){
       return precio;
    }
    
    public int getPeso(){
       return peso;
    }
   
    public String getTraccion(){
       return traccion;
    }
    
    public Fabricante getFabricante(){
       return fabricante;
    }
    
    public static int getCantidadVehiculos(){
        return cantidadVehiculos;
    }
    
    public static  String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getContador() + "\nCamionetas: " + Camioneta.getContador() + "\nCamiones: " + Camion.getContador();

    }
    
    
    
}