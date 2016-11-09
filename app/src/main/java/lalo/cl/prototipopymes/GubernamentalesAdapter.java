package lalo.cl.prototipopymes;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.widget.ListAdapter;

import java.util.ArrayList;

public abstract class GubernamentalesAdapter implements ListAdapter {

    static ArrayList<Gubernamental> gubernamentalesIniciales;
    static ArrayList<Gubernamental> otrosGubernamentales;

    static {
        gubernamentalesIniciales = new ArrayList<>();
        otrosGubernamentales = new ArrayList<>();
        gubernamentalesIniciales.add(new Gubernamental("Municipalidad", "347654576", "www.municipalidad.cl"));
        otrosGubernamentales.add(new Gubernamental("SEREMI", "65872464", "www.gobierno.cl"));
    }

    LayoutInflater inflater;
    ArrayList<Gubernamental> gubernamentales;

    public GubernamentalesAdapter(LayoutInflater inflater) {
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
        return gubernamentales.size();
    }

    @Override
    public Object getItem(int position) {
        return gubernamentales.get(position);
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
        return gubernamentales.isEmpty();
    }
}
