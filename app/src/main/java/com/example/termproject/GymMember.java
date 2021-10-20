package com.example.termproject;

import java.util.ArrayList;

public class GymMember extends User{

    ArrayList<GymClass> classesTaking;


    public GymMember(String username, String password,  String email) {
        super(username, password, email);
        this.classesTaking = new ArrayList<GymClass>();
    }

    public void joinClass(GymClass addClass){
        if(addClass.memberCount < addClass.capacity){
            this.classesTaking.add(addClass);
            addClass.addMember(this);
        }
    }

    public void leaveClass(GymClass removeClass){
        this.classesTaking.indexOf(removeClass);
        removeClass.removeMember(this);
    }
}
