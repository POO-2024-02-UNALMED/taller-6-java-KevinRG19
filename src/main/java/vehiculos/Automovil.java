package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
    private int puestos;
    static ArrayList<Automovil> listaAutomoviles = new ArrayList<>();

    public Automovil(int puertas, String placa, int velocidadMaxima, String nombre, int precio, String traccion, int peso, Fabricante fabricante, int puestos ) {
        super(4, placa, 100, nombre, precio, "FWD", peso, fabricante);
        this.puestos = puestos;
        listaAutomoviles.add(this);
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
