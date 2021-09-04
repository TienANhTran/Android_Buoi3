package com.example.android_buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {
    Button tieptuc1;
    EditText username;
    EditText matkhau;
    EditText nhaplaimatkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tieptuc1        = findViewById(R.id.tieptuc);
        username        = findViewById(R.id.username);
        matkhau         = findViewById(R.id.matkhau);
        nhaplaimatkhau  = findViewById(R.id.nhaplaimatkhau);
        tieptuc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username,matkhau,nhaplaimatkhau);
            }
        });
    }
    public boolean validate (EditText username , EditText matkhau , EditText nhaplaimatkhau)
    {
        String usernameInput = username.getText().toString();
        String matkhauInput = matkhau.getText().toString();
        String nhaplaimatkhauInput = nhaplaimatkhau.getText().toString();
        if(usernameInput.length()>=6 && !usernameInput.isEmpty() && matkhauInput.length()>=8 &&
                !matkhauInput.isEmpty() && matkhauInput == nhaplaimatkhauInput)
        {
            Toast.makeText(this,"Dang ky thanh cong", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        {

            Toast.makeText(this,"Kiem tra lai du lieu da nhap", Toast.LENGTH_LONG).show();
            return false;
        }

    }
}