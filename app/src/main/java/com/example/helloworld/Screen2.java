package com.example.helloworld;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
class Screen2 extends AppCompatActivity {
    Button specificList;
    Button checkOff;
    Button viewPriority;
    Button editTask;
    Button newList;
    Button newTask;
    Button allTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //2 get corresponding xml button
        specificList = findViewById(R.id.viewspecificlistbutton);
        //3 add event listener
        specificList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,SpecificList.class);
                startActivity(intent);
            }
        });

        checkOff = findViewById(R.id.checkofftaskbutton);
        checkOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,CheckOff.class);
                startActivity(intent);
            }
        });

        viewPriority = findViewById(R.id.viewbyprioritybutton);
        viewPriority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,ViewPriority.class);
                startActivity(intent);
            }
        });

        editTask = findViewById(R.id.edittaskbutton);
        editTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,EditTask.class);
                startActivity(intent);
            }
        });

        newList = findViewById(R.id.createnewlistbutton);
        newList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,NewList.class);
                startActivity(intent);
            }
        });

        newTask = findViewById(R.id.addnewtaskbutton);
        newTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,NewTask.class);
                startActivity(intent);
            }
        });

        allTasks = findViewById(R.id.viewalltasksbutton);
        allTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2.this,AllTasks.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}