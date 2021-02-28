/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class PersonDirectory {

    ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public Person addNewPerson() {
        Person person = new Person();
        this.personList.add(person);
        return person;
    }

    public Person searchPerson(String name) {
        for (Person person : this.personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
