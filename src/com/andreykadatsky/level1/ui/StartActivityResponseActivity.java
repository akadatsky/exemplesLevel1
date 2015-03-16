package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.andreykadatsky.level1.R;
import com.andreykadatsky.level1.model.Person;

import java.util.ArrayList;
import java.util.List;

public class StartActivityResponseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);

        List<Person> sampleList = (ArrayList<Person>) getIntent().getSerializableExtra("list");

        int sampleInt = getIntent().getIntExtra("sample_int", 0);

        String sampleString = getIntent().getStringExtra("sample_string");

        String result = "Data from previous Activity: \n\n";

        result += "sampleInt: " + sampleInt + "\n";

        result += "sampleString: " + sampleString + "\n";

        result += "sampleList: " + sampleList;

        TextView dataView = (TextView) findViewById(R.id.data);
        dataView.setText(result);

    }

}
