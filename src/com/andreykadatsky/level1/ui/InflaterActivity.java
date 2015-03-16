package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.andreykadatsky.level1.R;

public class InflaterActivity extends Activity {

    private LinearLayout wrapper;
    private LayoutInflater inflater;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflater);

        wrapper = (LinearLayout) findViewById(R.id.wrapper);

        inflater = LayoutInflater.from(this);

        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrapper.removeAllViews();
            }
        });

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFewViews();
            }
        });

        addFewViews();
    }

    private void addFewViews() {
        View view1 = inflater.inflate(R.layout.list_item, wrapper, false);
        TextView text1 = (TextView) view1.findViewById(R.id.text);
        text1.setText("View1");
        wrapper.addView(view1);

        inflater.inflate(R.layout.list_item2, wrapper, true);
    }

}
