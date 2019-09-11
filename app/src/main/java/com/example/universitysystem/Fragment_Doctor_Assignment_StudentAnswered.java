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
public class Fragment_Doctor_Assignment_StudentAnswered extends Fragment {

    ListView assignmentStudentAnsweredListView;

    String[] studentName = {"Mahmoud Badawy","Ahmed Mostafa","yousef"};
    String[] studentID = {"010","110","111"};
    String[] studentScore = {"4","2","7"};

    public Fragment_Doctor_Assignment_StudentAnswered() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment__doctor__assignment__student_answered, container, false);
        assignmentStudentAnsweredListView = v.findViewById(R.id.doctor_Assignments_StudentAnsweredListView);
        final ArrayList<Model_Doctor_Assignment_StudentScore> dataList = new ArrayList<>();

        for (int i = 0; i < studentName.length; i++)
        {
            dataList.add(new Model_Doctor_Assignment_StudentScore(studentName[i],studentID[i],studentScore[i]));

        }

        Adapter_Doctor_Assignment_StudentsAnswered mAdapter = new Adapter_Doctor_Assignment_StudentsAnswered(getActivity(),0,dataList);

        assignmentStudentAnsweredListView.setAdapter(mAdapter);

        return v;
    }

}
