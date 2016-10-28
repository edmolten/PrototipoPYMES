package lalo.cl.prototipopymes;

public class Competencia {
    private static int ids = 0;

    private final String nombre;
    private final String rubro;
    private final float km;
    private final int drawable;

    private int id;

    public Competencia(String nombre, String rubro, float km, int drawableId) {
        this.id = ids;
        this.nombre = nombre;
        this.rubro = rubro;
        this.km = km;
        this.drawable = drawableId;
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

    public float getKm() {
        return km;
    }

    public int getDrawable() {
        return drawable;
    }

}
