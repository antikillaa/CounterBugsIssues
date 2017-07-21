package com.example.stanislavpeshkur.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBugsCounterButton;
    private int mCount = 0;
    private  int mIssue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBugsCounterButton = (Button)findViewById(R.id.bugsCounter);
        final TextView mCountTextView = (TextView)findViewById(R.id.textView);

        mBugsCounterButton.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mCountTextView.setText("I count " + ++mCount + " Bugs");
        }
        });
    }

    public void onClick(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText("HelloKitty!");

    }


    public void NewIssue(View view) {
        final TextView mCountIssue = (Button) findViewById(R.id.buttonIssue);
        final TextView mCountTextView = (TextView)findViewById(R.id.textView2);
        mCountIssue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mCountTextView.setText("I count " + ++mIssue + " Bugs");
            }
                                       }

        );
    }
}
