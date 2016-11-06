package lalo.cl.prototipopymes;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class IndicadoresAdapter implements ListAdapter {

    static ArrayList<Indicador> indicadores;

    static {
        indicadores = new ArrayList<>();

    }

    AppCompatActivity activity;

    public IndicadoresAdapter(AppCompatActivity activity) {
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
        return indicadores.size();
    }

    @Override
    public Object getItem(int position) {
        return indicadores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaIndicador = activity.getLayoutInflater().inflate(R.layout.view_externo, null);
        TextView nombre = (TextView) vistaIndicador.findViewById(R.id.nombre);
        TextView valor = (TextView) vistaIndicador.findViewById(R.id.valor);

        Indicador indicador = indicadores.get(position);
        nombre.setText(indicador.getNombre());
        valor.setText(indicador.getValor());
        return vistaIndicador;
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
        return indicadores.isEmpty();
    }
}
