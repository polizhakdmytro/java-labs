package edu.ntudp.fit.polizhak.model.controller;

import edu.ntudp.fit.polizhak.model.model.Human;

public class StudentCreator  {
    private GroupCreator group;
    private Human student;

    public GroupCreator getGroupInstance() {
        return group;
    }

    public void setGroupInstance(GroupCreator group) {
        this.group = group;
    }

    public Human getStudent() {
        return student;
    }

    private void setStudent(Human student) {
        this.student = student;
    }

    public StudentCreator(GroupCreator group, Human student) {
        setStudent(student);
        setGroupInstance(group);
    }
}
