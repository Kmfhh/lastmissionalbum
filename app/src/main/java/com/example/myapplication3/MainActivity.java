package com.example.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton g,z;
    private ImageView main;
    int counter=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main=findViewById(R.id.mainIMG);
        g=findViewById(R.id.next);
        g.setOnClickListener(this);
        z=findViewById(R.id.back);
        z.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.next && counter!=5)
            counter++;
        else
        {counter=1;main.setImageResource(R.drawable.lion2);}

        if(v.getId()==R.id.back && counter!=1)
            counter--;
        if (counter==1)
            main.setImageResource(R.drawable.lion2);
        if (counter==2)
            main.setImageResource(R.drawable.owl);
        if (counter==3)
            main.setImageResource(R.drawable.donkey);
        if (counter==4)
            main.setImageResource(R.drawable.tiger);
        if (counter==5)
            main.setImageResource(R.drawable.hippo);
    }
}