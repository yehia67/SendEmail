package com.example.yehia67.mail;

import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    String msgcontent;
    TextView tvreq;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Bundle b = getIntent().getExtras();
        msgcontent = b.getString("Extra key","default");// in case no data in Intent print default
        tvreq = (TextView) findViewById(R.id.tv);
        tvreq.setText(msgcontent);

        btn = (Button)findViewById(R.id.btnEmail);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

    }
}
