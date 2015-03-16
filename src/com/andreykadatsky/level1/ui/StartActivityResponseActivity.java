package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.Bundle;
import com.andreykadatsky.level1.R;

import java.util.ArrayList;
import java.util.List;

public class StartActivityResponseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        List<String> list = (ArrayList<String>) getIntent().getSerializableExtra("list");


    }

}
