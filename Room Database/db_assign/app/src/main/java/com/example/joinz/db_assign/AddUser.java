package com.example.joinz.db_assign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUser extends AppCompatActivity {
    EditText name;
    EditText email;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        name=(EditText) findViewById(R.id.editText);
        email=(EditText) findViewById(R.id.editText2);
        add=(Button) findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname= name.getText().toString();
                String uemail= email.getText().toString();

                User u= new User();
                u.setEmail(uemail);
                u.setName(uname);



                try {
                    MainActivity.myDb.myDao().addUser(u);

                    Toast.makeText(AddUser.this, "User " + uname + " added ! ", Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(AddUser.this, "ERROR ! ", Toast.LENGTH_LONG).show();
                }
                
                name.setText("");
                email.setText("");
            }
        });



    }
}
