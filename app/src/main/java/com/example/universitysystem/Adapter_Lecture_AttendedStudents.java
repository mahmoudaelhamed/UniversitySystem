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

public class Adapter_Lecture_AttendedStudents extends ArrayAdapter {
    ArrayList<Model_Lecture_AttendedStudents> dataList;

    public Adapter_Lecture_AttendedStudents(@NonNull Context context, int resource, ArrayList<Model_Lecture_AttendedStudents> dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_lecture_students_attended_list,parent,false);

        TextView studentNameTV = convertView.findViewById(R.id.lecture_attended_studentName);
        TextView studentIDTV = convertView.findViewById(R.id.lecture_attended_studentID);

        studentNameTV.setText(dataList.get(position).getStudentName());
        studentIDTV.setText(dataList.get(position).getStudentID());

        return convertView;
    }
}
