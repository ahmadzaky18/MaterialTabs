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

public class Lingkaran extends AppCompatActivity {
    EditText jr;
    Button btnkeliling;
    Button btnluas;
    TextView hasilkeliling;
    TextView hasilluas;
    private Toolbar toolbar;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jr = (EditText)findViewById(R.id.jari);
        btnluas = (Button) findViewById(R.id.btnluas);
        setTitle("LINGKARAN");
        toolbar=findViewById(R.id.tollbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnkeliling = (Button) findViewById(R.id.btnkeliling);
        hasilkeliling =(TextView)findViewById(R.id.txt_hasil_keliling);
        hasilluas = (TextView)findViewById(R.id.txt_hasil_luas);

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isijari1 = jr.getText().toString();
                if(isijari1.isEmpty()){
                    Toast.makeText(getApplication(),"Jari-Jari tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    double jr = Double.parseDouble(isijari1);
                    double keliling2 =kelilinglingkaran (jr);

                    String output = String.valueOf(keliling2);
                    hasilkeliling.setText(output.toString());
                }
            }
        });

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isijari2 = jr.getText().toString();
                if(isijari2.isEmpty()){
                    Toast.makeText(getApplication(),"Sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }

                else{
                    double jr = Double.parseDouble(isijari2);
                    double luas2 = Luaslingkaran(jr);
                    String output = String.valueOf(luas2);
                    hasilluas.setText(output.toString());
                }
            }
        });
    }
    public boolean onSupportNavigateUp(){

        finish();
        return true;
    }
    public double Luaslingkaran(double jr){
        return 3.14*jr;
    }
    public double kelilinglingkaran( double jr){return 2*3.14*jr;}

}
