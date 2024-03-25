package edu.ntudp.fit.polizhak.model.controller;


import edu.ntudp.fit.polizhak.model.model.Department;
import edu.ntudp.fit.polizhak.model.model.Human;

public class DepartmentCreator  {
    private UniversityCreator university;

    public UniversityCreator getUniversityInstance() {
        return university;
    }

    public void setUniversityInstance(UniversityCreator university) {
        this.university = university;
    }

    private void setDepartment(Department ignoredDepartment) {
    }

    public DepartmentCreator(UniversityCreator university, String departmentName, Human headOfDepartment) {
        Department department = new Department();
        setDepartment(department);
        department.setName(departmentName);
        department.setHead(headOfDepartment);
        setUniversityInstance(university);
    }

}
