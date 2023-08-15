package com.main.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kgm extends AppCompatActivity {


    EditText editText;
    TextView textView2,textView4,valueOfGrams;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kgm);

        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueOfGrams=findViewById(R.id.valueOfGrams);

        editText=findViewById(R.id.editTextNumber);
button =findViewById(R.id.button3);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        ConvertFromKilogramtoGram();
    }
});


    }

    private void ConvertFromKilogramtoGram() {

        String valueEnteredinKILO= editText.getText().toString();

double KILO=Double.parseDouble(valueEnteredinKILO);
double grams=KILO*1000;

textView4.setText("" + grams);

    }
}