package a7negreene.gmail.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import static a7negreene.gmail.com.calculator.R.id.button0;
import static a7negreene.gmail.com.calculator.R.id.button4;
import static a7negreene.gmail.com.calculator.R.id.button5;
import static a7negreene.gmail.com.calculator.R.id.button6;
import static a7negreene.gmail.com.calculator.R.id.button7;
import static a7negreene.gmail.com.calculator.R.id.button8;
import static a7negreene.gmail.com.calculator.R.id.button9;
import static a7negreene.gmail.com.calculator.R.id.buttonclear;
import static a7negreene.gmail.com.calculator.R.id.buttonsubtract;
import static android.R.attr.button;
import static android.R.attr.tension;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity  {

    Button buttonAdd;
    Button buttonSubtract;
    Button buttonMultiply;
    Button buttonEqual;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button clear;
    EditText edt1;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    float mValueOne, mValueTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add buttons to java
        buttonAdd = (Button) findViewById(R.id.buttonaddition);
        buttonSubtract = (Button) findViewById(R.id.buttonsubtract);
        buttonMultiply = (Button) findViewById(R.id.buttonmultiply);
        buttonEqual = (Button) findViewById(R.id.buttonequal);
        two = (Button) findViewById(R.id.button2);
        zero = (Button) findViewById(button0);
        one = (Button) findViewById(R.id.button1);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(button4);
        five = (Button) findViewById(button5);
        six = (Button) findViewById(button6);
        seven = (Button) findViewById(button7);
        eight = (Button) findViewById(button8);
        nine = (Button) findViewById(button9);
        clear = (Button) findViewById(buttonclear);
        edt1 = (EditText) findViewById(R.id.edittext);
        //set Buttons to listener



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                    buttonSubtract.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mValueOne = Float.parseFloat(edt1.getText() + "");
                            mSubtract = true;
                            edt1.setText(null);
                        }
                    });

                    buttonMultiply.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mValueOne = Float.parseFloat(edt1.getText() + "");
                            mMultiplication = true;
                            edt1.setText(null);
                        }
                    });
                    clear.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           edt1.setText("");
                                                       }
                                                   });
                    buttonEqual.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mValueTwo = Float.parseFloat(edt1.getText() + "");

                            if (mAddition == true) {

                                edt1.setText(mValueOne + mValueTwo + "");
                                mAddition = false;
                            }


                            if (mSubtract == true) {
                                edt1.setText(mValueOne - mValueTwo + "");
                                mSubtract = false;
                            }

                            if (mMultiplication == true) {
                                edt1.setText(mValueOne * mValueTwo + "");
                                mMultiplication = false;
                            }

                            if (mDivision == true) {
                                edt1.setText(mValueOne / mValueTwo + "");
                                mDivision = false;
                            }

                        }
                    });
                }
            }
        });
        }
    }


