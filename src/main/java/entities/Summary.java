package entities;

import java.time.LocalDate;

public class Summary {

    private int activeProjects;
    private LocalDate date;
    private int openActivities;
    private int closedActivities;

    public Summary(int activeP, LocalDate ld)
    {
        this.activeProjects = activeP;
        this.date = ld;
    }
    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}
