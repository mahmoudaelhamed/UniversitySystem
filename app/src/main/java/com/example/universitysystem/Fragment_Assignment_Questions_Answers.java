package com.example.universitysystem;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Assignment_Questions_Answers extends Fragment {


    public Fragment_Assignment_Questions_Answers() {
        // Required empty public constructor
    }

    TextView questionType, question;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment__assignment__questions__answers, container, false);

        final RadioGroup radioGroup = v.findViewById(R.id.question_answer_radioGroup);
        final RadioButton rb;

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch (checkedId) {
                    case R.id.radioButtonAnswer_a:
                        Toast.makeText(getActivity(), "answer a ", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonAnswer_b:
                        Toast.makeText(getActivity(), "answer b ", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonAnswer_c:
                        Toast.makeText(getActivity(), "answer c ", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonAnswer_d:
                        Toast.makeText(getActivity(), "answer d ", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        return v;
    }

}
