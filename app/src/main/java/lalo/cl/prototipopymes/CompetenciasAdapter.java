package lalo.cl.prototipopymes;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CompetenciasAdapter implements ListAdapter {

    public static ArrayList<Competencia> competencias;
    AppCompatActivity activity;

    public CompetenciasAdapter(AppCompatActivity activity) {
        competencias = new ArrayList<>();
        this.activity = activity;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return competencias.size();
    }

    @Override
    public Object getItem(int position) {
        return competencias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return competencias.get(position).getId();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaCompetencia = activity.getLayoutInflater().inflate(R.layout.view_competencia, null);

        ImageView imagen = (ImageView) vistaCompetencia.findViewById(R.id.imagen);
        TextView nombre = (TextView) vistaCompetencia.findViewById(R.id.nombre);
        TextView rubro = (TextView) vistaCompetencia.findViewById(R.id.rubro);
        TextView km = (TextView) vistaCompetencia.findViewById(R.id.km);

        final Competencia competencia = competencias.get(position);
        imagen.setImageDrawable(ContextCompat.getDrawable(activity, competencia.getDrawable()));
        nombre.setText(competencia.getNombre());
        rubro.setText(competencia.getRubro());
        km.setText(String.format("A %s", competencia.getKm()));
        vistaCompetencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(activity, DetalleCompetenciaActivity.class);
                i.putExtra("index", competencias.indexOf(competencia));
                activity.startActivity(i);
            }
        });
        return vistaCompetencia;
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return competencias.isEmpty();
    }

    public void add(Competencia competencia) {
        competencias.add(competencia);
    }
}
