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

//    maintains all patients
    static PatientList patientList = new PatientList();
    static Patient patient;

    //    regex for boolean answers
    static String booleanRegex = "(yes)|(no)+";
    static Pattern p = Pattern.compile(booleanRegex, Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
//        start console
        getPatientInput();
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

        name = userData.nextLine();

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

        } else {
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

        System.out.println("----------------------------------------------------");
        printStatements(result);
        System.out.println("----------------------------------------------------");

        ArrayList<VitalSigns> currentHistory = patient.vitalSignHistory.getHistory();

        /*
            %d -> integer
            %s - string
            %f floating point number

            %-s -> left align
            %-10s -> 10 spaces
         */
        if (currentHistory.size() >= 1) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("|%-5s| %-20s| %-15s| %-18s| %-15s| %-15s| %-35s|", "NO.", "RESPIRATORY RATE", "HEART RATE", "BLOOD PRESSURE", "WEIGHT", "STATUS", "TIME");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }

        for (int i = 0; i < currentHistory.size(); i++) {

//            printStatements("------------ vital Signs " + (i + 1) + " ------------");
//            printStatements("Vitals of : " + name + " for time : " + currentHistory.get(i).getCaptureTime());
//            %2d %5s %5s %5s %5s %7s %5s
            System.out.format("|%-5d| %-20f| %-15f| %-18f| %-15f| %-15s| %-35s|",
                    (i + 1),
                    currentHistory.get(i).getRespiratoryRate(),
                    currentHistory.get(i).getHeartRate(),
                    currentHistory.get(i).getBloodPressure(),
                    currentHistory.get(i).getWeightInKilos(),
                    currentHistory.get(i).getIsNormal() == true ? "NORMAL" : "ABNORMAL",
                    currentHistory.get(i).getCaptureTime()
            );

            System.out.println();

            /*printStatements(currentHistory.get(i).getRespiratoryRate() + " Respiratory Rate");
//            System.out.println(currentHistory.get(i).getCaptureTime() + " Capture Time");
            printStatements(currentHistory.get(i).getHeartRate() + " Heart Rate");
            printStatements(currentHistory.get(i).getBloodPressure() + " Blood Pressue");

            printStatements(currentHistory.get(i).getWeightInKilos() + " Weight (Kgs)");
            printStatements(currentHistory.get(i).getWeightInPounds() + " Weight (Pounds)");
            printStatements(currentHistory.get(i).getIsNormal() == true ? "This record is normal." : "This record in not normal.");
             */
        }
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        /*
            printStatements("Respiratory Rate is : " + patient.isThisVitalSignNormal("Respiratory Rate"));

            printStatements("Heart Rate is : " + patient.isThisVitalSignNormal("Heart Rate"));

            printStatements("Heart Rate1 is : " + patient.isThisVitalSignNormal("Heart Rate1"));

            printStatements("Heart is : " + patient.isThisVitalSignNormal("Heart"));
         */
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

        // save current vital signs to history
        newVitalSign();

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

    private static void newVitalSign() {
        //  save current vital sign object to history
        VitalSigns vitalSigns = patient.vitalSignHistory.addNewVitals();
        vitalSigns.setBloodPressure(patient.currentVitalSign.getBloodPressure());
        vitalSigns.setHeartRate(patient.currentVitalSign.getHeartRate());
        vitalSigns.setRespiratoryRate(patient.currentVitalSign.getRespiratoryRate());
        vitalSigns.setWeightInKilos(patient.currentVitalSign.getWeightInKilos());
        vitalSigns.setWeightInPounds(patient.currentVitalSign.getWeightInPounds());
        vitalSigns.setCaptureTime(patient.currentVitalSign.getCaptureTime());
        vitalSigns.setIsNormal(patient.currentVitalSign.getIsNormal());
    }
}
