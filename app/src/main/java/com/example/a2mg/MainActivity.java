package com.example.a2mg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //message sent out to certify that firebase connection is successful
        Toast.makeText(MainActivity.this, "Firebase connection was successful", Toast.LENGTH_LONG).show();

        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() { // listener for button clikc
        //Info.setText("Number of attempts remaining :5");


            @Override
            public void onClick(View v) {
                validate (Username.getText().toString(),Password.getText().toString());
            }
        });
    }







    private void validate(String userName, String userPassword){
        //example for required password or username
        if (userName.equals("Admin")  && userPassword.equals("1234")){
            Intent intent = new Intent(MainActivity.this, HomePageActivity.class); //intent to go from one activity to another
            startActivity(intent);
//        }else {
            //counter--;
            //Info.setText("Number of attempts remaining: " + String.valueOf(counter));
//            Login.setEnabled(false);
           // if (counter==0){ // when there has been too many
               // Login.setEnabled(false);
           // }
        }
    }
}