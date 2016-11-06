package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ProductosPeorFragment extends Fragment {

    public ProductosAlertasAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1 kg Pan", "- 3%"));
        productos.add(new Producto("2 lt Bebida", "- 16%"));
        productos.add(new Producto("Pastel de choclo", "- 40%"));
        productos.add(new Producto("Torta Naranja Chocolate", "- 1.8%"));
        productos.add(new Producto("Pastel de choclo", "- 30%"));
        productos.add(new Producto("Torta Naranja Chocolate", "- 5%"));
        productos.add(new Producto("Galleta chica", "- 1%"));
        productos.add(new Producto("Helado", "- 2%"));

        adapter = new ProductosAlertasAdapter(inflater, productos, this);
        View view = inflater.inflate(R.layout.fragment_productos_peor, container, false);
        ListView list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);
        return view;
    }
}
