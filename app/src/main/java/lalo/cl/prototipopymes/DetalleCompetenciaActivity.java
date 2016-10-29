package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import static lalo.cl.prototipopymes.CompetenciasAdapter.competencias;

public class DetalleCompetenciaActivity extends AppCompatActivity {

    ProductosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_competencia);
        int index = getIntent().getIntExtra("index", 0);
        Competencia thisCompetencia = competencias.get(index);
        setTitle(thisCompetencia.getNombre());
        ListView competenciasList = (ListView) findViewById(R.id.prod_list);
        adapter = new ProductosAdapter(this, thisCompetencia);
        competenciasList.setAdapter(adapter);
    }
}
