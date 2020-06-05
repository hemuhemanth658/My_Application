
package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button hello = (Button) findViewById(R.id.button1);
        final Button Button2 = (Button) findViewById(R.id.button2);
        final TextView t = (TextView) findViewById(R.id.text1);
        final TextView t2 = (TextView) findViewById(R.id.text2);
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setText((hello.getText() == "Show Text") ? "Hide Text" : "Show Text");
                t.setVisibility((t.getVisibility() == View.VISIBLE) ? View.INVISIBLE : View.VISIBLE);

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t2.getVisibility() == View.INVISIBLE) {
                    t2.setVisibility(View.VISIBLE);
                    Button2.setEnabled(false);
                } else {
                    Button2.setEnabled(true);
                }
            }

        });

        t2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Button2.setEnabled(true);
                t2.setVisibility(View.INVISIBLE);
                return true;
            }
        });

    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "please don't kill me!", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "I am too young to kill", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.exitButton) {
            onDestroy();
        }
    }


//    public void toast() {
//        Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG).show();
//
//    }
}