package lalo.cl.prototipopymes;


public class Producto {

    static int ids = 0;
    private final int id;
    private final String nombre;
    private final int pMi;
    private final int pComp;

    Producto(String nombre, int pMi, int pComp) {
        this.nombre = nombre;
        this.pMi = pMi;
        this.pComp = pComp;
        this.id = ids;
        ids++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getpMi() {
        return pMi;
    }

    public int getpComp() {
        return pComp;
    }

}

