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

    public static void main(String[] args) {
//        start console
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

            /*while (!userData.hasNext(p)) {
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
            } */
            age = getInput("age");
            person.setAge(age);

            printStatements("Choose your profession from below");
            printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n2) OTHERS -> Press 3");

            int professionResult;

            do {

                while (!userData.hasNextInt()) {
                    System.out.println("That's not a valid option!");
                    printStatements("Choose your profession from below");
                    printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n2) OTHERS -> Press 3");
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
                        printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n2) OTHERS -> Press 3");
                        break;
                }
            } while (professionResult > 3 || professionResult < 1);
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

        nextAction();
    }

    private static void nextAction() {

        int res;
        printStatements("What do you want to do next?");
        printStatements("1) Visit Doctor -> Press 1\n2) View my details -> Press 2\n2) Exit -> Press 3");

        do {
            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid option!");
                printStatements("What do you want to do next?");
                printStatements("1) Visit Doctor -> Press 1\n2) View my details -> Press 2\n2) Exit -> Press 3");
                userData.next();
            }

            res = userData.nextInt();

            switch (res) {
                case 1:
                    visitDoctor();
                    break;
                case 2:
                    viewDetails();
                    break;

                case 3:
                    userData.close();
                    break;

                default:
                    printStatements("Unrecognized option.");
                    break;
            }
        } while (res > 3 || res < 1);
    }

    private static void visitDoctor() {

    }

    private static void viewDetails() {

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
        String isBooleanStr;

        do {
            printStatements("Please choose your answer");
            while (!userData.hasNext(p)) {
                String input = userData.next();
                System.out.printf("\"%s\" is not a valid option.\n", input);
                System.out.println("Enter YES or NO.");
            }
            isBooleanStr = userData.next(p).trim().toUpperCase();

            if (isBooleanStr.contains("YES")) {
                res = true;
            } else {
                res = false;
            }
        } while (res == null);
        return res;
    }
}
