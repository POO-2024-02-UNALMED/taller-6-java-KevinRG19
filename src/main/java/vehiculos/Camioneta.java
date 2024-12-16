package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo{

    private Boolean volco;
    static ArrayList<Camioneta> listaCamionetas = new ArrayList<>();

    public Camioneta (String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.listaCamionetas.add(this);
    }


    public Boolean isVolco() {
        return volco;
    }

    public void setVolco(Boolean volco) {
        this.volco = volco;
    }
}
