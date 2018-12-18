package com.example.psh.zero_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater1 = getMenuInflater();
        menuInflater1.inflate(R.menu.activity_search, menu);

        MenuInflater menuInflater2 = getMenuInflater();
        menuInflater2.inflate(R.menu.activity_teb, menu);
        return true;
    }
}
