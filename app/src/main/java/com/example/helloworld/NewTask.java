package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

String setName;
String setCategory;
String setPriority;
Int setDate;

//System.out.println("Add a new task");
//        System.out.println("------------------");
//        System.out.println("What do you need to complete? (ex. Clean Room): ");
//        String description = scan.nextLine();
//        System.out.println("Enter the day it is due (ex. 12): ");
//        int due = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Enter your task category (Work or Personal): ");
//        String category = scan.nextLine();
//        System.out.println("What is your task priority?");
//        System.out.println("    1. Urgent");
//        System.out.println("    2. In Progress");
//        System.out.println("    3. Done");
//        int progress = scan.nextInt();
//        String priority;
//        if(progress==1){
//        priority="Urgent";
//        } else if(progress==2){
//        priority="In Progress";
//        } else if (progress==3){
//        priority="Done";
//        } else {
//        priority = "Not Specified";
//        }
//
//        count ++;
//        Task myTask = new Task(description, due, priority);
//        // add task to list
//        myList.add(myTask);
//        //add task to file
//        FileWriter fw = new FileWriter("MasterToDoList.txt", true);
//        BufferedWriter writer = new BufferedWriter(fw);
//        String line = myTask.printTaskForFile();
//        writer.write(line);
//        writer.newLine();
//        writer.close();

public class NewTask {

    class NewTask extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.screen2);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            FloatingActionButton fab = findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
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

        //name of task
        public static void setName(Context context, String name) {
            SharedPreferences prefs = context.getSharedPreferences("myAppPackage", 0);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("name", name);
            editor.commit();
        }

        //category
        public static void setCategory(Context context, String category) {
            SharedPreferences prefs = context.getSharedPreferences("myAppPackage", 0);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("category", category);
            editor.commit();
        }

        //priority
        public static void setPriority(Context context, String priority) {
            SharedPreferences prefs = context.getSharedPreferences("myAppPackage", 0);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("priority", priority);
            editor.commit();
        }

        //date
        public static void setDate(Context context, String date) {
            SharedPreferences prefs = context.getSharedPreferences("myAppPackage", 0);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("date", date);
            editor.commit();
        }
    }

}