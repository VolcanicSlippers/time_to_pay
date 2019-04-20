package com.example.android.time_to_pay;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText payText;
    private EditText costItem;
    private TextView showText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        payText = findViewById(R.id.payText);
        costItem = findViewById(R.id.costItem);
        showText = findViewById(R.id.showText);

        Button btn = (Button) findViewById(R.id.btn22);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                letsDoIt();
            }
        });





    }

    private static void letsDoIt() {
        Double pt = Double.parseDouble(payText.getText().toString());
        Double ci = Double.parseDouble(costItem.getText().toString());

        showText.setText(NumberOfHoursToWork(pt, ci));
    }

    private static String NumberOfHoursToWork(Double pay, Double cost) {
        Double a = cost / pay;
        return a.toString();
    }
}
