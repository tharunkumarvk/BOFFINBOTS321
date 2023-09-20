package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

    }

    public void LogIn(View view){
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();


        if(username.equals("123") && password.equals("123")){

                    Intent intent=new Intent(MainActivity.this, SecondMainActivity.class);
                    startActivity(intent);
                    finish();
        }
        else {
            CharSequence text = "username or password is wrong";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(this , text, duration);
            toast.show();
        }
    }

}


