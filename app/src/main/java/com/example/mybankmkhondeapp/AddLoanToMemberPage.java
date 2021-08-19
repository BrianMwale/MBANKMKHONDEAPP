package com.example.mybankmkhondeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddLoanToMemberPage extends AppCompatActivity {
    public void submitbuttonHandler(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_loan_to_member_page);
        EditText nameTextEditText = (EditText) findViewById(R.id.personNameLoan);
        String fullName = nameTextEditText.getText().toString();
        EditText numberEditText = (EditText) findViewById(R.id.loanAmount);
        String number = numberEditText.getText().toString();
        EditText number2EditText = (EditText) findViewById(R.id.loanInterest);
        String number2 = numberEditText.getText().toString();
        EditText dateEditText = (EditText) findViewById(R.id.loanAddedDate);
        String date = dateEditText.getText().toString();
    }
}