package com.example.helloworld;
import java.util.ArrayList;

public class Task {
    public class Task {
        //instance variables
        String task;
        int date;
        boolean isDone = false;
        String tag;
        String category;
        String priority;
        int index;
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
}
