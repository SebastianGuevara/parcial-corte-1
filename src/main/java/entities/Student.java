package entities;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    private int code;
    private String name;
    private String lastName;
    private String email;

    private List<Course> approved = new ArrayList<>();
}
