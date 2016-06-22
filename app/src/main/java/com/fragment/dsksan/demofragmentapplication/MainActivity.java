package com.fragment.dsksan.demofragmentapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplication(),"In On create method", Toast.LENGTH_LONG).show();
        System.out.println("In Main Activity");
        System.out.println("In Main Activity121212121");
    }
    public void buttonWelcomeClicked(View view)
    {
        Snackbar snackbar=Snackbar.make(view,"Get Back To Activity",Snackbar.LENGTH_LONG).setAction("BACK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                
            }
        });
        snackbar.setActionTextColor(Color.BLUE);
        snackbar.show();
    }
}
