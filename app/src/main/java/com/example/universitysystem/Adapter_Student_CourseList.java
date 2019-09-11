package com.example.universitysystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter_Student_CourseList extends ArrayAdapter {
    ArrayList<Model_Student_CourseList> dataList;
    public Adapter_Student_CourseList(@NonNull Context context, int resource, @NonNull ArrayList dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_course_list,parent,false);

        TextView courseName = convertView.findViewById(R.id.course_name);
        TextView courseCode = convertView.findViewById(R.id.course_code);

        courseName.setText(dataList.get(position).getCourseName());
        courseCode.setText(dataList.get(position).getCourseCode());

        return convertView;
    }
}
