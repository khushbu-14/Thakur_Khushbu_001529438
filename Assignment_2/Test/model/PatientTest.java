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
public class PatientTest {
    
    public static void main(String[] args) {
        testIsPatientNormal();
    }

    public static void testIsPatientNormal() {
        Patient patient = new Patient();

        boolean test1 = patient.isPatientNormal(11, 20,
                70, 80, 20,
                20 * 2.20462, false);

        if (test1 == true) {
            System.out.println("Test case 1 passed. Patient is normal");
        } else {
            System.out.println("Test case 1 failed");
        }

        boolean test2 = patient.isPatientNormal(31, 20, 70, 80, 20, 20 * 2.20462, true);

        if (test2 == false) {
            System.out.println("Test case 2 passed. Patient is not normal");
        } else {
            System.out.println("Test case 2 failed");
        }

    }
}
