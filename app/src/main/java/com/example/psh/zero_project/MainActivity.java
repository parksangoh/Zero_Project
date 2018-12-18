package com.example.psh.zero_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button code_read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        code_read = (Button)findViewById(R.id.code_read);
        code_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    // AppBar에 Icon 표시
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater1 = getMenuInflater();
        menuInflater1.inflate(R.menu.activity_search, menu);

        MenuInflater menuInflater2 = getMenuInflater();
        menuInflater2.inflate(R.menu.activity_teb, menu);

        return true;
    }

    // Icon 클릭 이벤트
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.icon_search:
                Toast.makeText(getApplicationContext(), "검색 메뉴", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Details_menu01:
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
