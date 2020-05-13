package com.example.helloworld;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

//imports for Method #1
import java.util.Scanner;

public class NewTask extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button saveButton = findViewById(R.id.button2);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //name
                final EditText name = findViewById(R.id.editText);
                name.getText().toString();

                //category
                CheckBox work = findViewById(R.id.checkBoxWork);
                if (work.isChecked()) {
                    String taskCategory = "Work";
                }

                CheckBox personal = findViewById(R.id.checkBoxPersonal);
                if (personal.isChecked()) {
                    String taskCategory = "Personal";
                }

                CheckBox other = findViewById(R.id.checkBoxOther);
                if (other.isChecked()) {
                    String taskCategory = "Other";
                }

                //priority
                CheckBox urgent = findViewById(R.id.checkBoxUrgent);
                if (urgent.isChecked()) {
                    String taskPriority = "urgent";
                }

                CheckBox inProgress = findViewById(R.id.checkBoxInProgress);
                if (inProgress.isChecked()) {
                    String taskPriority = "inProgress";
                }

                CheckBox done = findViewById(R.id.checkBoxDone);
                if (done.isChecked()) {
                    String taskPriority = "done";
                }

                //date
                DatePicker datePicker = findViewById(R.id.calendarView);
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();
                String dateForTask = month + "/" + day + "/" + year;

                //combine all your pieces of information into one task object
                //Task newTask = new Task(name,etc...)

                //Save task in database as in exam app
            }

            class SaveTask extends AsyncTask<Void, Void, Void> {
                @Override
                protected Void doInBackground(Void... voids) {

                    Task task = new Task(name, dateForTask, taskPriority);

                }
            }
        });
    }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            finish();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
        }
        DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                .taskDao()
                .insert(task);
        return null;

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
