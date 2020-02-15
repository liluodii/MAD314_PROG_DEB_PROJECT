package com.example.jewelleryshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAuth = FirebaseAuth.getInstance();
        final EditText username = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        final Button login = findViewById(R.id.login);
        final Button signup = findViewById(R.id.register);
        final TextView forgotpwd = findViewById(R.id.forgotpwd);
        final TextView sampletext = findViewById(R.id.sampletext);
        final TextView sampletext2 = findViewById(R.id.sampletext2);
        final TextView message = findViewById(R.id.message);
        final Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = username.getText().toString();
                String pwd = password.getText().toString();
                if (email.isEmpty()) {
                    username.setError("Please Enter Email id");
                    username.requestFocus();
                } else if (pwd.isEmpty()) {
                    password.setError("Please Enter your password");
                    password.requestFocus();
                } else if (email.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Fields Are Empty", Toast.LENGTH_LONG);
                } else if (!(email.isEmpty() && pwd.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "SignUp Unsuccessful", Toast.LENGTH_LONG);
                            } else {
                                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(MainActivity.this, "Error Occured!", Toast.LENGTH_SHORT);
                }



            }

        });
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                 startActivity(intent);

             }
         });
    }
}