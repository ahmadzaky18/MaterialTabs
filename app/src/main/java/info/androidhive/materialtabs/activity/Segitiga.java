package info.androidhive.materialtabs.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Segitiga extends AppCompatActivity {
    EditText A ;
    EditText T;
    Button btnkeliling;
    Button btnluas;
    TextView hasilkeliling;
    TextView hasilluas;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        A = (EditText)findViewById(R.id.Alas);
        T = (EditText)findViewById(R.id.Tinggi);
        toolbar=findViewById(R.id.tollbar1);
        setTitle("SEGITIGA");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnluas = (Button) findViewById(R.id.btnluas);
        btnkeliling = (Button) findViewById(R.id.btnkeliling);
        hasilkeliling =(TextView)findViewById(R.id.txt_hasil_keliling);
        hasilluas = (TextView)findViewById(R.id.txt_hasil_luas);

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(A.length()==0 && T.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (A.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (T.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = A.getText().toString();
                    String isitinggi = T.getText().toString();
                    double A = Double.parseDouble(isialas);
                    double T = Double.parseDouble(isitinggi);
                    double hs = Luassegitiga(A,T);
                    String output = String.valueOf(hs);
                    hasilluas.setText(output.toString());
                }
            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(A.length()==0 && T.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (A.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (T.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = A.getText().toString();
                    double A = Double.parseDouble(isialas);
                    double hs = kelilingsegitiga(A);
                    String output = String.valueOf(hs);
                    hasilkeliling.setText(output.toString());
                }
            }
        });
    }
    public boolean onSupportNavigateUp() {

        finish();
        return true;
    }
    public double Luassegitiga(double A, double T){return 2/A*T;}
    public double kelilingsegitiga( double A){return 3*A;}
}
