package vehiculos;

public class Pais {
    private String nombre;


    public Pais(String nombre) {
        this.nombre = nombre;

    }

    public static Pais paisMasVendedor() {
        Pais paisMasVendedor = null;
        int maxOcurrencias = 0;

        for (Pais pais : Vehiculo.listaPaises) {
            int contador = 1;
            for (Pais pais1 : Vehiculo.listaPaises) {
                if (pais.nombre.equals(pais1.nombre)) {
                    contador++;
                }
            }
            if (contador > maxOcurrencias) {
                maxOcurrencias = contador;
                paisMasVendedor = pais;
            }

        }
        return paisMasVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}