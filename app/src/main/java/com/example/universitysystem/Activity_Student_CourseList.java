package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_Student_CourseList extends AppCompatActivity {
    ListView subjectListView;
    String[] courseNames = {"Introduction to Computer Science", "Probability and Statistics", "Mathematics-1", "Physics", "Computer Programming"};
    String[] courseCodes = {"CSE 120", "STA 2023", "MA 111", "PHY 131", "CSE 142"};
    String[] lectureDate = {"Sun 9:00-10:30 AM", "Mon 1:30-3:00 PM", "Tue 10:30-12:00 AM", "Wed 9:00-10:30 AM", "Thu 12:00-1:30 PM"};
    String[] lectureHall = {"1113", "1104", "1113", "1113", "1104"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__student__course_list);
        final ArrayList<Model_Student_CourseList> dataList = new ArrayList<>();
        subjectListView = findViewById(R.id.subject_listView);
        for (int i = 0; i < courseNames.length; i++)
        {
            dataList.add(new Model_Student_CourseList(courseNames[i],courseCodes[i],lectureDate[i],lectureHall[i]));

        }

        Adapter_Student_CourseList mAdapter = new Adapter_Student_CourseList(Activity_Student_CourseList.this,0,dataList);
        subjectListView.setAdapter(mAdapter);
        subjectListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Activity_Student_CourseList.this, Activity_Student_Selected_Course.class);
                intent.putExtra("courseName",dataList.get(position).getCourseName());
                intent.putExtra("courseCode",dataList.get(position).getCourseCode());
                intent.putExtra("lectureDate",dataList.get(position).getLectureDate());
                intent.putExtra("lectureHall",dataList.get(position).getLectureHall());
                startActivity(intent);
            }
        });
    }
}
