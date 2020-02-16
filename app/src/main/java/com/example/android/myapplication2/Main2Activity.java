package com.example.android.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;



public class Main2Activity extends AppCompatActivity {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Button submit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        a = findViewById(R.id.editText8);
        b = findViewById(R.id.editText9);
        c = findViewById(R.id.editText10);
        d = findViewById(R.id.editText11);
        e = findViewById(R.id.editText12);
        submit = findViewById(R.id.button3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (a.getText().length()<1 && b.getText().length()<1 && c.getText().length()<1 && d.getText().length()<1 && e.getText().length()<1) {

                    Toast toast3 = Toast.makeText(Main2Activity.this, "Please Input", Toast.LENGTH_LONG);
                    toast3.show();

                }



        else {
    startActivity(new Intent(Main2Activity.this, MainActivity.class));

                }

            }
        });

    }

}
