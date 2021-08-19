package com.example.mybankmkhondeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddGroupActivities extends AppCompatActivity {

    public void submitbuttonHandler(View view) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group_activities);
        EditText addressEditText = (EditText) findViewById(R.id.groupActivities);
        String address = addressEditText.getText().toString();
        EditText dateEditText = (EditText) findViewById(R.id.activityDate);
        String date = dateEditText.getText().toString();
    }
}