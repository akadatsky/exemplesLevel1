package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.andreykadatsky.level1.R;
import com.andreykadatsky.level1.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends Activity {

    private int count;
    private MyAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final List<String> myList = new ArrayList<String>();

        findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    adapter.add("TEST" + count);
                    count++;
                }
                adapter.notifyDataSetChanged();
            }
        });


        for (int i = 0; i < 10; i++) {
            myList.add("TEST" + i);
            count++;
        }

        ListView listView = (ListView) findViewById(R.id.listView);

        adapter = new MyAdapter(this, myList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = adapter.getItem(position);
                Toast.makeText(ListViewActivity.this, "Text: " + item, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
