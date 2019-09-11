package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Student_Selected_Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__student__selected__course);
        Intent i = getIntent();


        final String courseName = i.getStringExtra("courseName");
        final String courseCode = i.getStringExtra("courseCode");
        String lectureDate = i.getStringExtra("lectureDate");
        String lectureHall = i.getStringExtra("lectureHall");


        TextView crsNameTV = findViewById(R.id.course_option_name);
        TextView crsCodeTV = findViewById(R.id.course_option_code);
        TextView lecDateTV = findViewById(R.id.course_option_lectureDate);
        TextView lecHallTV = findViewById(R.id.course_option_lectureHall);

        crsNameTV.setText(courseName);
        crsCodeTV.setText(courseCode);
        lecDateTV.setText(lectureDate);
        lecHallTV.setText(lectureHall);



        Button Assignments = findViewById(R.id.viewAssignment);
        Assignments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToAssignments = new Intent(Activity_Student_Selected_Course.this, Activity_Student_AssignmentList.class);
                intentToAssignments.putExtra("courseName",courseName);
                intentToAssignments.putExtra("courseCode",courseCode);
                startActivity(intentToAssignments);

            }
        });
    }
    public void recordAttendance(View view) {
        startActivity(new Intent(Activity_Student_Selected_Course.this, Activity_Student_Attendance.class));
    }



}
