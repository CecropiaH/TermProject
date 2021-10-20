package com.example.termproject;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin extends User{
    //for the admin the username and passwords are preset
    final String username = "admin";
    final String password = "admin123";
    public Admin(String username, String password, String email){
        super(username, password, email);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(User this);
    }

    public void createClass(String name, String descrption){
        GymClass newClass = new GymClass(name, descrption);
    }

    public void deleteClass(){

    }

    public void editClassName(GymClass editClass, String name){
        editClass.name = name;
    }

    public void editClassDescription(GymClass editClass, String description){
        editClass.name = description;
    }

    public void deleteAccounts(){

    }
}
