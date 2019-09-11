package com.example.universitysystem;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Doctor_Assignments extends Fragment {
    ListView doctorAssignmentsListView;
    String[] assignmentName = {"Chapter 1 topic 1.2","Chapter 1 topic 1.3","Chapter 2 topic 2.2","Chapter 3 topic 3.1"};
    int[] assignmentQuestions = {9, 5, 4, 7, 6};
    TextView courseName,courseCode;


    public Fragment_Doctor_Assignments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment__doctor__assignments, container, false);


        courseName= v.findViewById(R.id.assignment_course_name);
        courseCode= v.findViewById(R.id.assignment_course_code);

        final ArrayList<Model_Student_AssignmentList> dataList = new ArrayList<>();
        doctorAssignmentsListView = v.findViewById(R.id.doctor_AssignmentsListView);
        for (int i = 0; i < assignmentName.length; i++)
        {
            dataList.add(new Model_Student_AssignmentList(assignmentName[i],assignmentQuestions[i]));

        }

        Adapter_Student_AssignmentList mAdapter = new Adapter_Student_AssignmentList(getActivity(),0,dataList);
        doctorAssignmentsListView.setAdapter(mAdapter);
        doctorAssignmentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Fragment attendFragment = new Fragment_Doctor_Assignment_StudentAnswered();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.doctor_frame, attendFragment );
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        return v;
    }

}
