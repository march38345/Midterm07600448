package com.example.midterm07600448;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    EditText user,pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        setid();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String inputuser = user.getText().toString();
                String inputpass = pass.getText().toString();
                Model model = new Model(inputuser,inputpass);
                if(model.sheck()==1){
                    Intent intent = new Intent(Login_Activity.this,Profile_Activity.class);
                    intent.putExtra("key",R.string.chaitawat);
                    startActivity(intent);


                }
               else if(model.sheck()==2){
                    Intent intent = new Intent(Login_Activity.this,Profile_Activity.class);
                    intent.putExtra("key",R.string.Prom);
                    startActivity(intent);
                }
               else{
                    Toast toast = Toast.makeText(Login_Activity.this,"Invalid username or password",Toast.LENGTH_SHORT);
                            toast.show();

                }
            }
        });
    }
    void setid(){
         user = findViewById(R.id.iduser);
         pass = findViewById(R.id.idpass);
         login = findViewById(R.id.button_Login);



    }
}
