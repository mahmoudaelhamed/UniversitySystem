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

public class Adapter_Student_AssignmentList extends ArrayAdapter {
    ArrayList<Model_Student_AssignmentList> dataList;

    public Adapter_Student_AssignmentList(@NonNull Context context, int resource, ArrayList<Model_Student_AssignmentList> dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_assignments_list,parent,false);

        TextView assignmentName = convertView.findViewById(R.id.assignment_name);
        TextView assignmentQuestions = convertView.findViewById(R.id.assignment_questions_answered);

        assignmentName.setText(dataList.get(position).getAssignmentName());
        assignmentQuestions.setText("0/"+ dataList.get(position).getAssignmentQuestionsNumber());
        return convertView;
    }
}
