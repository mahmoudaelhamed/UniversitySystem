package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_Student_AssignmentList extends AppCompatActivity {
    ListView assignmentListView;
    String[] assignmentName = {"Chapter 1 topic 1.2","Chapter 1 topic 1.3","Chapter 2 topic 2.2","Chapter 3 topic 3.1"};
    int[] assignmentQuestions = {9, 5, 4, 7, 6};
    TextView courseName,courseCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__student__assignment_list);

        courseName= findViewById(R.id.assignment_course_name);
        courseCode= findViewById(R.id.assignment_course_code);
        courseName.setText(getIntent().getStringExtra("courseName"));
        courseCode.setText(getIntent().getStringExtra("courseCode"));

        final ArrayList<Model_Student_AssignmentList> dataList = new ArrayList<>();
        assignmentListView = findViewById(R.id.assignment_list);
        for (int i = 0; i < assignmentName.length; i++)
        {
            dataList.add(new Model_Student_AssignmentList(assignmentName[i],assignmentQuestions[i]));

        }

        Adapter_Student_AssignmentList mAdapter = new Adapter_Student_AssignmentList(Activity_Student_AssignmentList.this,0,dataList);
        assignmentListView.setAdapter(mAdapter);
        assignmentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Activity_Student_AssignmentList.this, Activity_Student_Selected_Assignment.class);
                startActivity(intent);
            }
        });
    }
}
