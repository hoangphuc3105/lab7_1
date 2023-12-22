package com.example.lab7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView todoListview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todoListview = findViewById(R.id.todoListview);
        ToDoDAO toDoDAO = new ToDoDAO(this);
        ArrayList<ToDo> list = toDoDAO.getListTodo();
        TodoAdapter todoAdapter= new TodoAdapter(this, list);
        todoListview.setAdapter(todoAdapter);
    }
}