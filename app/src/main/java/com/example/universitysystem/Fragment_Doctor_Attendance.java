package com.example.universitysystem;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Doctor_Attendance extends Fragment {

    EditText lectureCodeET;
    Button createLectureCodeET;

    public Fragment_Doctor_Attendance() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment__doctor__attendance, container, false);
        lectureCodeET=v.findViewById(R.id.lectureCode);
        createLectureCodeET = v.findViewById(R.id.createLectureCodeButton);

        createLectureCodeET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lectureCode =  lectureCodeET.getText().toString();
               Toast.makeText(getActivity(), lectureCode, Toast.LENGTH_SHORT).show();
            }
        });



        return v;
    }

}
