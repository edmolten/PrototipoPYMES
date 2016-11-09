package lalo.cl.prototipopymes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class IndicadoresInicialesAdapter extends IndicadoresAdapter {
    public IndicadoresInicialesAdapter(LayoutInflater inflater) {
        super(inflater);
        this.gubernamentales = IndicadoresAdapter.indicadoresIniciales;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaIndicador = inflater.inflate(R.layout.view_externo, null);
        TextView nombre = (TextView) vistaIndicador.findViewById(R.id.indicador);
        TextView valor = (TextView) vistaIndicador.findViewById(R.id.valor);
        Indicador indicador = gubernamentales.get(position);
        nombre.setText(indicador.getNombre());
        valor.setText(indicador.getValor());
        return vistaIndicador;
    }

}
