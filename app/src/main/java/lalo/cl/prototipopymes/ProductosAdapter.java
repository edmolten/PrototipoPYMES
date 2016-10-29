package lalo.cl.prototipopymes;

import android.database.DataSetObserver;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductosAdapter implements ListAdapter {

    ArrayList<Producto> productos;
    AppCompatActivity activity;

    public ProductosAdapter(AppCompatActivity activity, Competencia thisCompetencia) {
        productos = thisCompetencia.getProductos();
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
        return productos.size();
    }

    @Override
    public Object getItem(int position) {
        return productos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return productos.get(position).getId();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaProducto = activity.getLayoutInflater().inflate(R.layout.view_producto, null);
        TextView nombre = (TextView) vistaProducto.findViewById(R.id.nombre);
        TextView p_comp = (TextView) vistaProducto.findViewById(R.id.p_comp);
        TextView p_mi = (TextView) vistaProducto.findViewById(R.id.p_mi);
        TextView pcent = (TextView) vistaProducto.findViewById(R.id.pcent);

        final Producto producto = productos.get(position);
        nombre.setText(producto.getNombre());
        float pMi = (float) producto.getpMi();
        float pComp = (float) producto.getpComp();
        p_mi.setText("$ " + String.valueOf(pMi));
        p_comp.setText("$" + String.valueOf(pComp));
        if (pMi > pComp) {
            pcent.setText(String.format("%%%.1f mas caro", 100*((pMi-pComp)/pComp)));
            pcent.setTextColor(activity.getResources().getColor(R.color.red));
        } else if (pMi < pComp) {
            pcent.setText(String.format("%%%.1f mas barato", 100*((pComp-pMi) / pMi)));
            pcent.setTextColor(activity.getResources().getColor(R.color.green));
        } else {
            pcent.setText("Mismo precio");
        }
        return vistaProducto;
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
        return productos.isEmpty();
    }
}
