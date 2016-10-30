package lalo.cl.prototipopymes;


public class Producto {

    static int ids = 0;
    private int id;
    private String nombre;
    private int pMi;
    private int pComp;
    private String pcent;

    Producto(String nombre, int pMi, int pComp) {
        this.nombre = nombre;
        this.pMi = pMi;
        this.pComp = pComp;
        this.id = ids;
        ids++;
    }

    Producto(String nombre, String pcent) {
        this.nombre = nombre;
        this.pcent = pcent;
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

    public String getPcent() {
        return pcent;
    }
}

