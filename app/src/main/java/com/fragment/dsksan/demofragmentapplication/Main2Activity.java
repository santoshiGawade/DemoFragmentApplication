package com.fragment.dsksan.demofragmentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    int[] imageArray = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                imageView.setImageResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;

                }
                handler.postDelayed(this, 3000);  //for interval...
            }
        };
        handler.postDelayed(runnable, 2000); //for initial delay..
    }

    public void buttonDisplayClicked(View view) {
        Snackbar snackbar =    Snackbar.make(view, "No internet Connection", Snackbar.LENGTH_LONG)
                .setAction("RETRY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(intent);
                    }
                });

//        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();

        // Changing message text color
       // snackbar.setActionTextColor(Color.RED);
        snackbar.show();
// Changing action button text color
//        View sbView = snackbar.getView();
//        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
//        textView.setTextColor(Color.YELLOW);
//        snackbar.show();
//        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();


    }
}


