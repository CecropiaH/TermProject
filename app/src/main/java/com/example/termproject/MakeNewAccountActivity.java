package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.activity.

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MakeNewAccountActivity extends AppCompatActivity {

    TextView heading;
    TextView text3;
    TextView text4;
    EditText newPassword;
    EditText newUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_new_account);

        heading = findViewById(R.id.heading);
        text3 = findViewById(R.id.Text3);
        text4 = findViewById(R.id.Text4);
        newPassword = findViewById(R.id.NewPassword);
        newUsername = findViewById(R.id.NewUsername);

    }
    public void addAccount(View view){
        Intent returnIntent = new Intent();


        returnIntent.putExtra("newPassword", newPassword.getId());
        setResult(RESULT_OK, returnIntent);

        finish();
    }
}