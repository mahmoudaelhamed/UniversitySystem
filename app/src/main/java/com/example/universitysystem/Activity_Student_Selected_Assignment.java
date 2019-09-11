package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Activity_Student_Selected_Assignment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__student__selected__assignment);
        Fragment frag = new Fragment_Assignment_Questions_Answers();
        createFragment(frag);
    }
    private void createFragment(Fragment myFrag)
    {
        FragmentTransaction Trans =getSupportFragmentManager().beginTransaction();
        Trans.replace(R.id.AssignmentFragment,myFrag,"frag_question");
        Trans.commitNow();
    }
}
