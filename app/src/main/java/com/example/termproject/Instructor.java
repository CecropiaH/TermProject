package com.example.termproject;

import java.util.ArrayList;

public class Instructor extends User{

    ArrayList<GymClass> classesTeach;
    public Instructor(String username, String password, String email) {
        super(username, password, email);
        this.classesTeach = new ArrayList<GymClass>();

    }
    public void setTime(GymClass editClass, int time){
        //make sure 4 digits
        if(4 == Integer.toString(time).length()){
            editClass.time = time;
        }
    }
    public void setCapacity(GymClass editClass, int capacity){
        //make sure 4 digits
        if(capacity > 0){
            editClass.capacity = capacity;
        }
    }
    public void setDifficulty(GymClass editClass, GymClass.Difficulty diff){
        editClass.difficulty = diff;
    }
    public void setDay(GymClass editClass, GymClass.Day day){
        editClass.day = day;
    }

    public void teachClass(GymClass addClass){
        this.classesTeach.add(addClass);
        addClass.instructor = this;
    }

    public void cancelClass(GymClass cancelClass){
        cancelClass.capacity = 0;
        cancelClass.day = null;
        cancelClass.difficulty = null;
        cancelClass.time = 0;
    }

}
