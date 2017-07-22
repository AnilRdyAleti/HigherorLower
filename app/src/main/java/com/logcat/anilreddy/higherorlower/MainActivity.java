package com.logcat.anilreddy.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
       // Toast.makeText(getApplicationContext(),"Than Random is "+ randomNumber,Toast.LENGTH_SHORT).show();
    }
    public void makeToast(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }

    public void randomNumber(View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        int guessInt =Integer.parseInt(editText.getText().toString());

        if (guessInt > randomNumber) {
         makeToast("Lower!");
        } else if (guessInt < randomNumber) {
            makeToast("Higher!");
        } else {
            makeToast("That's Great!! Try Again!!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }
}
