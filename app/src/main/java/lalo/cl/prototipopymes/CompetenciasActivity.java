package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class CompetenciasActivity extends AppCompatActivity {

    private ListView competenciasList;
    private CompetenciasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competencia);
        competenciasList = (ListView) findViewById(R.id.list);
        adapter = new CompetenciasAdapter(this);
        getLayoutInflater();
        competenciasList.setAdapter(adapter);
        fill();
    }

    private void fill() {
        adapter.add(new Competencia("Lider", "Supermercado", 5, R.drawable.lider));
    }
}
