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
public class PatientList {

    ArrayList<Patient> patientList;

    public PatientList() {
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addNewPatient() {
        Patient patient = new Patient();
        this.patientList.add(patient);
        return patient;
    }

    public Patient getPatient(String name) {
//        if(this.patientList.size() == 0) return null;

        for (Patient patient : this.patientList) {
            if (patient.getName().equals(name.toUpperCase())) {
                return patient;
            }
        }
        return null;
    }
}
