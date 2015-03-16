package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.andreykadatsky.level1.R;
import com.andreykadatsky.level1.model.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StartActivityRequestActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        findViewById(R.id.launch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSecond();
            }
        });
    }

    private void launchSecond() {
        Intent intent = new Intent(StartActivityRequestActivity.this, StartActivityResponseActivity.class);

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Ivan", 23));
        list.add(new Person("Vova", 25));
        list.add(new Person("Taras", 17));

        intent.putExtra("list", (Serializable) list);

        int sampleInt = 123;
        intent.putExtra("sample_int", sampleInt);

        String sampleString = "abc";
        intent.putExtra("sample_string", sampleString);

        startActivity(intent);
    }
}
