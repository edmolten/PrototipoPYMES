package lalo.cl.prototipopymes;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.widget.ListAdapter;

import java.util.ArrayList;

public abstract class IndicadoresAdapter implements ListAdapter {

    static ArrayList<Indicador> indicadoresIniciales;
    static ArrayList<Indicador> otrosIndicadores;

    static {
        indicadoresIniciales = new ArrayList<>();
        otrosIndicadores = new ArrayList<>();
        indicadoresIniciales.add(new Indicador("IPC", "4.6 %"));
        indicadoresIniciales.add(new Indicador("Dolar", "$ 649"));
        indicadoresIniciales.add(new Indicador("UTM", "$ 46.091"));
        otrosIndicadores.add(new Indicador("UF", "$ 26.276,75"));
        otrosIndicadores.add(new Indicador("Sueldo Mínimo", "$ 257.500"));
        otrosIndicadores.add(new Indicador("% Economía nacional", "3.2 %"));
        otrosIndicadores.add(new Indicador("% Cesantía", "6.8 %"));
    }

    LayoutInflater inflater;
    ArrayList<Indicador> indicadores;

    public IndicadoresAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
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
