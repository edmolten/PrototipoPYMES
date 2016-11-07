package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class AgregarExternosActivity extends AppCompatActivity {

    IndicadoresReservaAdapter adapter;
    ListView indicadoresList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_externos);
        indicadoresList = (ListView) findViewById(R.id.list);
        adapter = new IndicadoresReservaAdapter(getLayoutInflater(),this);
        indicadoresList.setAdapter(adapter);
    }
}
