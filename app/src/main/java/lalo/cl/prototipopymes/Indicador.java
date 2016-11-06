package lalo.cl.prototipopymes;

public class Indicador {

    private final String valor;
    private final String nombre;

    public Indicador(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }
}
