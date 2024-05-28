package com.gourish.assignment_1_mad;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {
    Button button;
    EditText username;
    EditText password;

    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        button = findViewById(R.id.button2);
        email = findViewById(R.id.editTextTextEmailAddress2);
        username = findViewById(R.id.editTextText2);
        password = findViewById(R.id.editTextTextPassword2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = username.getText().toString();
                String password1 = password.getText().toString();
                String email1 = email.getText().toString();
                if (name1.equals("admin") && password1.equals("admin")&&email1.equals("admin@gmail.com")) {
                    Toast.makeText(RegisterActivity.this, "register Sucessfull", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(RegisterActivity.this, "registeration failed", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}