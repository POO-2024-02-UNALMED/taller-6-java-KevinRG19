package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo{

    private Boolean volco;
    static ArrayList<Camioneta> listaCamionetas = new ArrayList<>();

    public Camioneta(int puertas, String placa, int velocidadMaxima, String nombre, int precio, String traccion, int peso, Fabricante fabricante, Boolean volco) {
        super(puertas, placa, 90, nombre, precio, "4X4", peso, fabricante);
        this.volco = volco;
        listaCamionetas.add(this);
    }

    public Boolean isVolco() {
        return volco;
    }

    public void setVolco(Boolean volco) {
        this.volco = volco;
    }
}
