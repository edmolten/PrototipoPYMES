package lalo.cl.prototipopymes;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import static lalo.cl.prototipopymes.CalendarioActivity.mapa;

public class NuevoEvento extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    int year,month,day,hour,min;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;
    private Button botonHora;
    private Button botonDia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_evento);
        Calendar c = Calendar.getInstance();

        SimpleDateFormat format = new SimpleDateFormat("dd", Locale.getDefault());
        day = Integer.valueOf(format.format(c.getTime()));
        format = new SimpleDateFormat("MM", Locale.getDefault());
        month = Integer.valueOf(format.format(c.getTime()));
        format = new SimpleDateFormat("yyyy", Locale.getDefault());
        year = Integer.valueOf(format.format(c.getTime()));
        format = new SimpleDateFormat("HH", Locale.getDefault());
        hour = Integer.valueOf(format.format(c.getTime()));
        botonDia = (Button) findViewById(R.id.botonDia);
        format = new SimpleDateFormat("mm", Locale.getDefault());
        min = Integer.valueOf(format.format(c.getTime()));

        botonDia = (Button) findViewById(R.id.botonDia);
        format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        botonDia.setText(format.format(c.getTime()));
        botonDia = (Button) findViewById(R.id.botonDia);
        format = new SimpleDateFormat("HH:mm", Locale.getDefault());
        botonHora = (Button) findViewById(R.id.botonHora);
        botonHora.setText(format.format(c.getTime()));

        datePickerDialog = new DatePickerDialog(this,this,2016,11,1);
        timePickerDialog = new TimePickerDialog(this,this,14,0,false);

    };

    public void pickDate(View v){
        datePickerDialog.show();
    }
    public void pickTime(View v){
        timePickerDialog.show();
    }
    public void ok(View v){
        String contacto = ((EditText)findViewById(R.id.contacto)).getText().toString();
        String descripcion = ((EditText)findViewById(R.id.descripcion)).getText().toString();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MINUTE,min);
        c.set(Calendar.HOUR,hour);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm", Locale.getDefault());
        if(mapa.containsKey(day)){
            mapa.get(day).add(new Evento(contacto,format.format(c.getTime()),descripcion));
        }
        else{
            ArrayList<Evento> e = new ArrayList<>();
            e.add(new Evento(descripcion,format.format(c.getTime()),contacto));
            mapa.put(day,e);
        }
        finish();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        c.set(Calendar.MONTH,monthOfYear);
        c.set(Calendar.YEAR,year);
        this.year = year;
        this.month = monthOfYear;
        this.day = dayOfMonth;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        this.botonDia.setText(format.format(c.getTime()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MINUTE,minute);
        c.set(Calendar.HOUR,hourOfDay);
        this.hour = hourOfDay;
        this.min = minute;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm", Locale.getDefault());
        this.botonHora.setText(format.format(c.getTime()));
    }
}
