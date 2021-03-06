package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private LocalDate systemDate = LocalDate.now();

    private String name;
    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;

    private Student leader;
    private List<Student> members = new ArrayList<>();
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * Evaluate if a project is active.
     *
     * @return false if the project has not open activities or the dateEnd is before than the system date.
     */
    public boolean isActive()
    {
        boolean result = true;
        for (Iteration i:this.iterations)
        {
            if (i.countOpenActivities()==0||this.dateEnd.isBefore(this.systemDate))
            {
                result=false;
            }

        }
        return result;
    }


}
