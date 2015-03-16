package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.andreykadatsky.level1.R;
import com.andreykadatsky.level1.util.WebUtil;

public class RequestActivity extends Activity {

    private static final String URL = "http://ip.jsontest.com";

    private TextView textView;
    private MyTask task;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = new MyTask();
                task.execute();
            }
        });

        textView = (TextView) findViewById(R.id.textView);
    }


    private class MyTask extends AsyncTask<Void, Integer, String> {

        @Override
        protected void onPreExecute() {
            Toast.makeText(RequestActivity.this, "task started", Toast.LENGTH_LONG).show();
            textView.setText("");
        }

        @Override
        protected String doInBackground(Void... params) {
            String result = "";
            try {
                result = WebUtil.getRequest(URL, null);

                /*
                Examples:

                    List<NameValuePair> params = new ArrayList<>();
                    params.add(new BasicNameValuePair("user_id", "123));
                    params.add(new BasicNameValuePair("version", "2"));
                    params.add(new BasicNameValuePair("text", "asdf asdf asdf"));
                    String response = postRequest(url, params);
                 */

            } catch (Exception e) {
                result = "Error:" + e.getMessage();
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            textView.setText(s);
        }

    }


}
