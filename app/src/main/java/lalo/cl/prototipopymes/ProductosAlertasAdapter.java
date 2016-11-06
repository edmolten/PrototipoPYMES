package lalo.cl.prototipopymes;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class ProductosAlertasAdapter extends ProductosAdapter {

    LayoutInflater inflater;

    public ProductosAlertasAdapter(LayoutInflater inflater, ArrayList<Producto> productos, Fragment fragment) {
        super(null, null);
        this.inflater = inflater;
        this.productos = productos;
        this.fragment = fragment;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaProducto = inflater.inflate(R.layout.alerta_item, null);
        TextView nombre = (TextView) vistaProducto.findViewById(R.id.nombre);
        TextView pcent = (TextView) vistaProducto.findViewById(R.id.pcent);
        Producto producto = productos.get(position);
        nombre.setText(producto.getNombre());
        String pcentText = producto.getPcent();
        char sign = pcentText.charAt(0);
        int color;
        if (fragment instanceof ProductosIgualFragment) {
            color = R.color.yellow;
        } else {
            if (sign == '+') {
                color = R.color.green;

            } else {
                color = R.color.red;
            }
        }
        pcent.setTextColor(fragment.getResources().getColor(color));
        pcent.setText(producto.getPcent());
        return vistaProducto;
    }
}
