/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author khushbu
 */
public class Person {

    private String name;
    private int age;
    private String profession;
    private Boolean isNewBornOrInfant;
    private int personId;
    private static int count = 0;
    private String personAgeGroup;
    Residence residence;

    private HashSet<String> ageGroups = new HashSet<>();

//    public Person(String name) {
//        this.name = name;
//    }
    public Person() {
        count++;
        personId = count;
        residence = new Residence();
        ageGroups.add("NEWBORN");
        ageGroups.add("INFANT");
        ageGroups.add("TODDLER");
        ageGroups.add("PRE-SCHOOLER");
        ageGroups.add("SCHOOL-AGE");
        ageGroups.add("ADOLSCENT");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Boolean getIsNewBornOrInfant() {
        return isNewBornOrInfant;
    }

    public void setIsNewBornOrInfant(Boolean isNewBornOrInfant) {
        this.isNewBornOrInfant = isNewBornOrInfant;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public HashSet<String> getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(HashSet<String> ageGroups) {
        this.ageGroups = ageGroups;
    }

    public String getPersonAgeGroup() {
        return personAgeGroup;
    }

    public void setPersonAgeGroup(String personAgeGroup) {
        this.personAgeGroup = personAgeGroup;
    }

    public String getPersonType(int userAge, Boolean isUserNewBornOrInfant) {
        String personType = null;

        if (isUserNewBornOrInfant) {
            if (userAge <= 12) {
                personType = "NEWBORN";
            } else {
                personType = "INFANT";
            }
        } else {
            if (userAge > 1 && userAge <= 3) {
                personType = "TODDLER";
            } else if (userAge > 3 && userAge <= 5) {
                personType = "PRE-SCHOOLER";
            } else if (userAge > 5 && userAge <= 12) {
                personType = "SCHOOL-AGE";
            } else if (userAge > 12) {
                personType = "ADOLSCENT";
            } else {
                personType = "TODDLER";
                System.out.println("You have entered wrong age! We are assigning you to TODDLER age group!");
            }
        }

        return personType;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        return String.format("Name: " + name + " Age: " + age + " Profession: " + profession + " Age Group : " + personAgeGroup);
    }
}
