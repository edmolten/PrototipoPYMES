package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ExternosActivityFragment extends Fragment {

    IndicadoresInicialesAdapter adapter;
    android.widget.ListView indicadoresList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_externos, container, false);
        indicadoresList = (android.widget.ListView) v.findViewById(R.id.list);
        adapter = new IndicadoresInicialesAdapter(inflater);
        indicadoresList.setAdapter(adapter);
        ((ExternosActivity)getActivity()).setListAndAdapter(adapter,indicadoresList);
        return v;
    }
}
