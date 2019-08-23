package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Adapter;
import info.androidhive.materialtabs.activity.Bangun;


public class FourFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<Bangun> bangunruangArrayList;
    private String[]name={
            "KUBUS",
            "BALOK",
            "TABUNG",
            "KERUCUT"


    };
private int[]photo={
        R.drawable.ic_cube,
        R.drawable.ic_beam,
        R.drawable.ic_tabung,
        R.drawable.ic_kerucut
};
    public FourFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_four, container, false);
        addData();

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adapter = new Adapter(bangunruangArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    return view;
    }

    void addData(){

        bangunruangArrayList = new ArrayList<>();
        for (int i=0;i<name.length;i++){
            Bangun bangun=new Bangun();
            bangun.setNama(name[i]);
            bangun.setPhoto(photo[i]);
            bangunruangArrayList.add(bangun);
        }
        bangunruangArrayList.add(new Bangun());


    }
    }


