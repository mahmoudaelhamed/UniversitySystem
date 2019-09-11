package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Doctor_Create_Assignment extends AppCompatActivity {
    EditText assignmentNameET,createQuestionET, answer_a_ET, answer_b_ET, answer_c_ET, answer_d_ET, correct_answerET;
    Button submitBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__doctor__create__assignment);


        initializeUI();
        clearFields();


        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String assignmentName = assignmentNameET.getText().toString();
                String question = createQuestionET.getText().toString();
                String answerA = answer_a_ET.getText().toString();
                String answerB = answer_b_ET.getText().toString();
                String answerC = answer_c_ET.getText().toString();
                String answerD = answer_d_ET.getText().toString();
                String correctAnswer = correct_answerET.getText().toString();

                if(assignmentName.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the assignment name",Toast.LENGTH_SHORT).show();
                }else if(question.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the question",Toast.LENGTH_SHORT).show();
                }else if(answerA.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the answer 1",Toast.LENGTH_SHORT).show();
                }else if(answerB.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the answer 2",Toast.LENGTH_SHORT).show();
                }else if(answerC.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the answer 3",Toast.LENGTH_SHORT).show();
                }else if(answerD.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the answer 4",Toast.LENGTH_SHORT).show();
                }else if(correctAnswer.isEmpty()){
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Enter the correct answer",Toast.LENGTH_SHORT).show();
                }else {

                    //Upload to dataBase code should be here
                    Toast.makeText(Activity_Doctor_Create_Assignment.this,"Uploaded",Toast.LENGTH_SHORT).show();
                    clearFields();

                }
            }
        });
    }

    private void initializeUI(){
        assignmentNameET = findViewById(R.id.assignment_name);
        createQuestionET = findViewById(R.id.question);
        answer_a_ET = findViewById(R.id.create_answer_a);
        answer_b_ET = findViewById(R.id.create_answer_b);
        answer_c_ET = findViewById(R.id.create_answer_c);
        answer_d_ET = findViewById(R.id.create_answer_d);
        correct_answerET = findViewById(R.id.correct_answer);
        submitBTN = findViewById(R.id.create_assignment_submitButton);

    }
    private  void clearFields(){
        createQuestionET.setText("");
        answer_a_ET.setText("");
        answer_b_ET.setText("");
        answer_c_ET.setText("");
        answer_d_ET.setText("");
        correct_answerET.setText("");
    }
}
