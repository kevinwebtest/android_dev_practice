package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegistClick(View view) {
        TextView textFname = findViewById(R.id.fname);
        TextView textLname = findViewById(R.id.lname);
        TextView textEmail = findViewById(R.id.email);

        EditText editFname = findViewById(R.id.editFname);
        EditText editLname = findViewById(R.id.editLname);
        EditText editEmail = findViewById(R.id.editEmail);

        textFname.setText("First Name: "+editFname.getText().toString());
        textLname.setText("Last Name: "+editLname.getText().toString());
        textEmail.setText("Email: "+editEmail.getText().toString());
    }
}