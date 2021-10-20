package com.example.termproject;

public class User {
    //public class user defines the mechanisms usable by the gym members, admins, and instructors

    //has a username and password
    private String username;
    private String password;
    private String email;

    enum accountType{
        Admin,
        Instructor,
        GymMember
    }
    private accountType type;

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = null;
        switch (this.getClass().toString()){
            case "Admin":
                this.type = accountType.Admin;
                break;
            case "Instructor":
                this.type = accountType.Instructor;
                break;
            case "GymMember":
                type = accountType.GymMember;
                break;
        }

    }

}
