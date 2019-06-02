package com.example.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText username, email ,phonenumber, password, confirmpassword ;
    Button proceed ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerLayout);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phonenumber = findViewById(R.id.phonenumber);
        password = findViewById(R.id.password);
        confirmpassword = findViewById(R.id.confirmpassword);
        proceed= findViewById(R.id.proceed);


        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameValue = username.getText().toString();
                String emailvalue = email.getText().toString();
                String phonenumberValue = phonenumber.getText().toString();
                String passwordValue = password.getText().toString();
                String confirmpasswordValue = confirmpassword.getText().toString();
            }
        });




    }
}
