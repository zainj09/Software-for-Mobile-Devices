package com.example.joinz.db_assign;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button read;
    Button write;
    Button update;
    Button delete;


    public static MyDatabase myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        read=(Button) findViewById(R.id.button);
        write=(Button) findViewById(R.id.button2);
        update=(Button) findViewById(R.id.button3);
        delete=(Button) findViewById(R.id.button4);


        myDb= Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userdb").allowMainThreadQueries().fallbackToDestructiveMigration().build();


        //////////////////////////////////////////database write
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addUser= new Intent(MainActivity.this,AddUser.class);
                startActivity(addUser);
            }
        });

        /////////////////////////////////////////database read
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent readUser= new Intent(MainActivity.this,ReadUsers.class);
                startActivity(readUser);
            }

        });

        ////////////////////////////////////database update
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent updateUser= new Intent(MainActivity.this,UpdateUsers.class);
                startActivity(updateUser);
            }
        });

        ////////////////////////////////////database delete
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent deleteUser= new Intent(MainActivity.this,DeleteUsers.class);
                startActivity(deleteUser);
            }
        });



    }



}
