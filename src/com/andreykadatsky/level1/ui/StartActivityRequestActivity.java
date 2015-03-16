package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.andreykadatsky.level1.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StartActivityRequestActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        List<String> list = new ArrayList<String>();
        Intent intent = new Intent();
        intent.putExtra("list", (Serializable) list);


    }
}
