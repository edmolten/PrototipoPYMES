package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class CalendarioActivity extends AppCompatActivity {

    private ArrayList<Evento> eventos1;
    private ArrayList<Evento> eventos2;
    private EventoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        createAdapter();
    }

    private void createAdapter() {
        this.eventos1 = new ArrayList<>();
        eventos1.add(new Evento("Ir a cobrar", "De 14:00 a 16:00", "Hector 98679834"));
        eventos1.add(new Evento("Ir a pagar", "De 08:00 a 16:00", "Banco 234532473"));
        eventos1.add(new Evento("Comprar mercadería", "Todo el día", "Tienda 21321312"));
        this.adapter = new EventoAdapter(eventos1, getLayoutInflater());
        ListView eventosLista = (ListView) findViewById(R.id.list_eventos);
        eventosLista.setAdapter(adapter);

    }
}
