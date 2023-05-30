package com.kz.fourthproject.authentification;

import static com.kz.fourthproject.dataBase.StoreDatabase.COLUMN_EMAIL;
import static com.kz.fourthproject.dataBase.StoreDatabase.COLUMN_NAME;
import static com.kz.fourthproject.dataBase.StoreDatabase.COLUMN_PASSWORD;
import static com.kz.fourthproject.dataBase.StoreDatabase.COLUMN_PHONE;
import static com.kz.fourthproject.dataBase.StoreDatabase.TABLE_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kz.fourthproject.R;
import com.kz.fourthproject.dataBase.StoreDatabase;

public class RegisterActivity extends AppCompatActivity {

    EditText et_register_name, et_register_phone, et_register_email, et_register_password;
    Button btn_register_register, btn_register_login;
    StoreDatabase storeDatabase;
    SQLiteDatabase sqLiteDatabase;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_register_name = findViewById(R.id.et_register_name);
        et_register_phone = findViewById(R.id.et_register_phone);
        et_register_email = findViewById(R.id.et_register_email);
        et_register_password = findViewById(R.id.et_register_password);

        btn_register_register = findViewById(R.id.btn_register_register);
        btn_register_login = findViewById(R.id.btn_register_login);
        storeDatabase = new StoreDatabase(this);
        sqLiteDatabase = storeDatabase.getWritableDatabase();

        btn_register_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(et_register_name.getText())) {
                    et_register_name.setError("Write your name");
                    return;
                }
                if (TextUtils.isEmpty(et_register_phone.getText())) {
                    et_register_phone.setError("Write your phone");
                    return;
                }
                if (TextUtils.isEmpty(et_register_email.getText())) {
                    et_register_email.setError("Write a email");
                    return;
                }
                if (TextUtils.isEmpty(et_register_password.getText())) {
                    et_register_password.setError("Write your password");
                    return;
                }

                ContentValues values = new ContentValues();
                values.put(COLUMN_NAME, et_register_name.getText().toString());
                values.put(COLUMN_PHONE, et_register_phone.getText().toString());
                values.put(COLUMN_EMAIL, et_register_email.getText().toString());
                values.put(COLUMN_PASSWORD, et_register_password.getText().toString());

                sqLiteDatabase.insert(TABLE_NAME, null, values);

                Intent newregistrationIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(newregistrationIntent);
            }
        });
    }
}