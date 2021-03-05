package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private int id;
    private LocalDate createdAt;
    private String area;

    private Student leader;
    private List<Student> members = new ArrayList<>();
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    public int countActiveProjects()
    {
        int count = 0;
        for (Project p : this.projects)
        {
            if (p.isActive())
            {
                count++;
            }

        }
        return count;
    }

}
