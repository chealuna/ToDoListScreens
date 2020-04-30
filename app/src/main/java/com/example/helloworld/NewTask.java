package com.example.helloworld;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

//imports for Method #1
import java.util.Scanner;

public class NewTask {

    Button saveButton = findViewById(R.id.button2);
    saveButton.setOnClickListener(new View.OnClickListener()){
        @Override
        public void onClick(View view) {

           //name
            final EditText name = name.findViewById(R.id.editText);
            name.getText().toString();

            //priority
            CheckBox urgent = findViewById(R.id.checkBoxUrgent);
            If (urgent.isChecked) {
                String taskPriority = “urgent”;
            }

            //date
            DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker1);
            int day = datePicker.getDayOfMonth();
            int month = datePicker.getMonth() + 1;
            int year = datePicker.getYear();
            dateForTask = (String)  day + month + year;
        }





           //POSSIBLE CREATE TASK FROM USER INPUT METHODS

            // #1
            public class TestFile {
                public static void main(String[] args) throws IOException {
                    Scanner input = new Scanner(System.in);
//                    System.out.print("Enter the desired name of your task: ");
                    String taskName = input.nextLine();
                    taskName = taskName + ".txt";

                    Task file = new Task(taskName);
                    task.createNewFile();
                }
            }

            //#2
        Checkbox urgent = findViewById(R.id.urgent);
        If (urgent.isChecked) {
            String taskPriority = "urgent";
        }

        Checkbox inProgress = findViewById(R.id.inProgress);
        If (urgent.isChecked) {
            String taskPriority = "inProgress";
        }

        Checkbox done = findViewById(R.id.done);
        If (urgent.isChecked) {
            String taskPriority = "done";
        }


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