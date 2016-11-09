package lalo.cl.prototipopymes;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GubernamentalesReservaAdapter extends GubernamentalesAdapter {

    private final AppCompatActivity activity;

    public GubernamentalesReservaAdapter(LayoutInflater inflater, AppCompatActivity activity) {
        super(inflater);
        this.gubernamentales = GubernamentalesAdapter.otrosGubernamentales;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaGubernamental = inflater.inflate(R.layout.view_gubernamental, null);
        TextView nombre = (TextView) vistaGubernamental.findViewById(R.id.nombre);
        TextView numero = (TextView) vistaGubernamental.findViewById(R.id.numero);
        TextView link = (TextView) vistaGubernamental.findViewById(R.id.link);
        final Gubernamental gubernamental = gubernamentales.get(position);
        nombre.setText(gubernamental.nombre);
        numero.setText(gubernamental.numero);
        link.setText(gubernamental.link);
        vistaGubernamental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gubernamentales.remove(gubernamental);
                GubernamentalesAdapter.gubernamentalesIniciales.add(gubernamental);
                activity.finish();
            }
        });
        return vistaGubernamental;
    }
}
