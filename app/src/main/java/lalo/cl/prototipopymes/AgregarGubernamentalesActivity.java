package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class AgregarGubernamentalesActivity extends AppCompatActivity {

    GubernamentalesReservaAdapter adapter;
    ListView gubernamentalesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_gubernamentales);
        gubernamentalesList = (ListView) findViewById(R.id.list);
        adapter = new GubernamentalesReservaAdapter(getLayoutInflater(), this);
        gubernamentalesList.setAdapter(adapter);
    }
}
