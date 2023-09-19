package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    public void LogIn(View view){
        EditText username=(EditText) findViewById(R.id.UsernameEditText);
        EditText password=(EditText) findViewById(R.id.PasswordEditText);


        if(username.getText().toString().equals("123") && password.getText().toString().equals("123")){
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this, SecondMainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
        else {
            CharSequence text = "username or password is wrong";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(this , text, duration);
            toast.show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button) findViewById(R.id.LoginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SecondMainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}


