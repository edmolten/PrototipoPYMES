package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class AgregarGubernamentalesActivity extends AppCompatActivity {

    GubernamentalesReservaAdapter adapter;
    ListView gubernamentalesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_gubernamentales);
    }

    public void onClick(View v){
        EditText nombreET = (EditText)findViewById(R.id.nombre);
        EditText numeroET = (EditText)findViewById(R.id.numero);
        EditText webET = (EditText)findViewById(R.id.web);
        Gubernamental g = new Gubernamental(nombreET.getText().toString(),numeroET.getText().toString(),webET.getText().toString());
        GubernamentalesAdapter.gubernamentalesIniciales.add(g);
        finish();
    }
}
