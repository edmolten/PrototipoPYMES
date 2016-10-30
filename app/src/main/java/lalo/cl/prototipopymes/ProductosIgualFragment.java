package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductosIgualFragment extends Fragment {

    public ProductosAlertasAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Torta Manjar Chocolate", "- 0.7%"));
        productos.add(new Producto("Pastel de papas", "+ 0.9%"));
        productos.add(new Producto("Pie de limon", "+ 0.5%"));
        productos.add(new Producto("Berlines", "+ 0.1%"));
        productos.add(new Producto("Medias Luneas", "- 0.8%"));

        adapter = new ProductosAlertasAdapter(inflater, productos,this);
        View view = inflater.inflate(R.layout.fragment_productos_igual, container, false);
        ListView list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);
        return view;
    }
}
