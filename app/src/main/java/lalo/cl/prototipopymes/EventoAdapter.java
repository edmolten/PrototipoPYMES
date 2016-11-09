package lalo.cl.prototipopymes;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventoAdapter implements ListAdapter {

    LayoutInflater inflater;
    ArrayList<Evento> eventos;

    EventoAdapter(ArrayList<Evento> eventos, LayoutInflater inflater) {
        this.inflater = inflater;
        this.eventos = eventos;
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
        return eventos.size();
    }

    @Override
    public Object getItem(int position) {
        return eventos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaEvento = inflater.inflate(R.layout.evento_view, null);
        TextView descripcion = (TextView) vistaEvento.findViewById(R.id.descripcion);
        TextView hora = (TextView) vistaEvento.findViewById(R.id.hora);
        TextView contacto = (TextView) vistaEvento.findViewById(R.id.contacto);
        Evento evento = eventos.get(position);
        descripcion.setText(evento.descripcion);
        hora.setText(evento.hora);
        contacto.setText(evento.contacto);
        return vistaEvento;
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
        return eventos.isEmpty();
    }
}
