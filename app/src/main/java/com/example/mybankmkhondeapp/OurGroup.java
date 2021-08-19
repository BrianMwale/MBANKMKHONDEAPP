package com.example.mybankmkhondeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OurGroup extends AppCompatActivity {

    Button view_members_button, add_group_members_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_group);
        view_members_button = findViewById(R.id.viewGroupMembersB);
        add_group_members_button = findViewById(R.id.addGroupMembersB);

        view_members_button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new  Intent(getBaseContext(), membeList .class);
                startActivity(intent);


            }
        });
        add_group_members_button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                Intent intent = new  Intent(getBaseContext(), AddGroupMembers.class);
                startActivity(intent);


            }
        });

    }
}