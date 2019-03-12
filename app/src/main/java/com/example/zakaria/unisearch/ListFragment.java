package com.example.zakaria.unisearch;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = view.findViewById(R.id.listView);
        UniversityList.getInstance().add();

        ArrayAdapter<University> adapter = new ArrayAdapter<University>(
                getActivity(), android.R.layout.simple_list_item_1, UniversityList.getInstance().getUniversityList());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getActivity(), UniversityDetail.class);
                intent.putExtra("universityIndex", i);
                startActivity(intent);
            }

        });

        // Inflate the layout for this fragment
        return view;


    }


}
