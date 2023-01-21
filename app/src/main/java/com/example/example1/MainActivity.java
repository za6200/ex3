package com.example.example1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView8;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView8 = findViewById(R.id.imageView8);
    }
    public void go(View view) {
        Random rnd = new Random();
        int y = rnd.nextInt(3)+1;
        button.setText("Click num: "+ y);
        switch(y)
        {
            case 1:
                imageView8.setImageResource(R.drawable.donald_trump_official_portrait);
                break;
            case 2:
                imageView8.setImageResource(R.drawable.images);
                break;
            case 3:
                imageView8.setImageResource(R.drawable.mg_8571__19492588742___cropped_);
                break;
        }
    }
}