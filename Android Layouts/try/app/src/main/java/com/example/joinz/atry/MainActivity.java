package com.example.joinz.atry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button relative;
    public Button constraint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //////////////////////////relative////////////////////
        relative=(Button)findViewById(R.id.button4);

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent invokeRelative = new Intent(MainActivity.this,RelativeSignup.class);
                startActivity(invokeRelative);

            }
        });

        //////////////////////////relative////////////////////
        constraint=(Button)findViewById(R.id.button5);
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent invokeConstraint = new Intent(MainActivity.this,ConstraintSignup.class);
                startActivity(invokeConstraint);
            }
        });
    }
}
