package in.com.tw.jellybean.models;

import in.com.tw.jellybean.models.project.Project;

public class Slot {
    private Role role;
    private boolean vacant;
    private Project project;


    public Slot(Role role, Project project) {
        this.role = role;
        this.project = project;
    }

    public Role getRole() {
        return role;
    }

    public Project getProject() {
        return project;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }
}
