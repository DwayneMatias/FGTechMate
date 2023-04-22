package com.FGTechMate.myapp10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class battery extends AppCompatActivity {


    EditText mEditText1;
    EditText mEditText2;
    EditText mEditText3;
    TextView mTextView;
    Button mButton;
    TextView mTextView2;
    TextView mTextView3;
   



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        Button reset = (Button)findViewById(R.id.resetbutton);

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mEditText1.setText("");
                mEditText2.setText("");
                mEditText3.setText("");
                mTextView.setText("");
                mTextView2.setText("");
                mTextView3.setText("");



            }
        });


        mEditText1 = findViewById(R.id.edit1);
        mEditText2 = findViewById(R.id.edit2);
        mEditText3 = findViewById(R.id.edit3);

        mEditText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mEditText1.getText().toString().length()==2){
                    mEditText2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mEditText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mEditText2.getText().toString().length()==3){
                    mEditText3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mEditText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mEditText3.getText().toString().length()==2){
                    mEditText1.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Bind the EditText views

        mEditText1 = (EditText)findViewById(R.id.edit1);
        mEditText2 = (EditText)findViewById(R.id.edit2);
        mEditText3 = (EditText)findViewById(R.id.edit3);
        mTextView = (TextView)findViewById(R.id.textview2);
        mTextView2 = (TextView)findViewById(R.id.textview3);
        mTextView3 = (TextView)findViewById(R.id.textview11);

        mButton =  (Button)findViewById(R.id.calculateButton);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //When the button is clicked, call the calucate method.
                calculate();




            }
        });

    }

    public void calculate(){
        //get entered texts from the edittexts,and convert to integers.
        Double value1 = Double.parseDouble(mEditText1.getText().toString());
        Double value2 = Double.parseDouble(mEditText2.getText().toString());
        Double value3 = Double.parseDouble(mEditText3.getText().toString());
        //do the calculation
        Double calculatedValue = (value3-1)/(2)*value2; Double calculatedvalue2 = (value1*2); Double calculatedvalue3 = (calculatedValue*1.1);

        //set the value to the textview, to display on screen.
        mTextView.setText(calculatedValue.toString());
        mTextView2.setText(calculatedvalue2.toString());
        mTextView3.setText(calculatedvalue3.toString());

        mTextView3.setText(Double.toString(Math.round(calculatedvalue3*100.0)/100.0));


        int answer=(Integer.parseInt(String.valueOf(mEditText1.getText())) /Integer.parseInt(String.valueOf(mEditText2.getText()))*Integer.parseInt(String.valueOf(mEditText3.getText())));
    }


    }
