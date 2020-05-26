package com.zybooks.tempconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
          private EditText fah;
          private EditText cen;
          private Button cal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fah=(EditText)findViewById(R.id.etFar);
        cal=(Button)findViewById(R.id.btnchange);
        cen=(EditText)findViewById(R.id.etCen);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fahren =Integer.parseInt(fah.getText().toString());
                int centgrade= (fahren-32)*5/9;
                cen.setText(String.valueOf(centgrade));


            }
        });
    }
}
