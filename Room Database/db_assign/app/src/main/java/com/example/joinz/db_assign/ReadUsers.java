package com.example.joinz.db_assign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ReadUsers extends AppCompatActivity {

    ListView userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_users);
        userList=(ListView) findViewById(R.id.user_list);


        ArrayList<String> show=new ArrayList<String>();


        List<User> users1 = MainActivity.myDb.myDao().getUsers();

        for(User usr : users1){

            int id=usr.getId();
            String name=usr.getName();
            String email=usr.getEmail();

            String row= "\n id= "+id+" \n name: "+name+"\n email: "+email+"\n";


            show.add(row);



        }


        ArrayAdapter<String> showList= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,show);
        userList.setAdapter(showList);




    }
}
