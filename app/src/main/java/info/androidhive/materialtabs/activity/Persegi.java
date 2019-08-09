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

public class Persegi extends AppCompatActivity {
    EditText s;
    Button btnkeliling;
    Button btnluas;
    TextView hasilkeliling;
    TextView hasilluas;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        toolbar=findViewById(R.id.tollbar1);
        setSupportActionBar(toolbar);
        setTitle("PERSEGI");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        s = (EditText)findViewById(R.id.sisi);
        btnluas = (Button) findViewById(R.id.btnluas);
        btnkeliling = (Button) findViewById(R.id.btnkeliling);
        hasilkeliling =(TextView)findViewById(R.id.txt_hasil_keliling);
        hasilluas = (TextView)findViewById(R.id.txt_hasil_luas);


        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isisisi1 = s.getText().toString();
                if(isisisi1.isEmpty()){
                    Toast.makeText(getApplication(),"Sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    double s = Double.parseDouble(isisisi1);
                    double keliling2 = kelilingpersegi(s);
                    String output = String.valueOf(keliling2);
                    hasilkeliling.setText(output.toString());
                }
            }
        });

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isisisi2 = s.getText().toString();
                if(isisisi2.isEmpty()){
                    Toast.makeText(getApplication(),"Sisi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }

                else{
                    double s = Double.parseDouble(isisisi2);
                    double luas2 = LuasPersegi(s);
                    String output = String.valueOf(luas2);
                    hasilluas.setText(output.toString());
                }
            }
        });
    }


    public boolean onSupportNavigateUp() {

        finish();
        return true;
    }

    public double LuasPersegi(double sisi1){return sisi1*sisi1;}
    public double kelilingpersegi(double sisi1){return sisi1*4;}
}
