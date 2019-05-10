package com.abdulapps.flourapptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView mEmailView;
    private EditText mpasswordview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView_email);
        mpasswordview = (EditText) findViewById(R.id.text_password);


        mpasswordview.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

//                if (id == R.integer.login || id == EditorInfo.IME_NULL) {
//                    attemptLogin();
//                    return true;
//                }
                return false;
            }
        });




    }


    public void signinwithExistingUser(View view){
        attemptLogin();
    }

    public void registerNewUser(View view){
        Intent intent = new Intent(this, sign_up_activity.class);
        finish();
        startActivity(intent);

    }

    private void attemptLogin(){

        Intent intent = new Intent(this , main_order_activity.class);
        finish();
        startActivity(intent);

    }


      /*

            private void showerrorDialogue(String message){

        new AlertDialog.Builder(this)
                .setTitle("Oops!")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok,null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

         */
}
