package com.kz.fourthproject.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kz.fourthproject.R;
import com.kz.fourthproject.ui.MainActivity;
import com.kz.fourthproject.ui.MyCabinet;
import com.kz.fourthproject.ui.NavigationActivity;
import com.kz.fourthproject.ui.NewChat;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fragment1 extends Fragment {
    View view;

    CircleImageView user_photo;
    Button btn_startTest;
    Button follow, contact;

    TextView email, name, phoneNumber;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_1, container, false);

        Intent intent = getActivity().getIntent();
        String userEmail = intent.getStringExtra("email");
        String userName = intent.getStringExtra("name");
        String userStatus = intent.getStringExtra("phoneNumber");

        user_photo = view.findViewById(R.id.user_photo);
        email = view.findViewById(R.id.email);
        email.setText("User email: " + userEmail);

        name = view.findViewById(R.id.user_name);
        name.setText(userName);

        phoneNumber = view.findViewById(R.id.phoneNumber);
        phoneNumber.setText(userStatus);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(user_photo);

        btn_startTest = view.findViewById(R.id.btn_startTest);
        follow = view.findViewById(R.id.follow);
        contact = view.findViewById(R.id.contact);

        btn_startTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fragment1.this.getActivity(), Fragment3.class);
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fragment1.this.getActivity(), Fragment2.class);
                startActivity(intent);
            }
        });
        return view;
    }
}