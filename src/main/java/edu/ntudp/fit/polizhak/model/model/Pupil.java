package edu.ntudp.fit.polizhak.model.model;

public abstract class Pupil implements IPupil {

    private String name;
    private Human head;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Human getHead() {
        return head;
    }


    public void setHead(Human head) {
        this.head = head;
    }
}
