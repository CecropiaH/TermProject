package com.example.termproject;


import androidx.appcompat.app.AppCompatActivity;


import android.app.Instrumentation.ActivityResult;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    TextView welcome;
    TextView text1;
    EditText password, username;
    Button enter;
    Button makeAccount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.Welcome);
        text1 = findViewById(R.id.Text3);
        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);

        enter = findViewById(R.id.Enter);
        makeAccount = findViewById(R.id.MakeAccount);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkLogin(password.getText().toString(), username.getText().toString());
                //check to see if password and username match an account in the database
            }
        });



        makeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MakeNewAccountActivity.class);
                //makeNewAccountActivityResultLauncher.launch(intent);
            }
        });
    }
    public boolean usernameCheck(String username){
        boolean answer = false;
        return answer;
    }
    public boolean passwordCheck(String password){
        boolean answer = false;
        return answer;
    }

    public User checkLogin(String password, String username){
        User result = null;
        if( passwordCheck(password) && usernameCheck(username)){
            //display welcome message

            //display options depending on class

        }
        return result;
    }

/*
    ActivityResultLauncher<Intent> makeNewAccountActivityResultLauncher = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
        new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == MakeNewAccountActivity.RESULT_OK) {
                    Intent data = result.getData();
                }
            }
        });

 */


}