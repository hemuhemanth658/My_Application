package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button hello = (Button)findViewById(R.id.button1);
        final Button Button2= (Button)findViewById(R.id.button2);
        final TextView t = (TextView)findViewById(R.id.text1);
        final TextView t2=(TextView)findViewById(R.id.text2);
        hello.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                hello.setText((hello.getText() == "Show Text")?"Hide Text":"Show Text");
                t.setVisibility((t.getVisibility() == View.VISIBLE)?View.INVISIBLE:View.VISIBLE);
                }
            });
            t2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    t2.setVisibility(View.INVISIBLE);
                    return true;
                }
            });
            Button2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Button2.setVisibility(View.VISIBLE);
                    return true;
                }
            });
        };
    public void toast() {
        Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG).show();
    }
}