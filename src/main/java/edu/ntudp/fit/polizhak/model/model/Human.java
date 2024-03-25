package edu.ntudp.fit.polizhak.model.model;

import java.util.HashMap;

public class Human {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex sex;

    public String getFullName() {
        return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Human(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    public Human() {
    }

    @Override
    public String toString() {
        HashMap<String, HashMap<String, String>> human = new HashMap<>();
        HashMap<String, String> humanData = new HashMap<>();
        humanData.put("firstName", this.getFirstName());
        humanData.put("lastName", this.getLastName());
        humanData.put("middleName", this.getMiddleName());
        humanData.put("sex", this.getSex().toString());
        human.put(this.getFullName(), humanData);
        return human.toString();
    }
}
