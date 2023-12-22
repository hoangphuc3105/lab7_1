package com.example.lab7_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<ToDo> {
    private Context context;
    private List<ToDo> tasks;
    public TodoAdapter(Context context, List<ToDo> tasks){
        super(context, 0, tasks);
        this.context= context;
        this.tasks= tasks;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ToDo task = getItem(position);
        if(convertView == null){
            convertView = layoutInflater.from(getContext()).inflate(R.layout.item_todo);
        }
        TextView taskTitle = convertView.findViewById(R.id.txttitle);
        TextView taskContent = convertView.findViewById(R.id.txtcontent);
        TextView taskDate = convertView.findViewById(R.id.txtdate);
        TextView taskType = convertView.findViewById(R.id.txttype);
        taskTitle.setText(task.getTitle());
        taskContent.setText(task.getContent());
        taskDate.setText(task.getDate());
        taskType.setText(task.getType());
        return convertView;

    }
}
