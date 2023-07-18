package org.javaexample.ObjectClass;

public class OverrideCloneMethod {
    public static void main(String[] args) {
        try {
            PersonalInfo p1 = new PersonalInfo("cha", 20, "ssu", "sw");
            PersonalInfo p2 = p1.clone();
            p2.showPersonalInfo();
            p2.showPersonalInfo();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
    }
}

class Business implements Cloneable {
    private String company;
    private String work;

    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo() {
        System.out.println(company);
        System.out.println(work);
    }
}

class PersonalInfo implements Cloneable {
    private String name;
    private int age;
    private Business bz;

    public PersonalInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        this.bz = new Business(company, work);
    }

    public void showPersonalInfo() {
        System.out.println(name);
        System.out.println(age);
        bz.showBusinessInfo();
    }

    @Override
    public PersonalInfo clone() throws CloneNotSupportedException {
        return (PersonalInfo) super.clone();
    }
}

















