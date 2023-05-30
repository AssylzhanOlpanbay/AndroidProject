package com.kz.fourthproject.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kz.fourthproject.R;
import com.kz.fourthproject.authentification.LoginActivity;
import com.kz.fourthproject.fragments.Fragment1;
import com.kz.fourthproject.fragments.Fragment2;
import com.kz.fourthproject.fragments.Fragment3;
import com.kz.fourthproject.fragments.Fragment4;

public class NavigationActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_my_cabinet, btn_contact, btn_questions;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        btn_my_cabinet = findViewById(R.id.btn_my_cabinet);
        btn_contact = findViewById(R.id.btn_contact);
        btn_questions = findViewById(R.id.btn_questions);

        btn_my_cabinet.setOnClickListener(this);
        btn_contact.setOnClickListener(this);
        btn_questions.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_my_cabinet) {
            changeFragment(new Fragment1());
        } else if (id == R.id.btn_contact) {
            changeFragment(new Fragment2());
        } else if (id == R.id.btn_questions) {
            changeFragment(new Fragment3());
        }
    }

    public void changeFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (fragmentManager != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content, fragment);
            fragmentTransaction.commit();


        }
    }
}