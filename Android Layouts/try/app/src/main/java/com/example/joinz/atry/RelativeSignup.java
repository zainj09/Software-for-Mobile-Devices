package com.example.joinz.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RelativeSignup extends AppCompatActivity {
    public EditText email;
    public EditText password;
    public RadioGroup gender;
    public RadioButton rb;
    public CheckBox terms;
    public Button regiser;

    public String e;
    public boolean check;
    public int g;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_relative);

        email=(EditText)findViewById(R.id.editText2);

        password=(EditText)findViewById(R.id.editText3);

        gender=(RadioGroup)findViewById(R.id.gender);

        terms=(CheckBox)findViewById(R.id.checkBox);


        regiser=(Button)findViewById(R.id.button);
        regiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e= email.getText().toString();
                g=gender.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(g);
                if(terms.isChecked()) {
                    Toast.makeText(RelativeSignup.this, "you have entered \nemail :" + e + ",\ngender : " + rb.getText() +"\nyou have agreed to the terms and conditions", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RelativeSignup.this, "you have entered \nemail :" + e + ",\ngender : " + rb.getText() +"\nplease accept the terms and conditions before registering !", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}
