package com.example.mybankmkhondeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Launcher extends AppCompatActivity {

    GridView home_page_item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);


        home_page_item = findViewById(R.id.homePitems);

        ArrayList<HomePage> homePageArrayList = new ArrayList<HomePage>();
        homePageArrayList.add(new HomePage("our group", R.drawable.br25));
        homePageArrayList.add(new HomePage("schedules", R.drawable.br32));
        homePageArrayList.add(new HomePage("attendance", R.drawable.br27));
        homePageArrayList.add(new HomePage("deposits", R.drawable.br28));
        homePageArrayList.add(new HomePage("loans", R.drawable.br30));
        homePageArrayList.add(new HomePage("incomes", R.drawable.br33));

        HomePageAdapter adapter = new HomePageAdapter(this, homePageArrayList);
        home_page_item.setAdapter(adapter);


        home_page_item.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                if(position==0) {
                    
                    Intent intent = new Intent(Launcher.this, OurGroup.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent = new Intent(Launcher.this, SchedulesP.class);
                    startActivity(intent);

                }
                else if(position==2)
                {
                    Intent intent = new Intent(Launcher.this, AttendancePage.class);
                    startActivity(intent);

                }
                else if(position==3) {
                    Intent intent = new Intent(Launcher.this,Deposits.class);
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent = new Intent(Launcher.this, Loans.class);
                    startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent = new Intent(Launcher.this, Incomes.class);
                    startActivity(intent);
                }
              //  Toast.makeText(GridViewExampleActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });


}}