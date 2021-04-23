package com.example.csc250_spring2021_multiscreenandroid;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
public class MySingleton extends AppCompatActivity
{
    Intent myIntent = this.getIntent();


    String name1 = myIntent.getStringExtra("name");
    static String name = name1;
    static int counter = 0;
}
