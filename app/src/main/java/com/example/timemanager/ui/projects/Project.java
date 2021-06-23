package com.example.timemanager.ui.projects;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// implements Parcelable to pass complex data from one activity to another activity
public class Project  {
    public int projId;
    private String projName;
    private String description;
    private double plannedHours;
    private String color;
    //tasks need to be implemented
    private static List<Project> projectList = new ArrayList<>();

//  //insert input with scanner?
//    Scanner input = new Scanner(System.in);
//
//    *//**
//     * constructor needed to create new Project
//     *//*
//    public Project (Scanner input){
//        projName = input.next();
//        description = input.next();
//        // plannedHours = input.next(); scanner works with String
//
//
//    }

    /**
     * constructor that initializes the Project object
     * @param projName
     * @param description
     * @param plannedHours
     * @param color
     */
    public Project (int projId, String projName, String description, double plannedHours, String color){
        this.projId = projId;
        this.projName = projName;
        this.description = description;
        this.plannedHours = plannedHours;
        this.color = color;
    }

//    /**
//     * retrieving project-data
//     * this constructor is invoked by method createFromParcel(Parcel source)
//     * @param in
//     */
//    protected Project(Parcel in) {
//        projName = in.readString();
//        description = in.readString();
//        plannedHours = in.readDouble();
//        color = in.readString();
//    }
//
//    /**
//     * delete after parcel is working
//     */
//    public Project() {
//
//    }

    //GETTER
    public int getProjId() {
        return projId;
    }
    public String getProjName() {
        return projName;
    }
    public String getDescription() {
        return description;
    }
    public double getPlannedHours() {
        return plannedHours;
    }
    public String getColor() {
        return color;
    }
    public static List<Project> getProjectList(){
        return projectList;
    }


}
