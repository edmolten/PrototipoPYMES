package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class GubernamentalesActivityFragment extends Fragment {

    GubernamentalesInicialesAdapter adapter;
    ListView gubernamentalesList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_externos, container, false);
        gubernamentalesList = (android.widget.ListView) v.findViewById(R.id.list);
        adapter = new GubernamentalesInicialesAdapter(inflater);
        gubernamentalesList.setAdapter(adapter);
        ((GubernamentalesActivity) getActivity()).setListAndAdapter(adapter, gubernamentalesList);
        return v;
    }
}
