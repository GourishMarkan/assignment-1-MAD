package com.gourish.assignment_1_mad;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    Button button;

    Button register;
    EditText username;
    EditText password;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);
        username=findViewById(R.id.edit_text1);
        password=findViewById(R.id.edit_text2);
        register=findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = username.getText().toString();
                String password1 = password.getText().toString();
                if (name1.equals("admin") && password1.equals("admin")) {
                    Toast.makeText(LoginActivity.this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, DashboardActivity2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "login failed", Toast.LENGTH_SHORT).show();
                }

            }


        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;

    }
}