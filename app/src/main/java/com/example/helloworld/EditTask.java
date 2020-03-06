package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//System.out.println("Change date for task");
//        for (Task task: myList){
//        task.printTask();
//        }
//        System.out.println("What task would you like to edit? (choose the number) ");
//        int editDate = scan.nextInt();
//        System.out.println("Please type in your new date");
//        int nDate = scan.nextInt();
//        for (int i = 0; i < myList.size(); i++){
//        if(editDate == myList.get(i).index){
//        myList.get(i).date = nDate;
//        myList.get(i).printTask();
//        }
//
//        System.out.println("Create New To-Do List");
//        System.out.println("Please enter your to do list name.");
//        //createTaskListFromFile();
//        String fileName = scan.nextLine();
//        try {
//        out = new FileOutputStream(fileName + ".txt");
//        out.write((fileName + " To Do List\n").getBytes());
//        out.write("----------------------------".getBytes());
//        } catch (IOException x){
//        System.out.println(x);
//        }

class EditTask extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
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



