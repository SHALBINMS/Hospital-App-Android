package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.username);
        ed2 = (EditText) findViewById(R.id.pass);
        bt1 = (Button) findViewById(R.id.loginbtn);
        bt2 = (Button) findViewById(R.id.gotobtn);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(ob);
            }
        });
    }
}