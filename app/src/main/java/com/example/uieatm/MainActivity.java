package com.example.uieatm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TextoPruba;
    EditText PassWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextoPruba= (TextView) findViewById(R.id.textoejemplo );
        PassWord= (EditText) findViewById(R.id.EDPassword );

        TextoPruba.setText("Mire Mejor Aqui");
        TextoPruba.setAllCaps(true);
        TextoPruba.setTextColor(Color.BLUE);
        PassWord.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String PasswordInicial= PassWord.getText().toString();
                TextoPruba.setText(PasswordInicial);
            }
        });
    }
}