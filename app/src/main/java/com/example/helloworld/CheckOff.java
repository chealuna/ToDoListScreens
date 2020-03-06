package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//System.out.println("Check off task");
////edit task in array
//        System.out.println("All Tasks");
//        System.out.println("------------------");
//        for (Task task: myList){
//        task.printTask();
//        }
//        System.out.println("What task would you like to check off? (choose the task number)");
//        int checkOff = scan.nextInt();
//        for (int i = 0; i < myList.size(); i++){
//        myList.get(i).printTask();
//        if(checkOff == myList.get(i).index){
//        myList.remove(i);
//        }

class CheckOff extends AppCompatActivity {
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



