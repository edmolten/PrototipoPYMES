package lalo.cl.prototipopymes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.View;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CalendarioActivity extends AppCompatActivity {


    EventoAdapter adapter;
    static HashMap<Integer,ArrayList<Evento>> mapa;
    static{
        mapa = new HashMap<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Cobrar Cosemar", "De 14:00 a 16:00", "Joyse Carmona 995316953"));
        eventos.add(new Evento("Reunión Compite", "14:00", " Paul Trench 982337052"));
        mapa.put(2,eventos);
        eventos = new ArrayList<>();
        eventos.add(new Evento("Entregar Carozzi", "08:00", "Francisca Marchall 993099588"));
        eventos.add(new Evento("Comprar tela", "09:00", "Maite 995599578"));
        eventos.add(new Evento("Depositar Cheque", "Hora banco", "Oscar Iriarte 967099908"));
        mapa.put(10,eventos);
        eventos = new ArrayList<>();
        eventos.add(new Evento("Hacer prueba Uniformes Bomberos, Alvarez #225", "10:00", "-"));
        eventos.add(new Evento("Llamar a German", "13:00", "58821465"));
        eventos.add(new Evento("Licitación Esval: Calle Esmeralda #550", "15:00", "-"));
        mapa.put(15,eventos);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario2);
        MonthView cal = (MonthView) findViewById(R.id.cal);
        cal.setActivity(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), NuevoEvento.class),1);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        setContentView(R.layout.activity_calendario2);
        MonthView cal = (MonthView) findViewById(R.id.cal);
        cal.setActivity(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), NuevoEvento.class),1);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
