package com.example.yehia67.mail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  submit;
    EditText edit;
    CheckBox wald,bent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          submit = (Button) findViewById(R.id.button);
          edit = (EditText) findViewById(R.id.edittxt);
          wald = (CheckBox) findViewById(R.id.wald);
          bent = (CheckBox) findViewById(R.id.bnt);
    submit.setOnClickListener(this);//monkn a7otha 3la ay subject 3lshan a reconize el click
    }

    @Override
    public void onClick(View view) {
       String name = edit.getText().toString();
        boolean Wald = wald.isChecked();
        boolean bnt = bent.isChecked();
        String FinalRequest = "Request for"+ name + "\n"+"wald"+ Wald+"\n"+"bnt" + bnt+"\n";
        
    }

}
