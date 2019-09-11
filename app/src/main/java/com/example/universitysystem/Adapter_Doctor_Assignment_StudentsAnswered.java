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

public class Adapter_Doctor_Assignment_StudentsAnswered extends ArrayAdapter {
    ArrayList<Model_Doctor_Assignment_StudentScore> dataList;

    public Adapter_Doctor_Assignment_StudentsAnswered(@NonNull Context context, int resource, ArrayList<Model_Doctor_Assignment_StudentScore> dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_doctor_assignment_student_answered, parent, false);

        TextView studentNameTV = convertView.findViewById(R.id.assignment_student_name);
        TextView studentIDTV = convertView.findViewById(R.id.assignment_answered_studentID);
        TextView studentScoreTV = convertView.findViewById(R.id.Score);

        studentNameTV.setText(dataList.get(position).getStudentName());
        studentIDTV.setText(dataList.get(position).getStudentID());
        studentScoreTV.setText(dataList.get(position).getStudentScore());

        return convertView;
    }
}
