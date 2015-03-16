package com.andreykadatsky.level1.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.andreykadatsky.level1.R;
import com.andreykadatsky.level1.model.Person;
import com.andreykadatsky.level1.model.PersonList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class JsonActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        String jsonString = createJson();

        TextView json = (TextView) findViewById(R.id.json);
        json.setText("json: " + jsonString);

        PersonList personList = parseJson(jsonString);

        TextView list = (TextView) findViewById(R.id.list);
        list.setText("object: " + personList);
    }

    private PersonList parseJson(String jsonString) {
        Gson gson = new GsonBuilder().create();
        PersonList result = gson.fromJson(jsonString, PersonList.class);
        return result;
    }

    private String createJson() {
        String result = "";

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Ivan", 23));
        persons.add(new Person("Vova", 25));
        persons.add(new Person("Taras", 17));

        PersonList list = new PersonList();
        list.setData(persons);
        list.setListName("school class");

        Gson gson = new GsonBuilder().create();
        result = gson.toJson(list);

        return result;
    }

}
