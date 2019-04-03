package com.example.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button rec,cir,squr,oval,heart,diamond,star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec=(Button) findViewById( R.id.button_rec);
        rec.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });
        cir=(Button) findViewById( R.id.button_circle);
        cir.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });
        squr=(Button) findViewById( R.id.button_square);
        squr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });
        heart=(Button) findViewById( R.id.button_heart);
        heart.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });
        oval=(Button) findViewById( R.id.button_oval);

        oval.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });
        diamond=(Button) findViewById( R.id.button_diamond);
        diamond.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });
        star=(Button) findViewById( R.id.button_star);
        star.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


            }
        });


    }
}
