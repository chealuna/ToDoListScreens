package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//System.out.println("    8. View By Priority");
//        System.out.println("------------------");
//        ArrayList<Task> priorityList = new ArrayList<Task>();
//        for(Task t: myList){
//        if(t.getPriority().equals("Urgent")){
//        priorityList.add(t);
//        }
//        }
//        for(Task t: myList){
//        if(t.getPriority().equals("In Progress")){
//        priorityList.add(t);
//        }
//        }
//        for(Task t: myList){
//        if(t.getPriority().equals("Done")){
//        priorityList.add(t);
//        }
//        }
//        for (Task task: priorityList){
//        task.printTask();
//        }
//        }
//        else {
//        System.out.println("Invalid choice, try again.");


public class ViewPriority extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.view_priority);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

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
