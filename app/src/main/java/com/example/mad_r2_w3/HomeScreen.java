package com.example.mad_r2_w3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    TextView tvHeader;
    ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        init();

        Bundle data = getIntent().getExtras();

        String value = data.getString("username");

        tvHeader.setText(tvHeader.getText().toString()+value);



        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void init()
    {
        tvHeader = findViewById(R.id.tvHeader);
        ivBack = findViewById(R.id.ivBack);
    }
}