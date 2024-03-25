package edu.ntudp.fit.polizhak.model.controller;

import edu.ntudp.fit.polizhak.model.model.Faculty;
import edu.ntudp.fit.polizhak.model.model.Human;

public class FacultyCreator  {
    private DepartmentCreator department;

    public DepartmentCreator getDepartmentInstance() {
        return department;
    }

    public void setDepartmentInstance(DepartmentCreator department) {
        this.department = department;
    }

    private void setFaculty(Faculty ignoredFaculty) {
    }

    public FacultyCreator(DepartmentCreator department, String name, Human head) {
        Faculty faculty = new Faculty();
        setFaculty(faculty);
        faculty.setName(name);
        faculty.setHead(head);
        setDepartmentInstance(department);
    }
}
