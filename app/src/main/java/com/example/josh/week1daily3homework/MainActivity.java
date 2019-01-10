package com.example.josh.week1daily3homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button butt;
    TextView tex;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butt = (Button)findViewById(R.id.button);
        final TextView tex = (TextView)findViewById(R.id.textView);
        final EditText ed = (EditText)findViewById(R.id.editText);
        butt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                tex.setText(ed.getText().toString());
            }
        });
    }

}
