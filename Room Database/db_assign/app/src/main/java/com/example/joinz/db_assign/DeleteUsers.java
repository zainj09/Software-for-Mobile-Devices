package com.example.joinz.db_assign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteUsers extends AppCompatActivity {

    EditText id;
    Button dlt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_users);

        id=(EditText) findViewById(R.id.editText3);
        dlt=(Button) findViewById(R.id.button6);



        dlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int uid=Integer.parseInt(id.getText().toString());
                User u=new User();
                u.setId(uid);
                try {
                    MainActivity.myDb.myDao().delete(u);
                    Toast.makeText(DeleteUsers.this,"deleted successfully! ",Toast.LENGTH_LONG).show();
                    id.setText("");
                }catch (Exception e){
                    Toast.makeText(DeleteUsers.this,"ERROR ! ",Toast.LENGTH_LONG).show();
                }


            }
        });

    }




}
