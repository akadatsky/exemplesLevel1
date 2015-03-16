package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.andreykadatsky.level1.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class DateActivity extends Activity {

    public static final int LIST_SIZE = 20;

    private SimpleDateFormat formatFull = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");
    private SimpleDateFormat formatDayOnly = new SimpleDateFormat("dd.MM.yyyy");

    private TextView currentDateView;
    private TextView dateListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update();
            }
        });

        currentDateView = (TextView) findViewById(R.id.currentDate);
        dateListView = (TextView) findViewById(R.id.dateList);

        update();
        showDateList();
    }

    private void update() {
        Calendar currentDate = GregorianCalendar.getInstance(Locale.US);
        currentDateView.setText(formatFull.format(currentDate.getTime()));
    }

    private void showDateList() {
        List<String> dateList = new ArrayList<String>();

        Calendar calendar = GregorianCalendar.getInstance(Locale.US);

        for (int i = 0; i < LIST_SIZE; i++) {
            String oneDay = formatDayOnly.format(calendar.getTime());
            dateList.add(oneDay);
            calendar.add(Calendar.DATE, -1);
        }

        String result = "";
        for (String date : dateList) {
            result += date + "\n";
        }
        dateListView.setText(result);
    }
}
