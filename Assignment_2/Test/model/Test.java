/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author khushbu
 */
public class Test {

    static Patient patient;
    static PatientList patientList = new PatientList();

    public static void main(String[] args) {

        /*
            int age,                                 
            double respiratoryRate,                                
            double heartRate,                                
            double bloodPressure,                                
            double weightInKilos,                      
            double weightInPounds,                                
            Boolean isNewBornOrInfant        
         */
        
        patient = patientList.addNewPatient();
        
        System.out.println("A patient with below conditions, should be normal");
        Boolean patientNormal = patient.isPatientNormal(0, 30, 159.9, 60, 2, 3, Boolean.TRUE);
        System.out.println("patientNormal : " + patientNormal);
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("A patient with below conditions, should not be normal");
        System.out.println("patientNormal : " + patient.isPatientNormal(3, 30.01, 70, 80, 2, 3, Boolean.FALSE));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("A patient with below conditions, should be normal");
        System.out.println("patientNormal : " + patient.isPatientNormal(3, 20.01, 130, 80, 14, 3, Boolean.FALSE));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        
        System.out.println("Checking for vital signs");
        System.out.println("is vital sign 'resPiRatoRy Rate' exits? : " + patient.isThisVitalSignNormal("resPiRatoRy Rate"));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("is vital sign 'heart' exits? : " + patient.isThisVitalSignNormal("heart"));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("is vital sign 'HEART Rate' exits? : " + patient.isThisVitalSignNormal("HEART Rate"));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("is vital sign 'pressure' exits? : " + patient.isThisVitalSignNormal("pressure"));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("is vital sign 'blood pressure' exits? : " + patient.isThisVitalSignNormal("blood pressure"));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("is vital sign 'WeIGHT' exits? : " + patient.isThisVitalSignNormal("WeIGHT"));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.println("is vital sign 'weight kg' exits? : " + patient.isThisVitalSignNormal("weight kg"));
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
