package com.nutticha.appsimpletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toast toastSimple;
    RadioButton radioButton1 , radioButton2 , radioButton3 , radioButton4 , radioButton5 ,radioButton6;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastSimple = Toast.makeText(this,"This simple Toast", Toast.LENGTH_SHORT);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (radioButton1.isChecked()) {
            toastSimple.setText("Display Top");
            toastSimple.setGravity(Gravity.TOP, 0, 0);
        }
        else if (radioButton2.isChecked()) {
            toastSimple.setText("Display Left");
            toastSimple.setGravity(Gravity.LEFT, 0, 0);
        }
        else if (radioButton3.isChecked()) {
            toastSimple.setText("Display Center");
            toastSimple.setGravity(Gravity.CENTER, 0, 0);
        }
        else if (radioButton4.isChecked()) {
            toastSimple.setText("Display Right");
            toastSimple.setGravity(Gravity.RIGHT, 0, 0);
        }
        else if (radioButton5.isChecked()) {
            toastSimple.setText("Display Bottom");
            toastSimple.setGravity(Gravity.BOTTOM, 0, 0);
        }
        else if (radioButton6.isChecked()) {
            toastSimple.setText("Display Bottom");
            toastSimple.setGravity(Gravity.TOP |Gravity.RIGHT , 0, 0);
        }
        toastSimple.show();
    }
}