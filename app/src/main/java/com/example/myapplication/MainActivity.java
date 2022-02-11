package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et, et1, et2, et3;
    Button btn;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editTextnama);
        et1 = (EditText) findViewById(R.id.editTextkelas);
        et2 = (EditText) findViewById(R.id.editTexthobi);
        et3 = (EditText) findViewById(R.id.editTextDate);
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textsimpan);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Nama" + et.getText().toString() + "Kelas" + et1.getText().toString() + "Hobi" + et2.getText().toString() + "Tanggal Lahir" + et3.getText().toString());

            }
        });

            }


}