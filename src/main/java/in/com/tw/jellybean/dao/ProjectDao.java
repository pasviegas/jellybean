package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.project.Project;

import java.util.List;

public class ProjectDao {
    public void save(Project project){
        System.out.println("Saving...\n " + project.toString());
    }

    public void save(List<Project> projects) {
        System.out.println(projects.toArray().toString());
    }
}
