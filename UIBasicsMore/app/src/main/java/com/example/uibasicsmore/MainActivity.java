package com.example.uibasicsmore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxAvengers, checkBoxMatrix, checkBoxJoker;
    private RadioGroup rgMaritialStatus;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxAvengers = findViewById(R.id.checkboxAvengers);
        checkBoxMatrix = findViewById(R.id.checkboxMatrix);
        checkBoxJoker = findViewById(R.id.checkboxJoker);

        rgMaritialStatus = findViewById(R.id.rgMaritialStatus);

        int checkedButton = rgMaritialStatus.getCheckedRadioButtonId();

        progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();

        if(checkboxAvengers.isChecked()) {
            Toast.makeText(this, "You have watched Avengers", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You need to watch Avengers", Toast.LENGTH_SHORT).show();
        }

        if (checkedButton == R.id.rbSingle) {
            Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();

        }else if (checkedButton == R.id.rbMarried) {
            Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
        }else if (checkedButton == R.id.rbInRel) {
            Toast.makeText(MainActivity.this, "In Relationship", Toast.LENGTH_SHORT).show();

        }

        checkboxAvengers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You have watched Avengers", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You need to watch Avengers", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rgMaritialStatus.setOnCheckedChangeListener((new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbSingle) {
                    Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.VISIBLE);
                }else if (checkedId == R.id.rbMarried) {
                    Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.rbInRel) {
                    Toast.makeText(MainActivity.this, "In Relationship", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                }
            }
        }));
    }
}