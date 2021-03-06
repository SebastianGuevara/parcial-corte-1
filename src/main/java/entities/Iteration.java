package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;

    private Project project;
    private List<Activity> activities;



    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    /**
     * Añade actividades a la lista
     * @param activity
     */
    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    /**
     * Cuenta las actividades abiertas
     * @return el número de actividades abiertas
     */
    public int countOpenActivities()
    {
        int count=0;
        for (Activity a:this.activities)
        {
            if (a.isActive())
            {
                count++;
            }
        }
        return count;
    }
    /**
     * Cuenta las actividades cerradas
     * @return el número de actividades cerradas
     */
    public int countClosedActivities()
    {
        int count=0;
        for (Activity a:this.activities)
        {
            if (!a.isActive())
            {
                count++;
            }
        }
        return count;
    }

}
