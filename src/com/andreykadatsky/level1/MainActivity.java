package com.andreykadatsky.level1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.andreykadatsky.level1.ui.StartActivityRequestActivity;
import com.andreykadatsky.level1.ui.AsyncTaskActivity;
import com.andreykadatsky.level1.ui.DateActivity;
import com.andreykadatsky.level1.ui.InflaterActivity;
import com.andreykadatsky.level1.ui.JsonActivity;
import com.andreykadatsky.level1.ui.ListViewActivity;
import com.andreykadatsky.level1.ui.RequestActivity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        findViewById(R.id.date).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DateActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.startActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StartActivityRequestActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.asyncTask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AsyncTaskActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.request).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RequestActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.listView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.inflater).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InflaterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.json).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JsonActivity.class);
                startActivity(intent);
            }
        });


    }

}
