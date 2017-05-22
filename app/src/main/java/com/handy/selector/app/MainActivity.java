package com.handy.selector.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.handy.selector.app.button.SmoothButtonActivity;
import com.handy.selector.app.dialog.DialogActivity;
import com.handy.selector.app.materialdesign.demo.MaterialDesignActivity;
import com.handy.selector.app.picker.PickerActivity;
import com.handy.selector.app.spinner.SpinnerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SmoothButtonActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.Dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.Picker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PickerActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.Spinner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.MaterialDesign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaterialDesignActivity.class);
                startActivity(intent);
            }
        });
    }
}
