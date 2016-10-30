package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ProductosMejorFragment extends Fragment {

    public ProductosAlertasAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1 kg Pan", "+ 4%"));
        productos.add(new Producto("2 lt Bebida", "+ 6%"));
        productos.add(new Producto("Galleta chica", "+ 1%"));
        productos.add(new Producto("Helado", "+ 2%"));
        productos.add(new Producto("Pastel de choclo", "+ 10%"));
        productos.add(new Producto("Torta Naranja Chocolate", "+ 0.5%"));

        adapter = new ProductosAlertasAdapter(inflater, productos, this);
        View view = inflater.inflate(R.layout.fragment_productos_mejor, container, false);
        ListView list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);
        return view;
    }


}
