package lalo.cl.prototipopymes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GubernamentalesInicialesAdapter extends GubernamentalesAdapter {

    public GubernamentalesInicialesAdapter(LayoutInflater inflater) {
        super(inflater);
        this.gubernamentales = GubernamentalesAdapter.gubernamentalesIniciales;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaGubernamental = inflater.inflate(R.layout.view_gubernamental, null);
        TextView nombre = (TextView) vistaGubernamental.findViewById(R.id.nombre);
        TextView numero = (TextView) vistaGubernamental.findViewById(R.id.numero);
        TextView link = (TextView) vistaGubernamental.findViewById(R.id.link);
        Gubernamental gubernamental = gubernamentales.get(position);
        nombre.setText(gubernamental.nombre);
        numero.setText(gubernamental.numero);
        link.setText(gubernamental.link);
        return vistaGubernamental;
    }

}
