package com.example.recycylicview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class OtpSlide extends AppCompatActivity {
    EditText mEditText1,mEditText2,mEditText3,mEditText4;
    String mOtp1,mOtp2,mOtp3,mOtp4;

    final StringBuilder mStringBuilder=new StringBuilder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_slide);
        mEditText1=(EditText)findViewById(R.id.edit_otp1);
        mEditText2=(EditText)findViewById(R.id.edit_otp2);
        mEditText3=(EditText)findViewById(R.id.edit_otp3);
        mEditText4=(EditText)findViewById(R.id.edit_otp4);
        
        mOtp1=mEditText1.getText().toString();
        mOtp2=mEditText2.getText().toString();
        mOtp3=mEditText3.getText().toString();
        mOtp4=mEditText4.getText().toString();


        mEditText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mEditText1.getText().toString().length()==1){
                    mEditText2.requestFocus();
                   // mEditText2.setCursorVisible(true);
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
                {
                    if(mEditText2.getText().toString().length()==1) {
                        mEditText3.requestFocus();
                     //   mEditText3.setCursorVisible(true);
                    }

                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (mEditText2.getText().toString().length()==0)
                    mEditText1.requestFocus();

            }
        });


        mEditText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(mEditText3.getText().toString().length()==1) {
                    mEditText4.requestFocus();
                    //mEditText4.setCursorVisible(true);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (mEditText3.getText().toString().length()==0)
                    mEditText2.requestFocus();

            }
        });
        mEditText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (mEditText4.getText().toString().length()==1) {
                    mEditText4.requestFocus();
                    //mEditText4.setCursorVisible(false);
                }



            }

            @Override
            public void afterTextChanged(Editable s) {
                if (mEditText4.getText().toString().length()==0)
                    mEditText3.requestFocus();

            }
        });

    }

}
