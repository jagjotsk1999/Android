package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText one;
    TextView two;
    Button usd,yen,pound,euro;
    double usdr=0.014;
    double yenr=1.56;
    double poundr=0.011;
    double euror=0.013;
    double val;
    boolean usdflag=false;
    boolean yenflag=false;
    boolean poundflag=false;
    boolean euroflag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        usd=findViewById(R.id.usd);
        yen=findViewById(R.id.yen);
        pound=findViewById(R.id.pound);
        euro=findViewById(R.id.euro);
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                val=Double.valueOf(""+one.getText());
                usdflag=true;
                if (usdflag)
                {
                    two.setText(""+(val*usdr));
                }
            }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Field Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                val=Double.valueOf(""+one.getText());
                yenflag=true;
                if (yenflag)
                {
                    two.setText(""+(val*yenr));
                }
            }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Field Empty", Toast.LENGTH_SHORT).show();

                }}
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                val=Double.valueOf(""+one.getText());
                poundflag=true;
                if (poundflag)
                {
                    two.setText(""+(val*poundr));
                }
            }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Field Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                val=Double.valueOf(""+one.getText());
                euroflag=true;
                if (euroflag)
                {
                    two.setText(""+(val*euror));
                }
            }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Field Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
