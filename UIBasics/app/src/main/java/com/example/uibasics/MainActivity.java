package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextName;
    TextView textHello;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHello) {
            textHello.setText("Hello " + editTextName.getText().toString());
        } else if (v.getId()==R.id.editTextName) {
            Toast.makeText(this, "Attempting to type something", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("Hello");
//            }
//        });
//        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Toast.makeText(MainActivity.this, "Long Click", Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });

        editTextName = findViewById(R.id.editTextName);
        editTextName.setOnClickListener(this);
        textHello = findViewById(R.id.textHello);
    }
}