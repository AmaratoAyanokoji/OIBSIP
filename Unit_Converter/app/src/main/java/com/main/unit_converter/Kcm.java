package com.main.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kcm extends AppCompatActivity {
    EditText editText;
    TextView textView3,textView5,valueOfMetres;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcm);


textView3=findViewById(R.id.textView3);
textView5=findViewById(R.id.textView5);
valueOfMetres=findViewById(R.id.valueOfMetres);
editText=findViewById(R.id.editTextNumber2);
button=findViewById(R.id.button4);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        ConvertFromMetretocm();
    }


});

    }

    private void ConvertFromMetretocm() {


        String valueEnteredinMETRE=editText.getText().toString();
        double METRE=Double.parseDouble(valueEnteredinMETRE);
        double cm=METRE*100;
        textView5.setText(""+cm);
    }
}