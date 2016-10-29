package lalo.cl.prototipopymes;

import java.util.ArrayList;

public class Competencia {
    private static int ids = 0;

    private final String nombre;
    private final String rubro;
    private final String km;
    private final int drawable;


    private ArrayList<Producto> productos;
    private int id;

    public Competencia(String nombre, String rubro, String km, int drawableId, ArrayList<Producto> productos) {
        this.productos = productos;
        this.id = ids;
        this.nombre = nombre;
        this.rubro = rubro;
        this.km = km;
        this.drawable = drawableId;
        this.productos = productos;
        Competencia.ids++;
    }


    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public String getKm() {
        return km;
    }

    public int getDrawable() {
        return drawable;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

}
