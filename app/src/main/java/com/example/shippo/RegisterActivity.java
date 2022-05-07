package com.example.shippo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    TextView email,username,pass,phone;
    RadioButton user,agency;
    Button register;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.remail);
        username = findViewById(R.id.rname);
        pass = findViewById(R.id.rpassword);
        phone = findViewById(R.id.rphonenumber);
        user = findViewById(R.id.ruser);
        agency = findViewById(R.id.ragency);
        register = findViewById(R.id.rregister);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("ship/users/register");
                String regemail = email.getText().toString();
                String regname = username.getText().toString();
                String regpass = pass.getText().toString();
                String regphone = phone.getText().toString();
                UserHelperClass helper = new UserHelperClass(regemail,regname,regpass,regphone);
                reference.child(regphone).setValue(helper);

            }
        });

    }



}