package com.example.joinz.db_assign;

import android.arch.persistence.room.Update;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateUsers extends AppCompatActivity {

    EditText id;
    EditText name;
    EditText email;
    Button update;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_users);

        id=(EditText) findViewById(R.id.editText4);
        name=(EditText) findViewById(R.id.editText5);
        email=(EditText) findViewById(R.id.editText6);
        update=(Button) findViewById(R.id.button7);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int uid=Integer.parseInt(id.getText().toString());
                String uname=name.getText().toString();
                String uemail=email.getText().toString();

                User u=new User();
                u.setId(uid);
                u.setName(uname);
                u.setEmail(uemail);

                MainActivity.myDb.myDao().update(u);

                try {
                    MainActivity.myDb.myDao().update(u);
                    Toast.makeText(UpdateUsers.this,"Updated successfully! ",Toast.LENGTH_LONG).show();

                }catch (Exception e){
                    Toast.makeText(UpdateUsers.this,"ERROR ! ",Toast.LENGTH_LONG).show();
                }
                id.setText("");
                name.setText("");
                email.setText("");


            }
        });



    }
}
