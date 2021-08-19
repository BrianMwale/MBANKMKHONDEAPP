package com.example.mybankmkhondeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class AddMembersToDatabaseClass  extends AppCompatActivity {


    EditText ful_name,phone_number,Location,date;
    Button submit_button;

    DataBaseManager DataB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group_members);

        ful_name = (EditText)  findViewById(R.id.personName);
        phone_number = (EditText)  findViewById(R.id.phoneNumber);
        Location = (EditText)  findViewById(R.id.location);
        date = (EditText)  findViewById(R.id.memberAddedDate);
        submit_button = (Button) findViewById(R.id.subMitB);



       DataB = new DataBaseManager(this);


       submit_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String Fullname = ful_name.getText().toString();
               String location = Location.getText().toString();
               String PhoneNumber = phone_number.getText().toString();
               String Date = date.getText().toString();

               if (Fullname.equals("") || location.equals("") || PhoneNumber.equals("") || Date.equals(""))
                   Toast.makeText(AddMembersToDatabaseClass.this, "Please enter all fields", Toast.LENGTH_SHORT).show();


               else {
                   Boolean CheckPhoneNumber = DataB.phoneNumber(PhoneNumber);
                   if(CheckPhoneNumber==false){
                       Boolean insert = DataB.insertData(Fullname, location, PhoneNumber, Date);
                       if(insert==true){
                           Toast.makeText(AddMembersToDatabaseClass.this, "Submitted Successfully...", Toast.LENGTH_SHORT).show();
                           Intent intentSubmit = new Intent(getApplicationContext(),membeList.class);
                           startActivity(intentSubmit);
                       }else {
                           Toast.makeText(AddMembersToDatabaseClass.this, "Submission  failed...", Toast.LENGTH_SHORT).show();

                       }
                   }else{
                       Toast.makeText(AddMembersToDatabaseClass.this, "Number already exist...", Toast.LENGTH_SHORT).show();
                   }
               }
           }});


}}
