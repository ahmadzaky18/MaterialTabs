package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{

    int num1;
    int num2;
    int has;
    float num3;
    float num4;
    float hasil2;
    String angka;
    String angka2;
    EditText number1;
    EditText number2;
    TextView hasil;
    Button jumlah;
    Button kurang;
    Button perkalian;
    Button pembagian;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        super.onCreate(savedInstanceState);

        number1= view.findViewById(R.id.nmbr1);
        number2 = view.findViewById(R.id.nmbr2);
        hasil = view.findViewById(R.id.Hasil);
        jumlah = view.findViewById(R.id.jumlah);
        kurang = view.findViewById(R.id.kurang);
        perkalian = view.findViewById(R.id.perkalian);
        pembagian = view.findViewById(R.id.pembagian);

        //penjumlahan

        jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka = number1.getText().toString();
                angka2 = number2.getText().toString();
                if(angka.isEmpty() || angka2.isEmpty()){
                    Toast.makeText(getContext(), "tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                }else {
                    num1 = Integer.parseInt(number1.getText().toString());
                    num2 = Integer.parseInt(number2.getText().toString());
                    has = num1 + num2;
                    hasil.setText(String.valueOf(has));
                }
            }
        });
        //pengurangan
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka = number1.getText().toString();
                angka2 = number2.getText().toString();
                if(angka.isEmpty() || angka2.isEmpty()){
                    Toast.makeText(getContext(), "tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                }else {
                    num1 = Integer.parseInt(number1.getText().toString());
                    num2 = Integer.parseInt(number2.getText().toString());
                    has = num1 - num2;
                    hasil.setText(String.valueOf(has));
                }
            }
        });
//perkalian
        perkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka = number1.getText().toString();
                angka2 = number2.getText().toString();
                if(angka.isEmpty() || angka2.isEmpty()){
                    Toast.makeText(getContext(), "tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                }else {
                    num1 = Integer.parseInt(angka);
                    num2 = Integer.parseInt(angka2);
                    has = num1 * num2;
                    hasil.setText(String.valueOf(has));
                }
            }
        });


        pembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka = number1.getText().toString();
                angka2 = number2.getText().toString();
                if(angka.isEmpty() || angka2.isEmpty()){
                    Toast.makeText(getContext(), "tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                }else {
                    num3 = Float.parseFloat(angka);
                    num4 = Float.parseFloat(angka2);
                    hasil2 = num3 / num4;
                    hasil.setText(String.valueOf(hasil2));
                    if (num4 == 0){
                        Toast.makeText(getContext(), "tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                    }else{
                        hasil.setText(String.valueOf(hasil2));
                    }
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
