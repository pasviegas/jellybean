package com.tw.jellybean.dao;

import com.tw.jellybean.model.Project;

import java.util.List;

public class ProjectDao {
    public void save(Project project){
        System.out.println("Saving...\n " + project.toString());
    }

    public void save(List<Project> projects) {
        System.out.println(projects.toArray().toString());
    }
}
