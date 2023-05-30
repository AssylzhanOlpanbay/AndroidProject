package com.kz.fourthproject.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.kz.fourthproject.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fragment2 extends Fragment {

    CircleImageView users_photo, users_photo2, users_photo3, users_photo4, users_photo5;

    TextView users_phoneNumber, users_phoneNumber2,users_phoneNumber3, users_phoneNumber4, users_phoneNumber5;

    Button btn_call, btn_sms, btn_camera;
    Button btn_call2, btn_sms2, btn_camera2;
    Button btn_call3, btn_sms3, btn_camera3;
    Button btn_call4, btn_sms4, btn_camera4;
    Button btn_call5, btn_sms5, btn_camera5;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_2, container, false);
        users_phoneNumber = view.findViewById(R.id.users_phoneNumber);
        btn_call = view.findViewById(R.id.btn_call);
        btn_sms = view.findViewById(R.id.btn_sms);

        users_phoneNumber2 = view.findViewById(R.id.users_phoneNumber2);
        btn_call2 = view.findViewById(R.id.btn_call2);
        btn_sms2 = view.findViewById(R.id.btn_sms2);

        users_phoneNumber3 = view.findViewById(R.id.users_phoneNumber3);
        btn_call3 = view.findViewById(R.id.btn_call3);
        btn_sms3 = view.findViewById(R.id.btn_sms3);

        users_phoneNumber4 = view.findViewById(R.id.users_phoneNumber4);
        btn_call4 = view.findViewById(R.id.btn_call4);
        btn_sms4 = view.findViewById(R.id.btn_sms4);

        users_phoneNumber5 = view.findViewById(R.id.users_phoneNumber5);
        btn_call5 = view.findViewById(R.id.btn_call5);
        btn_sms5 = view.findViewById(R.id.btn_sms5);

        users_photo = view.findViewById(R.id.users_photo);
        users_photo2 = view.findViewById(R.id.users_photo2);
        users_photo3 = view.findViewById(R.id.users_photo3);
        users_photo4 = view.findViewById(R.id.users_photo4);
        users_photo5 = view.findViewById(R.id.users_photo5);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(users_photo);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(users_photo2);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(users_photo3);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(users_photo4);

        Glide.with(this)
                .load("https://cdn-icons-png.flaticon.com/512/3135/3135715.png")
                .centerCrop()
                .placeholder(R.drawable.account)
                .into(users_photo5);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + users_phoneNumber.getText()));
                startActivity(intent);
            }
        });

        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto: " + users_phoneNumber.getText());
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, uri);
                intent1.putExtra("sms_body", "Hello, ");
                startActivity(intent1);
            }
        });

        btn_call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + users_phoneNumber2.getText()));
                startActivity(intent);
            }
        });

        btn_sms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto: " + users_phoneNumber2.getText());
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, uri);
                intent1.putExtra("sms_body", "Hello, ");
                startActivity(intent1);
            }
        });

        btn_call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + users_phoneNumber3.getText()));
                startActivity(intent);
            }
        });

        btn_sms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto: " + users_phoneNumber3.getText());
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, uri);
                intent1.putExtra("sms_body", "Hello, ");
                startActivity(intent1);
            }
        });

        btn_call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + users_phoneNumber4.getText()));
                startActivity(intent);
            }
        });

        btn_sms4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto: " + users_phoneNumber4.getText());
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, uri);
                intent1.putExtra("sms_body", "Hello, ");
                startActivity(intent1);
            }
        });

        btn_call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + users_phoneNumber5.getText()));
                startActivity(intent);
            }
        });

        btn_sms5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto: " + users_phoneNumber5.getText());
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, uri);
                intent1.putExtra("sms_body", "Hello, ");
                startActivity(intent1);
            }
        });

        /*btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhoto();
            }
        });
    }*/

    /*public void takePhoto(){
        if (checkPermission()) {
            requestPermission();
        } else {
            CropImage.activity()
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .start(this);
        }
    }

    private boolean checkPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            return false;
        }
        return true;
    }

    private static final int PERMISSION_REQUEST_CODE = 200;

    private void requestPermission() {
        ActivityCompat.requestPermissions(this,
                new String[]{android.Manifest.permission.CAMERA},
                PERMISSION_REQUEST_CODE);
    }*/

        return view;
    }
}