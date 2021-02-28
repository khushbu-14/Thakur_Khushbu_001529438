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
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory() {
        patientList = new ArrayList<>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addNewPatient(Person person) {
        Patient patient = new Patient();
        patient.setAge(person.getAge());
        patient.setName(person.getName());
        patient.setPatientId(person.getPersonId());
        this.patientList.add(patient);
        return patient;
    }
    
    public Patient searchPatient(String name) {
        for (Patient patient : this.patientList) {
            if (patient.getName().equals(name)) {
                return patient;
            }
        }
        return null;
    }
    
    public Patient searchPatient1(int personId) {
        for (Patient patient : this.patientList) {
            int patientId = patient.getPatientId();
            if (patientId == personId) {
                return patient;
            }
        }
        return null;
    }
}
