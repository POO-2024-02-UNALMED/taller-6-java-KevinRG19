package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
    private static int cantidadVehiculos;
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    static ArrayList<Pais> listaPaises = new ArrayList<>();
    static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,String traccion, Fabricante fabricante) {
        this.puertas = puertas;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.traccion = traccion;
        this.peso = peso;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos++;
        Vehiculo.listaPaises.add(this.fabricante.pais);
        Vehiculo.listaFabricantes.add(this.fabricante);
    }

    public static String vehiculosPorTipo() {
        return ("Automoviles: " + Automovil.listaAutomoviles.size() + " Camionetas: " + Camioneta.listaCamionetas.size() + " Camiones: " + Camion.listaCamiones.size());
    }




    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}