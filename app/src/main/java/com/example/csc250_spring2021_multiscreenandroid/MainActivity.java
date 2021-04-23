package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private int counter;
    private EditText Nametext;
    private EditText Numbertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Nametext = this.findViewById(R.id.Nametext);
        this.Numbertext = this.findViewById(R.id.Numbertext);
    }

    public void onNextScreenButtonClicked(View v)
    {
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        Intent j = new Intent (this, MySingleton.class);
        String Thename = this.Nametext.getText().toString();
        String Thenumber = this.Numbertext.getText().toString();
        j.putExtra("name", Thename);
        i.putExtra("number", Thenumber);

        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
        MySingleton.counter++;
        this.startActivity(i);
    }
}