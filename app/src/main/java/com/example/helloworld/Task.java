package com.example.helloworld;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Task implements Serializable {
    //instance variables
    @PrimaryKey(autoGenerate = true)
    int index;

    @ColumnInfo(name = "task")
    String task;

    @ColumnInfo(name = "date")
    int date;

    @ColumnInfo(name = "isDone")
    boolean isDone = false;

    @ColumnInfo(name = "tag")
    String tag;
    String category;
    String priority;


    public static void main(String[] args) {
    }
    //constructor
    public Task() {
        task = "default task";
        date = 0;
        isDone = false;
        tag = "all";
        index = 0;
        priority = "Urgent";
    }
    public Task(String t, int d, String pri){
        task = t;
        date = d;
        priority = pri;
    }
    public String getPriority(){
        return priority;
    }
    //methods
    public void checkDone(){
        isDone = true;
    }
    public String printTask(){
//        System.out.println(index + "    task name: " + task + "     it is due the " + date + "  of this month" + "\t"  + "In Progress? : " + isDone);
//        return "task name: " + task + "     it is due the " + date + "  of this month" + "\t"  + "In Progress? : " + isDone;
        System.out.println(index + " " + task + "       it is due the " + date +  "\t"  + "  Priority: "  + priority);
        return index + " " + task + "       it is due the " + date +  "\t"  + "  Priority:  "  + priority;
    }
    public void editTask(String newTask){
        task = newTask;
    }
    public void editDate(int newDate){
        date = newDate;
    }
    public void editCategory(String newCategory){
        category = newCategory;
    }
    public String printTaskForFile(){
        return "Hello";
    }
}

