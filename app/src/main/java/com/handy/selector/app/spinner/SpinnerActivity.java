/*
 * Copyright (C) 2016 Jared Rummler <jared.rummler@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.handy.selector.app.spinner;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import com.handy.selector.app.R;
import com.handy.selector.spinner.MaterialSpinner;
import com.handy.selector.spinner.MaterialSpinnerAdapter;
import com.handy.selector.spinner.SpinnerItemShowApi;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private static final String[] ANDROID_VERSIONS = {
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat",
            "Lollipop", "Marshmallow"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jaredrummler/Material-Spinner")));
                } catch (ActivityNotFoundException ignored) {
                }
            }
        });

        final List<Student> students = new ArrayList<Student>() {{
            add(new Student("1", "A"));
            add(new Student("2", "B"));
            add(new Student("3", "C"));
            add(new Student("4", "D"));
            add(new Student("5", "E"));
        }};
        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);

//        简单设置
//        spinner.setItems(students, new SpinnerItemShowApi<Student>() {
//            @Override
//            public String getItemShow(@NonNull Student item) {
//                return item.name;
//            }
//        });

//        复杂设置
        MaterialSpinnerAdapter adapter = new MaterialSpinnerAdapter<>(SpinnerActivity.this, students, new SpinnerItemShowApi<Student>() {
            @Override
            public String getItemShow(@NonNull Student item) {
                return item.name;
            }
        });
        adapter.setTextColor(getResources().getColor(R.color.ios_btntext_blue));
        adapter.setTextSize(17);
        adapter.setTextGravity(Gravity.CENTER);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<Student>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Student item) {
                Snackbar.make(view, "Clicked " + item.phone, Snackbar.LENGTH_LONG).show();
            }
        });

        spinner.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override
            public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });


        MaterialSpinner spinner2 = (MaterialSpinner) findViewById(R.id.spinner2);
        spinner2.setItems(ANDROID_VERSIONS);
        spinner2.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
    }

    class Student {
        public String name = "";
        public String phone = "";

        public Student(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
