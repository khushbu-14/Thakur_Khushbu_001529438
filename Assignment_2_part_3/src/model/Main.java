package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author khushbu
 */
public class Main {

//    maintains all patients
    static PatientDirectory patientList = new PatientDirectory();
    static PersonDirectory personList = new PersonDirectory();
    static Patient patient;
    static Person person;

    //    regex for boolean answers
    static String booleanRegex = "(yes)|(no)+";
    static Pattern p = Pattern.compile(booleanRegex, Pattern.CASE_INSENSITIVE);

    static final double weightConversion = 2.20462;

    static String name;
    static int age = 0;

    static Boolean isNewBornOrInfant;
    static String isBooleanStr;
    static double respiratoryRate;
    static double heartRate;
    static double bloodPressure;
    static Boolean isWeightInKg = true;
    static double weightInKilos;
    static double weightInPounds;
    static Date captureTime;
    static String profession;

    static Boolean isNormal;

    static String result;

    static Scanner userData;

    static int currentPersonId;

    public static void main(String[] args) {
        getPersonInput();
    }

    private static void getPersonInput() {

        userData = new Scanner(System.in);

        printInConsole("Name");

        while (!userData.hasNext()) {
            System.out.println("That's not a correct answer! Enter valid name.");
            userData.next();
        }

        name = userData.nextLine().toUpperCase();

        person = personList.searchPerson(name);
        result = name;

        if (person == null) {

            person = personList.addNewPerson();
            person.setName(name);

            printStatements("Are you newborn or infant (Age : 0-12 months)? Enter YES or NO.");

            if (getBooleanInput()) {
                printInConsole("Age in months");
                isNewBornOrInfant = true;
            } else {
                printInConsole("Age in years");
                isNewBornOrInfant = false;
            }

            person.setIsNewBornOrInfant(isNewBornOrInfant);

            age = getInput("age");
            person.setAge(age);

            if (isNewBornOrInfant || age < 14) {
                profession = "OTHERS";
            } else {
                printStatements("Choose your profession from below");
                printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n2) OTHERS -> Press 3");

                int professionResult;

                do {

                    while (!userData.hasNextInt()) {
                        System.out.println("That's not a valid option!");
                        printStatements("Choose your profession from below");
                        printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n3) OTHERS -> Press 3");
                        userData.next();
                    }

                    professionResult = userData.nextInt();

                    switch (professionResult) {
                        case 1:
                            profession = "DOCTOR";
                            break;
                        case 2:
                            profession = "MEDICAL_STAFF";
                            break;

                        case 3:
                            profession = "OTHERS";
                            break;

                        default:
                            printStatements("Unrecognized option.");
                            printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n3) OTHERS -> Press 3");
                            break;
                    }
                } while (professionResult > 3 || professionResult < 1);
            }
            person.setProfession(profession);
        } else {

            age = person.getAge();
            isNewBornOrInfant = person.getIsNewBornOrInfant();
            profession = person.getProfession();

            printStatements("Welcome back " + name);

            String personType = person.getPersonType(age, isNewBornOrInfant);
            printStatements("You belong to group : " + personType);

            printStatements("Your profession is : " + profession);
        }

        currentPersonId = person.getPersonId();

        nextAction();
    }

    private static void nextAction() {

        int res;
        printStatements(name + ", What do you want to do next?");
        printStatements("1) Visit Doctor -> Press 1\n2) View my details -> Press 2\n3) Change user -> Press 3\n4) Exit -> Press 4");

        do {
            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid option!");
                printStatements(name + ", What do you want to do next?");
                printStatements("1) Visit Doctor -> Press 1\n2) View my details -> Press 2\n3) Change user -> Press 3\n4) Exit -> Press 4");
                userData.next();
            }

            res = userData.nextInt();

            switch (res) {
                case 1:
                    patient = null;
                    visitDoctor();
                    break;
                case 2:
                    patient = null;
                    viewDetails();
                    break;

                case 3:

                    person = null;
                    patient = null;

                    getPersonInput();
                    break;

                case 4:
                    userData.close();
                    break;

                default:
                    printStatements("Unrecognized option.");
                    break;
            }
        } while (res > 4 || res < 1);
    }

    private static void visitDoctor() {

        if (patient == null) {
            patient = getPatientDetails();
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        if (patient == null) {
            //  if patient does not exists, add new record
            printStatements("Hope you are feeling well. This is your first visit with us! \n");
            patient = patientList.addNewPatient();
            patient.setPatientId(currentPersonId);

        } else {
            printStatements("You have visited before " + patient.getHistory().getEncouterHistory().size() + " times");
            String txt = patient.getIsNormal() ? "normal" : "not normal.";
            printStatements("Your last records show that you were " + txt + " Let's check you again!");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        printStatements("Please provide us with few of your details. \n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        respiratoryRate = getDoubleInput("respiratory rate");

        heartRate = getDoubleInput("heart rate");

        bloodPressure = getDoubleInput("blood pressure");

        printStatements("Choose from below how you want to enter weight!");

        printStatements("1) KGS -> Press 1\n2) Pounds -> Press 2");

        int res;

        do {
            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid option!");
                printStatements("Choose from below how you want to enter weight!");
                printStatements("1) KGS -> Press 1\n2) Pounds -> Press 2");
                userData.next();
            }

            res = userData.nextInt();

            switch (res) {
                case 1:
                    isWeightInKg = true;
                    break;
                case 2:
                    isWeightInKg = false;
                    break;

                default:
                    printStatements("Unrecognized option.");
                    break;
            }
        } while (res > 2 || res < 1);

        if (isWeightInKg) {

            weightInKilos = getDoubleInput("weight (kgs)");

            weightInPounds = weightInKilos * weightConversion;
            printStatements("Your weight in pounds is : " + weightInPounds);
        } else {

            weightInPounds = getDoubleInput("weight (pounds)");
            weightInKilos = weightInPounds / weightConversion;
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        isNormal = patient.isPatientNormal(age, respiratoryRate,
                heartRate, bloodPressure, weightInKilos,
                weightInPounds, isNewBornOrInfant);

        if (isNormal) {
            result = name + " You are normal";
        } else {
            result = name + " You are not normal. Please consult doctor.";
        }

        captureTime = new Date();

        patient.setName(name);
        patient.setAge(age);
        patient.setIsNewBornOrInfant(isNewBornOrInfant);

        Encounter encounter = patient.getHistory().addEncounter();

        encounter.setEncounterTime(captureTime);
        VitalSigns currentVitalSigns = encounter.getVitalSigns();

        currentVitalSigns.setBloodPressure(bloodPressure);
        currentVitalSigns.setHeartRate(heartRate);
        currentVitalSigns.setRespiratoryRate(respiratoryRate);
        currentVitalSigns.setWeightInKilos(weightInKilos);
        currentVitalSigns.setWeightInPounds(weightInPounds);
        currentVitalSigns.setIsRecordNormal(isNormal);

        patient.setIsNormal(isNormal);

        System.out.println("----------------------------------------------------");
        printStatements(result);
        System.out.println("----------------------------------------------------");

        nextAction();
    }

    private static void viewDetails() {

        patient = getPatientDetails();

        printPersonDetails();

        if (patient == null) {
            printStatements("You have no medical history records!");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            printPatientHistory();
        }

        nextAction();
    }

    private static void printPersonDetails() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("Name : %s \n", person.getName());

        System.out.printf("Age Group : %s \n",
                person.getPersonType(person.getAge(), person.getIsNewBornOrInfant()));

        System.out.printf("Age :  %d \n", person.getAge());

        System.out.printf("Profession : %s \n", person.getProfession());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void printPatientHistory() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-5s| %-20s| %-15s| %-18s| %-15s| %-15s| %-15s| %-35s|", "NO.",
                "RESPIRATORY RATE", "HEART RATE",
                "BLOOD PRESSURE", "WEIGHT (KG)",
                "WEIGHT (POUND)", "STATUS", "TIME");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        int listSize = patient.getHistory().getEncouterHistory().size();
        for (int i = 0; i < listSize; i++) {
            Encounter encounter = patient.getHistory().getEncouterHistory().get(i);
            VitalSigns vitalSigns = encounter.getVitalSigns();
            System.out.format("|%-5d| %-20.2f| %-15.2f| %-18.2f| %-15.2f| %-15.2f| %-15s| %-35s|",
                    (i + 1),
                    vitalSigns.getRespiratoryRate(),
                    vitalSigns.getHeartRate(),
                    vitalSigns.getBloodPressure(),
                    vitalSigns.getWeightInKilos(),
                    vitalSigns.getWeightInPounds(),
                    vitalSigns.getIsRecordNormal() == true ? "NORMAL" : "ABNORMAL",
                    encounter.getEncounterTime()
            );

            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void printInConsole(String val) {
        System.out.println("Please enter your " + val);
    }

    private static void printStatements(String val) {
        System.out.println(val);
    }

    private static int getInput(String type) {
        int res;
        do {
            printStatements("Please enter valid " + type);
            while (!userData.hasNextInt()) {
                String input = userData.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            res = userData.nextInt();
        } while (res < 0);

        return res;
    }

    private static double getDoubleInput(String type) {
        double res;
        do {
            printStatements("Please enter valid " + type);
            while (!userData.hasNextDouble()) {
                String input = userData.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            res = userData.nextDouble();
        } while (res < 0);

        return res;
    }

    private static Boolean getBooleanInput() {
        Boolean res = null;
        String isInputInString;

        do {
            printStatements("Please choose your answer");
            while (!userData.hasNext(p)) {
                String input = userData.next();
                System.out.printf("\"%s\" is not a valid option.\n", input);
                System.out.println("Enter YES or NO.");
            }
            isInputInString = userData.next(p).trim().toUpperCase();

            if (isInputInString.contains("YES")) {
                res = true;
            } else {
                res = false;
            }
        } while (res == null);
        return res;
    }

    private static Patient getPatientDetails() {
        return patientList.searchPatient1(currentPersonId);
    }
}
