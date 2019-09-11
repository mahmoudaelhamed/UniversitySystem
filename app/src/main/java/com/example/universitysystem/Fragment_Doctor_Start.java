package com.example.universitysystem;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Doctor_Start extends Fragment {


    public Fragment_Doctor_Start() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment__doctor__start, container, false);
        Button createAttendance = v.findViewById(R.id.createAttendCodeButton);
        createAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment attendFragment = new Fragment_Doctor_Attendance();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.doctor_frame, attendFragment );
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        Button createAssignment = v.findViewById(R.id.createAssignmentButton);
        createAssignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(getActivity(),Activity_Doctor_Create_Assignment.class);
                startActivity(i);
            }
        });

        return v;
    }

}
