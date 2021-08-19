package com.example.mybankmkhondeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loans extends AppCompatActivity {
    Button add_loan_to_member, outstanding_loan, loan_repayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loans);
        add_loan_to_member = findViewById(R.id.addLoanToMemberButton);
        outstanding_loan  = findViewById(R.id.outStandingLoansButton);
        loan_repayment  = findViewById(R.id.loanRepaymentButton);


        add_loan_to_member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), AddLoanToMemberPage.class);
                startActivity(intent);


            }
        });

        outstanding_loan .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), OutsandingLoansPage.class);
                startActivity(intent);


            }
        });

        loan_repayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), LoanRepaymentPage.class);
                startActivity(intent);


            }
        });
    }
}