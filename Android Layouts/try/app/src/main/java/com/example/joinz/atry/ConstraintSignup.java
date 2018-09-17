package com.example.joinz.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ConstraintSignup extends AppCompatActivity {

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
        setContentView(R.layout.signup_constraint);

        email=(EditText)findViewById(R.id.editText);

        password=(EditText)findViewById(R.id.editText4);

        gender=(RadioGroup)findViewById(R.id.radioGroup);

        terms=(CheckBox)findViewById(R.id.checkBox2);


        regiser=(Button)findViewById(R.id.button2);
        regiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e= email.getText().toString();
                g=gender.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(g);
                if(terms.isChecked()) {
                    Toast.makeText(ConstraintSignup.this, "you have entered \nemail :" + e + ",\ngender : " + rb.getText(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(ConstraintSignup.this, "please accept the terms and conditions first !", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
