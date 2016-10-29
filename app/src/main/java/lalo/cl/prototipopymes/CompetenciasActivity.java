package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetenciasActivity extends AppCompatActivity {

    private ListView competenciasList;
    private CompetenciasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competencia);
        competenciasList = (ListView) findViewById(R.id.list);
        adapter = new CompetenciasAdapter(this);
        competenciasList.setAdapter(adapter);
        fill();
    }

    private void fill() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("kg Pan", 600, 700));
        productos.add(new Producto("kg Harina", 500, 500));
        productos.add(new Producto("1.5 lt Bebida", 1000, 900));
        adapter.add(new Competencia("Lider", "Supermercado", "2 km", R.drawable.lider, productos));

        adapter.add(new Competencia("Jumbo", "Supermercado", "3 km", R.drawable.jumbo, null));

        adapter.add(new Competencia("El Ocaso", "Panaderia", "500 m", R.drawable.panaderia, null));
        adapter.add(new Competencia("Primavera", "Minimarket", "50 m", R.drawable.mini, null));
        adapter.add(new Competencia("Don Juan", "Minimarket", "600 m", R.drawable.mini2, null));
    }
}
