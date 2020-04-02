package com.example.helloworld;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
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
    saveButton.setOnClickListener(new View.OnClickListener()){
        @Override
        public void onClick(View view) {
            final EditText name = name.findViewById(R.id.editText);
            name.getText().toString();
            final EditText priority = (EditTask) findViewById(R.id.priority_input);
            priority.getText().toString();
            final EditText  date= (EditTask) findViewById(R.id.date_input);
            date.getText().toString();
        }
//        Checkbox urgent = findViewById(R.id.urgent);
//        If (urgent.isChecked) {
//            String taskPriority = "urgent";
//        }
//
//        DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker1);
//        int day = datePicker.getDayOfMonth();
//        int month = datePicker.getMonth() +1;
//        int year = datePicker.getYear();
//        dateForTask= (String) day + month + year;
//            Task newTask = Task.createTask(name, dateForTask);
//
//
//
    }
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
    }
}