package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo{

    private int ejes;
    static ArrayList<Camion> listaCamiones = new ArrayList<>();

    public Camion(int puertas, String placa, int velocidadMaxima, String nombre, int precio, String traccion, int peso, Fabricante fabricante, int ejes) {
        super(2, placa, 80, nombre, precio, "4X2", peso, fabricante);
        this.ejes = ejes;
        listaCamiones.add(this);
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
