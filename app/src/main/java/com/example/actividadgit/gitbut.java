package com.example.actividadgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class gitbut extends AppCompatActivity {
    private Spinner spin;
    private TextView text1;
    private int valf, vala, valr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gitbut);
        text1=(TextView)findViewById(R.id.t1);
        spin=(Spinner)findViewById(R.id.spn1);
        String[] lista ={"Farenheit", "Revival", "El Alquimista"};
        ArrayAdapter<String > adapt=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        spin.setAdapter(adapt);
        valf=5000;
        vala=45000;
        valr=12000;
        text1.setVisibility(View.INVISIBLE);



    }
    public void Mostrar(View v){
        String opcion= spin.getSelectedItem().toString();
        if(opcion.equals("Farenheit"))
        {
            String valor= String.valueOf(valf);

            text1.setText("El valor de Farenheit es "+ valor);
            text1.setVisibility(View.VISIBLE);

        }
        if(opcion.equals("Revival"))
        {
            String valor= String.valueOf(valr);
            text1.setText("El valor de Revival es "+ valor);
            text1.setVisibility(View.VISIBLE);

        }
        if(opcion.equals("El Alquimista"))
        {
            String valor= String.valueOf(vala);
            text1.setText("El valor de El Alquimista es "+ valor);
            text1.setVisibility(View.VISIBLE);

        }
        }
}