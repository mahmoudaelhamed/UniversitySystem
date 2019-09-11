package com.example.universitysystem;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Lecture_StudentsAttended extends Fragment {
    ListView attendedStudentsListview;

    String[] studentName = {"Mahmoud Badawy","Ahmed Mostafa","yousef"};
    String[] studentID = {"010","110","111"};

    public Fragment_Lecture_StudentsAttended() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment__lecture__students_attended, container, false);
        attendedStudentsListview = v.findViewById(R.id.lecture_attended_studentListView);
        final ArrayList<Model_Lecture_AttendedStudents> dataList = new ArrayList<>();

        for (int i = 0; i < studentName.length; i++)
        {
            dataList.add(new Model_Lecture_AttendedStudents(studentName[i],studentID[i]));

        }

        Adapter_Lecture_AttendedStudents mAdapter = new Adapter_Lecture_AttendedStudents(getActivity(),0,dataList);
        attendedStudentsListview.setAdapter(mAdapter);
        attendedStudentsListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment attendFragment = new Fragment_Student_Information();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.doctor_frame, attendFragment );
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return  v;
    }

}
