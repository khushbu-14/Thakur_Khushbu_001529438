package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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

    static ArrayList<City> cityList = new ArrayList<>();

//    static HashMap<String, String> medicalAnalysisData = new HashMap<String, String>();
    //    regex for boolean answers
    static String booleanRegex = "(yes)|(no)+";
    static Pattern p = Pattern.compile(booleanRegex, Pattern.CASE_INSENSITIVE);

    static final double weightConversion = 2.20462;

    static String name = "";
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
    static String personType;

    static Boolean isNormal;

    static String result;

    static Scanner userData;

    static int currentPersonId;

    static String cityName;
    static String communityName;
//    static int zipcode;
    static String houseNo;

    static ArrayList<Community> communityList;

    public static void main(String[] args) {
        userData = new Scanner(System.in);

        createCityDatabase();
        nextAction();
//        getPersonInput();
    }

    private static void createCityDatabase() {
        City city = new City();
        cityList.add(city);
        city.setCityName("Boston");

        city.addNewCommunity("Roxbury");
        city.addNewCommunity("Petersborough");
        city.addNewCommunity("Burlignton");
        city.addNewCommunity("Roxbury Crossings");

        City city1 = new City();

        cityList.add(city1);
        city1.setCityName("Mumbai");

        city1.addNewCommunity("Borivali");
        city1.addNewCommunity("Andheri");
        city1.addNewCommunity("Malad");
        city1.addNewCommunity("Kandivali");
    }

    private static void getPersonInput(Boolean shouldVisitDoctor) {

        userData = new Scanner(System.in);

//        printInConsole("Name");
        name = getStringInput("name");

//        while (!userData.hasNext()) {
//            System.out.println("That's not a correct answer! Enter valid name.");
//            userData.next();
//        }
//
//        name = userData.nextLine().toUpperCase();
//        currentPersonName = name;
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

            if (isNewBornOrInfant && age > 12) {
                printStatements("Oops! age in months cannot be greater than 12. Setting it to 12");
                age = 12;
            }

            person.setAge(age);

            personType = person.getPersonType(age, isNewBornOrInfant);

            person.setPersonAgeGroup(personType);

            if (isNewBornOrInfant || age < 14) {
                profession = "OTHERS";
            } else {
                printStatements("Choose your profession from below");
                printStatements("1) DOCTOR -> Press 1\n2) MEDICAL STAFF -> Press 2\n3) OTHERS -> Press 3");

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

            cityName = getUserCityName();
            person.getResidence().setCityName(cityName);

            communityName = getUserCommunityName();
            person.getResidence().setCommunityName(communityName);

            /*
            printStatements("Choose city name from below :");
            printCityList();

            int cityResult;

            do {

                while (!userData.hasNextInt()) {
                    System.out.println("That's not a valid option!");
                    printStatements("Choose your valid option");
                    userData.next();
                }

                cityResult = userData.nextInt();

                if (cityResult != 1 || cityResult != 2) {
                    printCityList();
                }

            } while (cityResult > 2 || cityResult < 1);

            communityList = cityList.get(cityResult - 1).getCommunityList();
            cityName = cityList.get(cityResult - 1).getCityName();
            person.getResidence().setCityName(cityName);

            printStatements("Choose community name from below :");
            printCommunityList();

            int communityResult;

            do {

                while (!userData.hasNextInt()) {
                    System.out.println("That's not a valid option!");
                    printStatements("Choose your valid option");
                    userData.next();
                }

                communityResult = userData.nextInt();

                if (communityResult > 4 || communityResult < 1) {
                    printCommunityList();
                }

            } while (communityResult > 4 || communityResult < 1);

            communityName = communityList.get(communityResult - 1).getCommunityName();
            person.getResidence().setCommunityName(communityName);
             */
//            printInConsole("House number");Ï
            houseNo = getStringInput("house number");

            person.getResidence().setHouseNo(houseNo);
        } else {

            age = person.getAge();
            isNewBornOrInfant = person.getIsNewBornOrInfant();
            profession = person.getProfession();
            cityName = person.getResidence().getCityName();
            communityName = person.getResidence().getCommunityName();
            houseNo = person.getResidence().getHouseNo();

            printStatements("Welcome back " + name);

            personType = person.getPersonType(age, isNewBornOrInfant);
            printStatements("You belong to group : " + personType);

            printStatements("Your profession is : " + profession);

            printStatements("Your address is : " + profession);

            System.out.printf("Address : %s, %s, %s \n", houseNo, communityName, cityName);
        }

        currentPersonId = person.getPersonId();

        if (shouldVisitDoctor) {
            visitDoctor();
        } else {
            nextAction();
        }
    }

    private static void nextAction() {

        int res;

        greetUser();

        printStatements("1) Visit Doctor -> Press 1\n");
        printStatements("2) View my details -> Press 2\n");
        printStatements("3) Change /  user -> Press 3\n");
        printStatements("4) Analyze Data -> Press 4\n");
        printStatements("5) List all persons in database -> Press 5 \n");
        printStatements("6) List all PATIENTS -> Press 6 \n");
        printStatements("7) Exit -> Press 7");

        do {
            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid option!");
                greetUser();
                printStatements("1) Visit Doctor -> Press 1\n");
                printStatements("2) View my details -> Press 2\n");
                printStatements("3) Change user -> Press 3\n");
                printStatements("4) Analyze Data -> Press 4\n");
                printStatements("5) List all persons in database -> Press 5 \n");
                printStatements("6) List all PATIENTS -> Press 6 \n");
                printStatements("7) Exit -> Press 7");
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

                    getPersonInput(false);
                    break;

                case 4:
                    analyzeData();
                    break;

                case 5:
                    listAllPersons();
                    break;

                case 6:
                    listAllPatients();
                    break;

                case 7:
                    userData.close();
                    break;

                default:
                    printStatements("Unrecognized option.");
                    break;
            }
        } while (res > 7 || res < 1);
    }

    private static void visitDoctor() {

        if (person == null) {
            System.out.println("Oops! We have no users in our database");
            getPersonInput(true);
        } else {
            if (patient == null) {
                patient = getPatientDetails();
            }

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

            if (patient == null) {
                //  if patient does not exists, add new record
                printStatements("Hope you are feeling well. This is your first visit with us! \n");
                Person currentPerson = personList.searchPerson(name);

                patient = patientList.addNewPatient(currentPerson);

//                System.out.println(patient.getResidence().getCityName());
//                System.out.println(patient.getResidence().getCommunityName());
//                System.out.println(patient.getResidence().getHouseNo());
            } else {
                printStatements("You have visited before " + patient.getHistory().getEncouterHistory().size() + " times");
                String txt = patient.getIsNormal() ? "normal" : "not normal.";
                printStatements("Your last records show that you were " + txt + " Let's check you again!");
            }

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

            printStatements("Please provide us with few of your details. \n");

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

            /*
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
             */
            bloodPressure = getDoubleInput("blood pressure");

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

            isNormal = patient.isPatientNormal(age, bloodPressure, isNewBornOrInfant, personType);

            String personType = patient.getPersonType(age, isNewBornOrInfant);

//        int lastNum = Integer.parseInt(medicalAnalysisData.get(personType));
            if (isNormal) {
                result = name + " You are normal";
//            if (lastNum != 0) {
//                lastNum -= 1;
//            }
            } else {
                result = name + " You are not normal. Please consult doctor.";
//            lastNum += 1;
            }

            captureTime = new Date();

            patient.setName(name);
            patient.setAge(age);
            patient.setIsNewBornOrInfant(isNewBornOrInfant);

//        medicalAnalysisData.put(personType, Integer.toString(lastNum));
            Encounter encounter = patient.getHistory().addEncounter();

            encounter.setEncounterTime(captureTime);
            VitalSigns currentVitalSigns = encounter.getVitalSigns();

            currentVitalSigns.setBloodPressure(bloodPressure);
            currentVitalSigns.setIsRecordNormal(isNormal);

            /* currentVitalSigns.setHeartRate(heartRate);
        currentVitalSigns.setRespiratoryRate(respiratoryRate);
        currentVitalSigns.setWeightInKilos(weightInKilos);
        currentVitalSigns.setWeightInPounds(weightInPounds);
        currentVitalSigns.setIsRecordNormal(isNormal); */
            patient.setIsNormal(isNormal);

            System.out.println("----------------------------------------------------");
            printStatements(result);
            System.out.println("----------------------------------------------------");
            nextAction();
        }

    }

    private static void viewDetails() {

        if (person == null) {
            System.out.println("Oops! We have no users in our database");
        } else {
            patient = getPatientDetails();

            printPersonDetails();

            if (patient == null) {
                printStatements("You have no medical history records!");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
            } else {
                printPatientHistory();
            }
        }
        nextAction();
    }

    private static void printPersonDetails() {

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        if (person != null) {
            System.out.printf("Name : %s \n", person.getName());

            System.out.printf("Age Group : %s \n",
                    person.getPersonType(person.getAge(), person.getIsNewBornOrInfant()));

            if (person.getIsNewBornOrInfant()) {
                System.out.printf("Age :  %d months old \n", person.getAge());
            } else {
                System.out.printf("Age :  %d years old \n", person.getAge());
            }

            System.out.printf("Profession : %s \n", person.getProfession());

            System.out.printf("Address : %s, %s, %s \n", person.getResidence().getHouseNo(), person.getResidence().getCommunityName(), person.getResidence().getCityName());
        } else {
            System.out.println("Oops! We have no users in our database");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void printPatientHistory() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-5s| %-18s| %-15s| %-35s|", "NO.",
                "BLOOD PRESSURE", "STATUS", "TIME");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        int listSize = patient.getHistory().getEncouterHistory().size();
        for (int i = 0; i < listSize; i++) {
            Encounter encounter = patient.getHistory().getEncouterHistory().get(i);
            VitalSigns vitalSigns = encounter.getVitalSigns();
            System.out.format("|%-5d| %-18.2f| %-15s| %-35s|",
                    (i + 1),
                    //                    vitalSigns.getRespiratoryRate(),
                    //                    vitalSigns.getHeartRate(),
                    vitalSigns.getBloodPressure(),
                    //                    vitalSigns.getWeightInKilos(),
                    //                    vitalSigns.getWeightInPounds(),
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

    private static void printCityList() {
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println("\n " + cityList.get(i).getCityName() + " --> Press " + (i + 1));
        }
    }

    private static void printCommunityList() {
        for (int i = 0; i < communityList.size(); i++) {
            System.out.println("\n " + communityList.get(i).getCommunityName() + " --> Press " + (i + 1));
        }
    }

    private static String getStringInput(String type) {
        String res = null;

        do {
            printStatements("Please enter your " + type);
            while (!userData.hasNext()) {
                String input = userData.next();
                System.out.printf("\"%s\" is not a valid option.\n", input);
                System.out.println("Enter valid " + type);
            }

            res = userData.nextLine().trim().toUpperCase();

        } while (res == null || res.trim().equals(""));

        return res;
    }

    private static String getUserCityName() {
        String res;

        printStatements("Choose city name from below :");
        printCityList();

        int cityResult;

        do {

            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid option!");
                printStatements("Choose your valid option");
                userData.next();
            }

            cityResult = userData.nextInt();

            if (cityResult != 1 || cityResult != 2) {
                printCityList();
            }

        } while (cityResult > 2 || cityResult < 1);

        communityList = cityList.get(cityResult - 1).getCommunityList();

        res = cityList.get(cityResult - 1).getCityName();
        return res;
    }

    private static String getUserCommunityName() {
        String res;

        printStatements("Choose community name from below :");

        printCommunityList();

        int communityResult;

        do {

            while (!userData.hasNextInt()) {
                System.out.println("That's not a valid option!");
                printStatements("Choose your valid option");
                userData.next();
            }

            communityResult = userData.nextInt();

            if (communityResult > 4 || communityResult < 1) {
                printCommunityList();
            }

        } while (communityResult > 4 || communityResult < 1);

        res = communityList.get(communityResult - 1).getCommunityName();

        return res;
    }

    private static void analyzeData() {

        if (person == null) {
            System.out.println("Oops! We have no users in our database");
        } else {
            int total = 0;
            String cName = getUserCityName();
            String comName = getUserCommunityName();
            HashMap<String, String> medicalAnalysisData = new HashMap<>();

            for (String i : person.getAgeGroups()) {
                medicalAnalysisData.put(i, "0");
            }

            for (Patient patientItem : patientList.getPatientList()) {
                if (patientItem.getResidence().getCommunityName().equals(comName)) {
                    if (patientItem.getIsNormal()) {

                    } else {
                        String currentPersonType = patientItem.getPersonAgeGroup();
                        int num = Integer.parseInt(medicalAnalysisData.get(currentPersonType));
                        num++;
                        medicalAnalysisData.put(currentPersonType, "" + num);
                        total++;
                    }
                }
            }

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Number of abnormal cases for each age groups are : \n");
            for (String i : medicalAnalysisData.keySet()) {
                System.out.println(i + " : " + medicalAnalysisData.get(i));
            }
            System.out.println("---- ----- ---- ----- ----- ------ ----- ----- ---- ---- ----- -----");
            System.out.println("Total : " + total);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        nextAction();
    }

    private static void greetUser() {
        if (!"".equals(name)) {
            printStatements(name + ", What do you want to do?");
        } else {
            printStatements("What do you want to do?");
        }
    }

    private static void listAllPersons() {
        if (person == null) {
            System.out.println("Oops! We have no users in our database");
        } else {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

            if (personList.getPersonList().isEmpty()) {
                System.out.println("No persons found!");
            } else {
                for (Person personItem : personList.getPersonList()) {
                    System.out.println(personItem);
                    System.out.println("---- ----- ---- ----- ----- ------ ----- ----- ---- ---- ----- -----");
                    System.out.println(personItem.getResidence());
                }
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        nextAction();
    }

    private static void listAllPatients() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        if (patientList.getPatientList().isEmpty()) {
            System.out.println("No patient found!");
        } else {
            for (Patient patientItem : patientList.getPatientList()) {
                System.out.println(patientItem);
                System.out.println("---- ----- ---- ----- ----- ------ ----- ----- ---- ---- ----- -----");
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        nextAction();
    }
}
