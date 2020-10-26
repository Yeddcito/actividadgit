package com.example.actividadgit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private EditText user, pass;
    private ProgressBar progress;
    private ImageButton butimag;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user =(EditText)findViewById(R.id.texted1);
        pass=(EditText)findViewById((R.id.texted2));
        progress= (ProgressBar)findViewById(R.id.barrapro1);
        butimag=(ImageButton)findViewById(R.id.imagv);
        btn=(Button)findViewById(R.id.b1);

        progress.setVisibility(View.INVISIBLE);
        butimag.setVisibility(View.INVISIBLE);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });


}







    class Task extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() {
            progress.setVisibility(View.VISIBLE);


        }
        @Override
        protected String doInBackground(String... strings) {
            for(int i=1; i<=10; i++)
            {
                try{
                    Thread.sleep(1000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
            }
            return null;
        }



        @Override
        protected void onPostExecute(String s) {
            progress.setVisibility(View.INVISIBLE);

            butimag.setVisibility(View.VISIBLE);


        }
    }

    protected void sgte(View v){
        Intent a= new Intent(getBaseContext(),gitbut.class);
        startActivity(a);
    }
    public void Sgte(View v){
        Intent a = new Intent(this, gitbut.class);
        startActivity(a);
    }




}