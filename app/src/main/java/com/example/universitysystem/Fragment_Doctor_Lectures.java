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
public class Fragment_Doctor_Lectures extends Fragment {

    ListView lectureListView;

    String[] lectureNumbers = {"1","2","3","4","5"};
    String[] lectureTopic = {"Chapter 1 - 1.5", "Chapter 1.5 - 1.8", "Chapter 2", "Chapter 3.1 - 3.4", "Chapter 4"};
    String[] lectureDate = {"27/9/2018", "4/10/2018", "11/10/2018", "18/10/2018", "25/10/2018"};
    public Fragment_Doctor_Lectures() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment__doctor__lectures, container, false);
        lectureListView = v.findViewById(R.id.doctor_lectureListView);
        final ArrayList<Model_Doctor_LecturesList> dataList = new ArrayList<>();

        for (int i = 0; i < lectureDate.length; i++)
        {
            dataList.add(new Model_Doctor_LecturesList(lectureNumbers[i],lectureTopic[i],lectureDate[i]));

        }

        Adapter_Doctor_LectureList mAdapter = new Adapter_Doctor_LectureList(getActivity(),0,dataList);
        lectureListView.setAdapter(mAdapter);
        lectureListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment attendFragment = new Fragment_Lecture_StudentsAttended();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.doctor_frame, attendFragment );
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        return  v;
    }

}
