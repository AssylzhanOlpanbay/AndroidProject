package com.kz.fourthproject.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kz.fourthproject.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyCabinet extends AppCompatActivity {

    it

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cabinet);

        Intent intent = getIntent();
        String userEmail = intent.getStringExtra("email");
        String userName = intent.getStringExtra("name");
        String userStatus = intent.getStringExtra("phoneNumber");




        user_photo = findViewById(R.id.user_photo);
        email = findViewById(R.id.email);
        email.setText("User email: " + userEmail);

        name = findViewById(R.id.user_name);
        name.setText(userName);

        phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.setText(userStatus);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(user_photo);

        btn_startTest = findViewById(R.id.btn_startTest);
        follow = findViewById(R.id.follow);
        contact = findViewById(R.id.contact);

        btn_startTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyCabinet.this, MainActivity.class);
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyCabinet.this, NewChat.class);
                startActivity(intent);
            }
        });
    }
}