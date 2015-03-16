package com.andreykadatsky.level1.model;

import java.util.List;

public class PersonList {

    private String listName;
    private List<Person> data;

    public PersonList() {
    }

    public PersonList(String listName, List<Person> data) {
        this.listName = listName;
        this.data = data;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<Person> getData() {
        return data;
    }

    public void setData(List<Person> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "data=" + data +
                ", listName='" + listName + '\'' +
                '}';
    }
}
