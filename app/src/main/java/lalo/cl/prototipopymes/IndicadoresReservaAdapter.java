package lalo.cl.prototipopymes;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class IndicadoresReservaAdapter extends IndicadoresAdapter {

    private final AppCompatActivity activity;

    public IndicadoresReservaAdapter(LayoutInflater inflater, AppCompatActivity activity) {
        super(inflater);
        this.gubernamentales = IndicadoresAdapter.otrosIndicadores;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaIndicador = inflater.inflate(R.layout.view_externo, null);
        TextView nombre = (TextView) vistaIndicador.findViewById(R.id.indicador);
        TextView valor = (TextView) vistaIndicador.findViewById(R.id.valor);
        final Indicador indicador = gubernamentales.get(position);
        nombre.setText(indicador.getNombre());
        valor.setText("");
        vistaIndicador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gubernamentales.remove(indicador);
                IndicadoresAdapter.indicadoresIniciales.add(indicador);

                activity.finish();
            }
        });
        return vistaIndicador;
    }
}
