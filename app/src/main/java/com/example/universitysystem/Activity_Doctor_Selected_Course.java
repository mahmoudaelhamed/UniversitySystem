package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_Doctor_Selected_Course extends AppCompatActivity {

    TextView startTV,lecturesTV,assignmentsTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__doctor__selected__course);


        startTV = findViewById(R.id.startTab);
        lecturesTV = findViewById(R.id.lecturesTab);
        assignmentsTV = findViewById(R.id.assignmentsTab);

        startTV.setBackgroundResource(R.drawable.style_button_fill_brown);
        Fragment frag = new Fragment_Doctor_Start();
        createFragment(frag);

        startTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTabsBackgroundColor(startTV,lecturesTV,assignmentsTV);
                Fragment frag = new Fragment_Doctor_Start();
                createFragment(frag);
            }
        });

        lecturesTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTabsBackgroundColor(lecturesTV,startTV,assignmentsTV);
                Fragment frag = new Fragment_Doctor_Lectures();
                createFragment(frag);
            }
        });

        assignmentsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTabsBackgroundColor(assignmentsTV,startTV,lecturesTV);
                Fragment frag = new Fragment_Doctor_Assignments();
                createFragment(frag);
            }
        });


    }
    private void createFragment(Fragment myFrag)
    {
        FragmentTransaction Trans =getSupportFragmentManager().beginTransaction();
        Trans.replace(R.id.doctor_frame,myFrag,"frag_doctor_start");
        Trans.commitNow();
    }
    private void changeTabsBackgroundColor(TextView colorOn, TextView colorOff_first, TextView colorOff_Second)
    {
        colorOn.setBackgroundResource(R.drawable.style_button_fill_brown);
        colorOff_first.setBackgroundResource(R.color.transparent);
        colorOff_Second.setBackgroundResource(R.color.transparent);
    }
}
