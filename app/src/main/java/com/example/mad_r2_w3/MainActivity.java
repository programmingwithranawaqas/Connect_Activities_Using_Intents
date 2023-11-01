package com.example.mad_r2_w3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button btnGoToHS;
    TextInputEditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnGoToHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString().trim();
                if(name.length()!=0) {
                    Intent intent = new Intent(MainActivity.this, HomeScreen.class);
                    intent.putExtra("username", name);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Name can't be empty.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void init()
    {
        btnGoToHS = findViewById(R.id.btnGoToHS);
        etName = findViewById(R.id.etName);
    }
}