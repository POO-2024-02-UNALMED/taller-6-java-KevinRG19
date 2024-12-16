package vehiculos;

public class Fabricante {
    private String nombre;
    Pais pais;


    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricanteMasVendedor = null;
        int maxOcurrencias = 0;

        for (Fabricante fabricante : Vehiculo.listaFabricantes) {
            int contador = 1;
            for (Fabricante fabricante1 : Vehiculo.listaFabricantes) {
                if (fabricante.nombre.equals(fabricante1.nombre)) {
                    contador++;
                }
            }
            if (contador > maxOcurrencias) {
                maxOcurrencias = contador;
                fabricanteMasVendedor = fabricante;
            }

        }
        return fabricanteMasVendedor;

    }
    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}