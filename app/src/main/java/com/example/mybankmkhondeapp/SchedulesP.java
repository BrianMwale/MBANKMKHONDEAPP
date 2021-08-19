package com.example.mybankmkhondeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SchedulesP extends AppCompatActivity {
    Button add_group_activities, view_group_activities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules_p);
        add_group_activities  = findViewById(R.id.addGroupActivitiesB);
        view_group_activities = findViewById(R.id.viewGroupActivitiesB);


        add_group_activities  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new  Intent(getBaseContext(), AddGroupActivities .class);
                startActivity(intent);


            }
        });
        view_group_activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new  Intent(getBaseContext(), ViewGroupActivities .class);
                startActivity(intent);


            }
        });
    }
}