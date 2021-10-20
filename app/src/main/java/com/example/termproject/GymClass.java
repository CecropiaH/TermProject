package com.example.termproject;

import java.util.ArrayList;

public class GymClass {
    String name;
    String description;
    //for digit time on 24 hour clock
        //ex: 1234 == 12:34 pm
    int time;
    int capacity;
    ArrayList<GymMember> members;
    int memberCount;
    Instructor instructor;

    enum Day{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
    enum Difficulty{
        Beginner,
        Intermediate,
        Proficient,
    }

    Difficulty difficulty;
    Day day;
    GymClass(String name, String description){
        this.name = name;
        this.description = description;
        this.time = 0;
        this.capacity = 0;
        this.day = null;
        this.difficulty = null;
        this.members = new ArrayList<GymMember>();
        this.memberCount = 0;
        this.instructor = null;

    }

    public void addMember(GymMember member){
        this.members.add(member);
        this.memberCount += 1;
    }

    public void removeMember(GymMember member){
        this.members.remove(member);
    }


}
