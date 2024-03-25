package edu.ntudp.fit.polizhak.controller;

import edu.ntudp.fit.polizhak.model.Faculty;
import edu.ntudp.fit.polizhak.model.Human;

public class FacultyCreator  {
    private Faculty faculty;
    private DepartmentCreator department;

    public DepartmentCreator getDepartmentInstance() {
        return department;
    }

    public void setDepartmentInstance(DepartmentCreator department) {
        this.department = department;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    private void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public FacultyCreator(DepartmentCreator department, String name, Human head) {
        Faculty faculty = new Faculty();
        setFaculty(faculty);
        faculty.setName(name);
        faculty.setHead(head);
        setDepartmentInstance(department);
    }
}
