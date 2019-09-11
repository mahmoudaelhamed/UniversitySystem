package com.example.universitysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class Activity_Login extends AppCompatActivity {
RelativeLayout loginContainer, loginParentLayout;
EditText userID,userPassword;

    String FixedStudentID = "010";
    String FixedStudentPassword = "010";
    String FixedDoctorID = "020";
    String FixedDoctorPassword = "020";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializeUI();
        startSplash();


    }

    void initializeUI(){

        loginContainer = findViewById(R.id.login_screen_loginForm);
        loginParentLayout = findViewById(R.id.login_screen_parentRelativeLayout);

        userID = findViewById(R.id.userID_ET);
        userPassword = findViewById(R.id.userPassword_ET);
    }

    void startSplash(){
        LayoutTransition layoutTransition = loginParentLayout.getLayoutTransition();
        layoutTransition.enableTransitionType(LayoutTransition.CHANGING);
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                loginContainer.setVisibility(View.VISIBLE);
            }
        };
        handler.postDelayed(runnable,1500);
    }


    public void logIn(View view) {
        if(userID.getText().toString().equals(FixedStudentID)&& userPassword.getText().toString().equals(FixedStudentPassword))
        {
            Intent intent = new Intent(Activity_Login.this, Activity_Student_CourseList.class);
            startActivity(intent);
        }
        else if ( userID.getText().toString().equals(FixedDoctorID)&& userPassword.getText().toString().equals(FixedDoctorPassword)){
            Intent intent = new Intent(Activity_Login.this, Activity_Doctor_CourseList.class);
            startActivity(intent);
        }
    }
}
