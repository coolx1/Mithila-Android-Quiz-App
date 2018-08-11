package com.example.bhargav.mithila1;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import   android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static android.R.attr.delay;

public class MainActivity extends AppCompatActivity {

    Button b_answer1, b_answer2, b_answer3, b_answer4;
    TextView timer;

    ImageView iv_flag;

    List<CountryItem> list;

    Random r;
    int turn = 1;
    int score = 0;
    CountDownTimer Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        iv_flag = (ImageView) findViewById(R.id.iv_flag);

        b_answer1 = (Button) findViewById(R.id.b_answer1);
        b_answer2 = (Button) findViewById(R.id.b_answer2);
        b_answer3 = (Button) findViewById(R.id.b_answer3);
        b_answer4 = (Button) findViewById(R.id.b_answer4);
        timer =     (TextView) findViewById(R.id.timer);
        list = new ArrayList<>();
        //add all flags and names to the list
        for (int i = 0; i < new Database().answers.length; i++) {
            list.add(new CountryItem(new Database().answers[i], new Database().flags[i]));

        }

        //shuffle the countries
        Collections.shuffle(list);

        newQuestion(turn);

        b_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timer.cancel();
                //check if the answer is correct
                if(b_answer1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    b_answer1.setBackgroundColor(Color.GREEN);
                    score++;
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score: " + score + "/9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }

                }else{
                    b_answer1.setBackgroundColor(Color.RED);
                    if(b_answer2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer2.setBackgroundColor(Color.GREEN);

                    }
                    else if(b_answer3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer3.setBackgroundColor(Color.GREEN);

                    }
                    else {
                        b_answer4.setBackgroundColor(Color.GREEN);

                    }
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score:" + score + "/9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }


            }
        });


        b_answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timer.cancel();
                //check if the answer is correct
                if(b_answer2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    b_answer2.setBackgroundColor(Color.GREEN);
                    score++;
                    //check if the last question
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score: " + score + "9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else{
                    b_answer2.setBackgroundColor(Color.RED);
                    if(b_answer1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer1.setBackgroundColor(Color.GREEN);

                    }
                    else if(b_answer3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer3.setBackgroundColor(Color.GREEN);

                    }
                    else {
                        b_answer4.setBackgroundColor(Color.GREEN);

                    }
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score:" + score + "/9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }

            }
        });




        b_answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timer.cancel();
                //check if the answer is correct
                if(b_answer3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    b_answer3.setBackgroundColor(Color.GREEN);
                    score++;
                    //check if the last question
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score: " + score + "/9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else{
                    b_answer3.setBackgroundColor(Color.RED);
                    if(b_answer2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer2.setBackgroundColor(Color.GREEN);
                    }
                    else if(b_answer1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer1.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        b_answer4.setBackgroundColor(Color.GREEN);
                    }
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score:" + score + "/9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }

            }
        });


        b_answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timer.cancel();
                if(b_answer4.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    b_answer4.setBackgroundColor(Color.GREEN);
                    score++;
                    //check if the last question
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score: " + score + "/9",  Toast.LENGTH_SHORT).show();
                        finish();
                    }
                } else {
                    b_answer4.setBackgroundColor(Color.RED);
                    if(b_answer2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer2.setBackgroundColor(Color.GREEN);
                    }
                    else if(b_answer3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())){
                        b_answer3.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        b_answer1.setBackgroundColor(Color.GREEN);
                    }
                    if (turn < 9) {
                        turn++;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // Do something after 5s = 5000ms
                                newQuestion(turn);
                            }
                        }, 1000);


                    } else {
                        Toast.makeText(getApplicationContext(), "Score:" + score + "/9", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }

            }
        });}



    private void newQuestion(int number) {
        //set flag image to the screen
        b_answer1.setBackgroundColor(Color.YELLOW);
        b_answer2.setBackgroundColor(Color.WHITE);
        b_answer3.setBackgroundColor(Color.YELLOW);
        b_answer4.setBackgroundColor(Color.WHITE);
        iv_flag.setImageResource(list.get(number - 1).getImage());
        Timer = new CountDownTimer(11000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText((millisUntilFinished / 1000) +"s");
            }

            public void onFinish() {
                if (turn < 9) {
                    turn++;
                    newQuestion(turn);

                } else {
                    Toast.makeText(getApplicationContext(), "Score: " + score + "/9",  Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }.start();
        //decide on which button to place the correct answer
        int correct_answer = r.nextInt(4) + 1;

        int firstButton = number - 1 ;
        int secondButton;
        int thirdButton;
        int fourthButton;

        switch (correct_answer){
            case 1:
                b_answer1.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do{
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do{
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton );

                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());

                break;

            case 2:
                b_answer2.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do{
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do{
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton );

                b_answer1.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());

                break;

            case 3:

                b_answer3.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do{
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do{
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton );

                b_answer2.setText(list.get(secondButton).getName());
                b_answer1.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());

                break;


            case 4:
                b_answer4.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while (secondButton == firstButton);

                do{
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do{
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton );

                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer1.setText(list.get(fourthButton).getName());

                break;


        }


    }
}
