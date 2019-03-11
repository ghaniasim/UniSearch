package com.example.zakaria.unisearch;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

//    public ListFragment() {
//        // Required empty public constructor
//    }
//

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = view.findViewById(R.id.listView);
        UniversityList.getInstance().add();

        ArrayAdapter<University> adapter = new ArrayAdapter<University>(
                getActivity(), android.R.layout.simple_list_item_1, UniversityList.getInstance().getUniversityList());
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }


}
