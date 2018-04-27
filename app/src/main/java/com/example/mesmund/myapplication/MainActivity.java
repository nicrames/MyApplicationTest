package com.example.mesmund.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch mySwitch1;
    Button button;
    TextView textInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySwitch1 = (Switch) findViewById(R.id.mySwitch1);
        button = (Button) findViewById(R.id.button);
        textInfo = (TextView) findViewById(R.id.textInfo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statusSwitch;
                if (mySwitch1.isChecked())
                    statusSwitch = mySwitch1.getTextOn().toString();
                else
                    statusSwitch = mySwitch1.getTextOff().toString();
                Toast.makeText(getApplicationContext(), "Switch1: " + statusSwitch, Toast.LENGTH_LONG).show();

                if (mySwitch1.isChecked())
                  textInfo.setText("ON");
                else
                    textInfo.setText("OFF");



            }

        });
    }
}


//if (mySwitch1.isChecked())
//                    textInfo.setText("ON");
//                else
//                    textInfo.setText("OFF");