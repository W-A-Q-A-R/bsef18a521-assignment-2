package com.example.bsef18a521;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean getValues() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.result);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {
            String result = "Please enter a value";
            t1.setText(result);
            return false;
        } else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }

        return true;
    }

    public void add(View v) {
        if (getValues()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void power(View v) {

        if (getValues()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
    }

    public void subtract(View v) {
        if (getValues()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
    }
    public void multiply(View v) {
        if (getValues()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void divide(View v) {
        if (getValues()) {
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
    }


    public void mode(View v) {


        if (getValues()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
    }
}