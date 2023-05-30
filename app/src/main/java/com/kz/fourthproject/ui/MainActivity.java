package com.kz.fourthproject.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.kz.fourthproject.R;

public class MainActivity extends AppCompatActivity {

    TextView tv_question1, tv_question2, tv_question3, tv_question4;
    RadioButton rb_question1_ans1, rb_question1_ans2;
    RadioButton rb_question2_ans1, rb_question2_ans2;
    RadioButton rb_question3_ans1, rb_question3_ans2;
    RadioButton rb_question4_ans1, rb_question4_ans2;
    Button btn_check, folow;

    String [] questions = {"1 + 1 = ?", "5 + 2 = ?", "4 + 2 = ?", "5 + 7 = ?"};

    String [][] variants = {
            {"2" , "3"},
            {"6" , "7"},
            {"8" , "6"},
            {"12" , "14"},
    };

    String [] answers = {"2", "7", "6", "12"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_question1 = findViewById(R.id.tv_question1);
        tv_question2 = findViewById(R.id.tv_question2);
        tv_question3 = findViewById(R.id.tv_question3);
        tv_question4 = findViewById(R.id.tv_question4);

        rb_question1_ans1 = findViewById(R.id.rb_question1_ans1);
        rb_question1_ans2 = findViewById(R.id.rb_question1_ans2);

        rb_question2_ans1 = findViewById(R.id.rb_question2_ans1);
        rb_question2_ans2 = findViewById(R.id.rb_question2_ans2);

        rb_question3_ans1 = findViewById(R.id.rb_question3_ans1);
        rb_question3_ans2 = findViewById(R.id.rb_question3_ans2);

        rb_question4_ans1 = findViewById(R.id.rb_question4_ans1);
        rb_question4_ans2 = findViewById(R.id.rb_question4_ans2);

        btn_check = findViewById(R.id.btn_check);

        questionsJinau();

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checking(tv_question1, rb_question1_ans1, rb_question1_ans2, 0);
                checking(tv_question2, rb_question2_ans1, rb_question2_ans2, 1);
                checking(tv_question3, rb_question3_ans1, rb_question3_ans2, 2);
                checking(tv_question4, rb_question4_ans1, rb_question4_ans2, 3);

                if (rb_question1_ans1.isChecked() &&
                        rb_question1_ans1.getText().toString().equals(answers[0])) {
                    tv_question1.setText(questions[0] + "\nCorrect answer");
                    tv_question1.setTextColor(getResources().getColor(R.color.green));
                } else if (rb_question1_ans2.isChecked() &&
                        rb_question1_ans2.getText().toString().equals(answers[0])) {
                    tv_question1.setText(questions[0] + "\nCorrect answer");
                    tv_question1.setTextColor(getResources().getColor(R.color.green));
                } else {
                    tv_question1.setText(questions[0] + "\nIncorrect answer");
                    tv_question1.setTextColor(getResources().getColor(R.color.red));
                }

                if (rb_question2_ans1.isChecked() &&
                        rb_question2_ans1.getText().toString().equals(answers[1])) {
                    tv_question2.setText(questions[1] + "\nCorrect answer");
                    tv_question2.setTextColor(getResources().getColor(R.color.green));
                } else if (rb_question2_ans2.isChecked() &&
                        rb_question2_ans2.getText().toString().equals(answers[1])) {
                    tv_question2.setText(questions[1] + "\nCorrect answer");
                    tv_question2.setTextColor(getResources().getColor(R.color.green));
                } else {
                    tv_question2.setText(questions[1] + "\nIncorrect answer");
                    tv_question2.setTextColor(getResources().getColor(R.color.red));
                }
            }
        });


    }

    public void checking(TextView tv_question, RadioButton rb1, RadioButton rd2, int index) {
        if (rb1.isChecked() &&
                rb1.getText().toString().equals(answers[index])) {
            tv_question.setText(questions[index] + "\nCorrect answer");
            tv_question.setTextColor(getResources().getColor(R.color.green));
        } else if (rd2.isChecked() &&
                rd2.getText().toString().equals(answers[index])) {
            tv_question.setText(questions[index] + "\nCorrect answer");
            tv_question.setTextColor(getResources().getColor(R.color.green));
        } else {
            tv_question.setText(questions[index] + "\nIncorrect answer");
            tv_question.setTextColor(getResources().getColor(R.color.red));
        }
    }

    public void questionsJinau() {
        tv_question1.setText(questions[0]);
        rb_question1_ans1.setText(variants[0][0]);
        rb_question1_ans2.setText(variants[0][1]);

        tv_question2.setText(questions[1]);
        rb_question2_ans1.setText(variants[1][0]);
        rb_question2_ans2.setText(variants[1][1]);

        tv_question3.setText(questions[2]);
        rb_question3_ans1.setText(variants[2][0]);
        rb_question3_ans2.setText(variants[2][1]);

        tv_question4.setText(questions[3]);
        rb_question4_ans1.setText(variants[3][0]);
        rb_question4_ans2.setText(variants[3][1]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}