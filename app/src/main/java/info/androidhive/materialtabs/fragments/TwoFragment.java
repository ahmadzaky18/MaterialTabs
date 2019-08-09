package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Lingkaran;
import info.androidhive.materialtabs.activity.Persegi;
import info.androidhive.materialtabs.activity.PersegiPanjang;
import info.androidhive.materialtabs.activity.Segitiga;


public class TwoFragment extends Fragment{

    LinearLayout btnpersegi;
    LinearLayout btnpersegipanjang;
    LinearLayout btnsegitiga;
    LinearLayout btnlingkaran;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        super.onCreate(savedInstanceState);
        btnpersegi = (LinearLayout) view.findViewById(R.id.btnpersegi);

        btnpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Persegi.class);
                startActivity(in);
            }
        });
        btnpersegipanjang = (LinearLayout) view.findViewById(R.id.btnpersegipanjang);
        // Inflate the layout for this fragment
        btnpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(in);
            }
        });
        btnsegitiga = (LinearLayout) view.findViewById(R.id.btnsegitiga);
        // Inflate the layout for this fragment
        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Segitiga.class);
                startActivity(in);
            }
        });
        btnlingkaran = (LinearLayout) view.findViewById(R.id.btnlingkaran);
        // Inflate the layout for this fragment
        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Lingkaran.class);
                startActivity(in);
            }
        });
        return view;
    }

}
