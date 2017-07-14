package com.example.yehia67.mail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
     Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));//only email apps should handle this
        intent.putExtra(Intent.EXTRA_TEXT,msgcontent);
        intent.putExtra(Intent.EXTRA_SUBJECT,"bargb el app bta3y");
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"15p6013@eng.asu.edu.eg"});
            try {
                startActivity(intent);
            } catch (Exception e){
                 e.printStackTrace();
                Toast.makeText(this,"there is no email apps in your phone.",Toast.LENGTH_LONG).show();
            }

            }
}
