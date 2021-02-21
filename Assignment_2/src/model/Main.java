package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author khushbu
 */
public class Main {

//    Patient patient;
//    VitalSigns vitalSigns;
//    VitalSignHistory history;
    static PatientList patientList = new PatientList();
    static Patient patient;

    static String booleanRegex = "(yes)|(no)+";
    static Pattern p = Pattern.compile(booleanRegex, Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        getPatientInput();

//        Patient patient = new Patient();
//        VitalSignHistory history = new VitalSignHistory();
//        VitalSignHistory history;
//        userData.close();
    }

    private static void getPatientInput() {
        String name;
        int age;

        Boolean isNewBornOrInfant;
        String isBooleanStr;
        double respiratoryRate;
        double heartRate;
        double bloodPressure;
        double weightInKilos;
        double weightInPounds;
        Date captureTime;

        Boolean isNormal;

        String result;

        Scanner userData = new Scanner(System.in);

        printInConsole("Name");

        while (!userData.hasNext()) {
            System.out.println("That's not a correct answer! Enter valid name.");
            userData.next();
        }

        name = userData.next();

        patient = patientList.getPatient(name);

        if (patient == null) {
            patient = patientList.addNewPatient();

            printStatements("Are you newborn or infant (Age : 0-12 months)? Enter YES or NO.");

            while (!userData.hasNext(p)) {
                System.out.println("That's not a correct answer! Enter YES or NO.");
                userData.next();
            }

            isBooleanStr = userData.next(p).trim().toUpperCase();

            if (isBooleanStr.contains("YES")) {
                printInConsole("Age in months");
                isNewBornOrInfant = true;
            } else {
                printInConsole("Age in years");
                isNewBornOrInfant = false;
            }

            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid age! Only numbers allowed.");
                userData.next();
            }

            age = userData.nextInt();
            
        }else{
            age = patient.getAge();
            isNewBornOrInfant = patient.getIsNewBornOrInfant();
        }
        
        printInConsole("Respiratory Rate");

        while (!userData.hasNextDouble()) {
            System.out.println("That's not a valid Respiratory Rate! Only numbers allowed.");
            userData.next();
        }

        respiratoryRate = userData.nextDouble();

        printInConsole("Heart Rate");

        while (!userData.hasNextDouble()) {
            System.out.println("That's not a valid Heart Rate! Only numbers allowed.");
            userData.next();
        }
        heartRate = userData.nextDouble();

        printInConsole("Blood Pressure");

        while (!userData.hasNextDouble()) {
            System.out.println("That's not a valid Blood Pressure! Only numbers allowed.");
            userData.next();
        }

        bloodPressure = userData.nextDouble();

        printInConsole("Weight in (KGS)");

        while (!userData.hasNextDouble()) {
            System.out.println("That's not a valid Weight in (KGS)! Only numbers allowed.");
            userData.next();
        }

        weightInKilos = userData.nextDouble();

        weightInPounds = weightInKilos * 2.20462;

        printStatements("Your weight in pounds is : " + weightInPounds);

        isNormal = patient.isPatientNormal(age, respiratoryRate,
                heartRate, bloodPressure, weightInKilos,
                weightInPounds, isNewBornOrInfant);

        result = name + " you are ";

        if (isNormal) {
            result += "normal";
        } else {
            result += "not normal. Please consult doctor.";
        }

        captureTime = new Date();

        patient.setName(name);
        patient.setAge(age);
        patient.setIsNewBornOrInfant(isNewBornOrInfant);

        patient.currentVitalSign.setCaptureTime(captureTime);

        patient.currentVitalSign.setBloodPressure(bloodPressure);
        patient.currentVitalSign.setHeartRate(heartRate);
        patient.currentVitalSign.setRespiratoryRate(respiratoryRate);
        patient.currentVitalSign.setWeightInKilos(weightInKilos);
        patient.currentVitalSign.setWeightInPounds(weightInPounds);
        patient.currentVitalSign.setIsNormal(isNormal);

        VitalSigns vitalSigns = patient.vitalSignHistory.addNewVitals();

        vitalSigns.setBloodPressure(bloodPressure);
        vitalSigns.setHeartRate(heartRate);
        vitalSigns.setRespiratoryRate(respiratoryRate);
        vitalSigns.setWeightInKilos(weightInKilos);
        vitalSigns.setWeightInPounds(weightInPounds);
        vitalSigns.setCaptureTime(captureTime);
        vitalSigns.setIsNormal(isNormal);

        printStatements(result);
        ArrayList<VitalSigns> currentHistory = patient.vitalSignHistory.getHistory();

        for (int i = 0; i < currentHistory.size(); i++) {
            printStatements("------------ vital Signs " + (i + 1) + " ------------");
            printStatements("Vitals of : " + name + " for time : " + currentHistory.get(i).getCaptureTime());

            printStatements(currentHistory.get(i).getBloodPressure() + " Blood Pressue");
//            System.out.println(currentHistory.get(i).getCaptureTime() + " Capture Time");
            printStatements(currentHistory.get(i).getHeartRate() + " Heart Rate");
            printStatements(currentHistory.get(i).getRespiratoryRate() + " Respiratory Rate");
            printStatements(currentHistory.get(i).getWeightInKilos() + " Weight (Kgs)");
            printStatements(currentHistory.get(i).getWeightInPounds() + " Weight (Pounds)");
            printStatements(currentHistory.get(i).getIsNormal() == true ? "This record is normal." : "This record in not normal.");
        }
        
        printStatements("Respiratory Rate is : " + patient.isThisVitalSignNormal("Respiratory Rate"));
        
        printStatements("Heart Rate is : " + patient.isThisVitalSignNormal("Heart Rate"));
        
        printStatements("Heart Rate1 is : " + patient.isThisVitalSignNormal("Heart Rate1"));
        
        printStatements("Heart is : " + patient.isThisVitalSignNormal("Heart"));

        repeatPatientInput(userData);
    }

    private static void repeatPatientInput(Scanner userData) {

        /* printStatements("Do you want to input new vital signs for? " + patient.getName() + "? Enter Yes or No!");

        while (!userData.hasNext(p)) {
            System.out.println("That's not a correct answer! Enter YES or NO.");
            userData.next();
        }
        String shouldContinue = userData.next(p).trim().toUpperCase();

        if (shouldContinue.contains("YES")) {

        } else {
            printStatements("Do you want enter vital signs for new or existing patient? Enter Yes or No!");

            while (!userData.hasNext(p)) {
                System.out.println("That's not a correct answer! Enter YES or NO.");
                userData.next();
            }
        } */
        printStatements("Do you want to enter vital signs for new or existing patient? Enter Yes or No!");

        while (!userData.hasNext(p)) {
            System.out.println("That's not a correct answer! Enter YES or NO.");
            userData.next();
        }

        String shouldContinue = userData.next(p).trim().toUpperCase();

        if (shouldContinue.contains("YES")) {
            getPatientInput();
        } else {
            userData.close();
        }
    }

    private static void printInConsole(String val) {
        System.out.println("Please enter your " + val);
    }

    private static void printStatements(String val) {
        System.out.println(val);
    }
}
