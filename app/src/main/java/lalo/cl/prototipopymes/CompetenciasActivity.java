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
        productos.add(new Producto("Polera Piqué", 7900, 8900));
        productos.add(new Producto("Polera Polo", 5900, 4900));
        productos.add(new Producto("Casaca Softshell", 26900, 24900));
        productos.add(new Producto("Micropolar", 14900, 13900));
        adapter.add(new Competencia("AYC", "Bordado, estampado y confecciones", "300 m", R.drawable.ayc, productos));

        productos = new ArrayList<>();
        productos.add(new Producto("Poleron deportivo", 22900, 26900));
        productos.add(new Producto("Equipo Rugby", 24900, 29900));
        productos.add(new Producto("Equipo Futbol", 23900, 26900));
        productos.add(new Producto("Camiseta", 12900, 12900));
        adapter.add(new Competencia("Drava", "Ropa deportiva", "120 km", R.drawable.drava, productos));

        productos = new ArrayList<>();
        productos.add(new Producto("Poleron generación", 18900, 18900));
        productos.add(new Producto("Cortaviento Americano", 23900, 24900));
        adapter.add(new Competencia("Bambole", "Ropa de colegio y universidad", "10 km", R.drawable.bambole, productos));

    }
}
