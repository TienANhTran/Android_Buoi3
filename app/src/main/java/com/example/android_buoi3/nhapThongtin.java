package com.example.android_buoi3;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class nhapThongtin extends AppCompatActivity {
    Button tieptuc2;
    EditText sdt;
    EditText email;
    EditText tendaydu;
    EditText tencoquan;
    EditText matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nhapthongtin);
        tieptuc2        = findViewById(R.id.tieptuc);
        sdt             = findViewById(R.id.sdt);
        email           = findViewById(R.id.email);
        tendaydu        = findViewById(R.id.tendaydu);
        tencoquan       = findViewById(R.id.tencoquan);
        matkhau         = findViewById(R.id.matkhau);
        tieptuc2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                validate(sdt,email,tendaydu,tencoquan,matkhau);
            }
        });
    }
    public boolean validate(EditText sdt,EditText email , EditText tendaydu , EditText tencoquan ,
                            EditText matkhau) {
        String sdtInput = sdt.getText().toString();
        String emailInput = email.getText().toString();
        String tendayduInput = tendaydu.getText().toString();
        String tencoquanInput = tencoquan.getText().toString();
        String matkhauInput = matkhau.getText().toString();
        if (emailInput.isEmpty() || Patterns.EMAIL_ADDRESS.matcher(emailInput).matches())
        {
            Toast.makeText(this, "Nhập lại email!!", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (!sdtInput.isEmpty() || sdtInput.matches("[a-z]"))
        {
            Toast.makeText(this, " Nhập lại sđt ", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (!tendayduInput.isEmpty() || tendayduInput.matches("[0-9]"))
        {
            Toast.makeText(this, "Nhập lại tên đầy đủ", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!tencoquanInput.isEmpty() || tencoquanInput.matches("[0-9]"))
        {
            Toast.makeText(this, "Nhập lại tên cơ quan", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!matkhauInput.isEmpty() || matkhauInput.length() <8)
        {
            Toast.makeText(this, "Nhập lại mật khẩu", Toast.LENGTH_SHORT).show();
            return false;
        }
        else {
            Toast.makeText(this, "Nhập thông tin thành công", Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}
