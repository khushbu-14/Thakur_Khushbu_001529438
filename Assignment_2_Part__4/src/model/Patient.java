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
public class Patient extends Person {

    private Boolean isNormal;
    private EncounterHistory history;
    private int patientId;

    public Patient() {
        // invoke constructor
        //create encounter list 
        history = new EncounterHistory();
    }

    public Boolean getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
    }

    public EncounterHistory getHistory() {
        return history;
    }

    public void setHistory(EncounterHistory history) {
        this.history = history;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public Boolean isPatientNormal(int age,  double bloodPressure, Boolean isNewBornOrInfant) {

        String patientType = this.getPersonAgeGroup();
//                this.getPersonType(age, isNewBornOrInfant);

        Boolean isPatientNormal = false;

        if (patientType != null) {
            if (!checkBloodPressue(bloodPressure, patientType)) {
                isPatientNormal = false;
            } else {
                isPatientNormal = true;
            }
        }
        return isPatientNormal;
    }

    public Boolean checkRespiratoryRate(double respiratoryRate, String patientType) {
        Boolean isPatientNormal = false;
//        System.out.println("respiratoryRate :" + respiratoryRate);
        switch (patientType) {
            case "NEWBORN":
                if (respiratoryRate >= 30 && respiratoryRate <= 50) {
                    isPatientNormal = true;
                }
                break;

            case "INFANT":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isPatientNormal = true;
                }
                break;

            case "TODDLER":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isPatientNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isPatientNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isPatientNormal = true;
                }
                break;

            case "ADOLSCENT":
                if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                    isPatientNormal = true;
                }
                break;
            default:
                isPatientNormal = false;
                break;
        }
        return isPatientNormal;
    }

    public Boolean checkHeartRate(double heartRate, String patientType) {
        Boolean isPatientNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if (heartRate >= 120 && heartRate <= 160) {
                    isPatientNormal = true;
                }
                break;

            case "INFANT":
                if (heartRate >= 80 && heartRate <= 140) {
                    isPatientNormal = true;
                }
                break;

            case "TODDLER":
                if (heartRate >= 80 && heartRate <= 130) {
                    isPatientNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if (heartRate >= 80 && heartRate <= 120) {
                    isPatientNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if (heartRate >= 70 && heartRate <= 110) {
                    isPatientNormal = true;
                }
                break;

            case "ADOLSCENT":
                if (heartRate >= 55 && heartRate <= 105) {
                    isPatientNormal = true;
                }
                break;
            default:
                isPatientNormal = false;
                break;
        }
        return isPatientNormal;
    }

    public Boolean checkBloodPressue(double bloodPressure, String patientType) {
        Boolean isPatientNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if (bloodPressure >= 50 && bloodPressure <= 70) {
                    isPatientNormal = true;
                }
                break;

            case "INFANT":
                if (bloodPressure >= 70 && bloodPressure <= 100) {
                    isPatientNormal = true;
                }
                break;

            case "TODDLER":
                if (bloodPressure >= 80 && bloodPressure <= 110) {
                    isPatientNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if (bloodPressure >= 80 && bloodPressure <= 110) {
                    isPatientNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if (bloodPressure >= 80 && bloodPressure <= 120) {
                    isPatientNormal = true;
                }
                break;

            case "ADOLSCENT":
                if (bloodPressure >= 110 && bloodPressure <= 120) {
                    isPatientNormal = true;
                }
                break;
            default:
                isPatientNormal = false;
                break;
        }
        return isPatientNormal;
    }

    public Boolean checkWeight(double weightInKilos, double weightInPounds, String patientType) {
        Boolean isPatientNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if ((weightInKilos >= 2 && weightInKilos <= 3) || (weightInPounds >= 4.5 && weightInPounds <= 7)) {
                    isPatientNormal = true;
                }
                break;

            case "INFANT":
                if ((weightInKilos >= 4 && weightInKilos <= 10) || (weightInPounds >= 9 && weightInPounds <= 22)) {
                    isPatientNormal = true;
                }
                break;

            case "TODDLER":
                if ((weightInKilos >= 10 && weightInKilos <= 14) || (weightInPounds >= 22 && weightInPounds <= 31)) {
                    isPatientNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if ((weightInKilos >= 14 && weightInKilos <= 18) || (weightInPounds >= 31 && weightInPounds <= 40)) {
                    isPatientNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if ((weightInKilos >= 20 && weightInKilos <= 42) || (weightInPounds >= 41 && weightInPounds <= 92)) {
                    isPatientNormal = true;
                }
                break;

            case "ADOLSCENT":
                if ((weightInKilos > 50) || (weightInPounds > 110)) {
                    isPatientNormal = true;
                }
                break;
            default:
                isPatientNormal = false;
                break;
        }
        return isPatientNormal;
    }

    public Boolean isThisVitalSignNormal(String vsign) {

        Boolean isMatched = false;

        String currentVSign = vsign.toUpperCase();

        if (currentVSign.equals("RESPIRATORY RATE") || currentVSign.equals("HEART RATE")
                || currentVSign.equals("BLOOD PRESSURE") || currentVSign.equals("WEIGHT")) {
            isMatched = true;
        }

        return isMatched;
        // isPatientNormal = false;

        /*String vitalsRegex = "(RESPIRATORY RATE)|(HEART RATE)|(BLOOD PRESSURE)|(WEIGHT)+";

        String currentVSign = vsign.toUpperCase();

        if (currentVSign.matches(vitalsRegex)) {
            isMatched = true;
        }*/

 /* if (isMatched) {
            String patientType = getPatientType(age, isNewBornOrInfant);

            switch (currentVSign) {
                case "RESPIRATORY RATE":
                    isPatientNormal = checkRespiratoryRate(currentVitalSign.getRespiratoryRate(), patientType);
                    break;

                case "HEART RATE":
                    isPatientNormal = checkHeartRate(currentVitalSign.getHeartRate(), patientType);
                    break;

                case "BLOOD PRESSURE":
                    isPatientNormal = checkBloodPressue(currentVitalSign.getBloodPressure(), patientType);
                    break;

                case "WEIGHT":
                    isPatientNormal = checkWeight(currentVitalSign.getWeightInKilos(), currentVitalSign.getWeightInPounds(), patientType);
                    break;

                default:
                    isPatientNormal = false;
                    break;
            }
        }

        return isMatched && isPatientNormal;
         */
    }

}
