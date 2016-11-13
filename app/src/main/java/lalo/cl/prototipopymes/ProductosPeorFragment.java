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
        productos.add(new Producto("Resultado Negocio", "- % 9,71"));
        adapter = new ProductosAlertasAdapter(inflater, productos, this);
        View view = inflater.inflate(R.layout.fragment_productos_peor, container, false);
        ListView list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);
        return view;
    }
}
