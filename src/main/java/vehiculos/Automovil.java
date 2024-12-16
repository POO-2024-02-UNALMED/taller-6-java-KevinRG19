package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
    private int puestos;
    static ArrayList<Automovil> listaAutomoviles = new ArrayList<>();

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso,"FWD", fabricante);
        this.puestos = puestos;
        Automovil.listaAutomoviles.add(this);
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
