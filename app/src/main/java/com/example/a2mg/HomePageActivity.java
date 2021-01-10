package com.example.a2mg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {
    private Button add;
    private Button contact;
    private Button notifications;
    private Button settings;
    private Button feelings;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = (Button)findViewById(R.id.btnAddPrescription);
        contact = (Button)findViewById(R.id.btnContact);
        notifications = (Button)findViewById(R.id.btnNotifications);
        settings = (Button)findViewById(R.id.btnSettings);
        feelings = (Button)findViewById(R.id.btnFeeling);


        //add button click listeners


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, AddActivity.class); //intent to go from one activity to another
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, ContactActivity.class); //intent to go from one activity to another
                startActivity(intent);
            }
        });

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, NotificationsActivity.class); //intent to go from one activity to another
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, SettingsActivity.class); //intent to go from one activity to another
                startActivity(intent);
            }
        });

        feelings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, FeelingsActivity.class); //intent to go from one activity to another
                startActivity(intent);
            }
        });

    }
}