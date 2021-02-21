package model;

import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khushbu
 */
public class Patient {

    private String name;
    private int age;
    private int patientId;
    private Boolean isNewBornOrInfant;

    VitalSigns currentVitalSign = new VitalSigns();
    VitalSignHistory vitalSignHistory = new VitalSignHistory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public VitalSigns getCurrentVitalSign() {
        return currentVitalSign;
    }

    public void setCurrentVitalSign(VitalSigns currentVitalSign) {
        this.currentVitalSign = currentVitalSign;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Boolean getIsNewBornOrInfant() {
        return isNewBornOrInfant;
    }

    public void setIsNewBornOrInfant(Boolean isNewBornOrInfant) {
        this.isNewBornOrInfant = isNewBornOrInfant;
    }

    public Boolean isPatientNormal(int age, double respiratoryRate, double heartRate, double bloodPressure, double weightInKilos, double weightInPounds, Boolean isNewBornOrInfant) {

        String patientType = getPatientType(age, isNewBornOrInfant);

        Boolean isNormal = false;

        if (patientType != null) {
            if (((!checkRespiratoryRate(respiratoryRate, patientType) || !checkHeartRate(heartRate, patientType)) || !checkBloodPressue(bloodPressure, patientType))
                    || !checkWeight(weightInKilos, weightInPounds, patientType)) {
                isNormal = false;
            } else {
                isNormal = true;
            }

            /*switch (patientType) {
                case "NEWBORN":
                    if (respiratoryRate >= 30 && respiratoryRate <= 50
                            && heartRate >= 120 && heartRate <= 160
                            && bloodPressure >= 50 && bloodPressure <= 70
                            && (weightInKilos >= 2 && weightInKilos <= 3) || (weightInPounds >= 4.5 && weightInPounds <= 7)) {
                        isNormal = true;
                    }
                    break;

                case "INFANT":
                    if (respiratoryRate >= 20 && respiratoryRate <= 30
                            && heartRate >= 80 && heartRate <= 140
                            && bloodPressure >= 70 && bloodPressure <= 100
                            && (weightInKilos >= 4 && weightInKilos <= 10) || (weightInPounds >= 9 && weightInPounds <= 22)) {
                        isNormal = true;
                    }
                    break;

                case "TODDLER":
                    if (respiratoryRate >= 20 && respiratoryRate <= 30
                            && heartRate >= 80 && heartRate <= 130
                            && bloodPressure >= 80 && bloodPressure <= 110
                            && (weightInKilos >= 10 && weightInKilos <= 14) || (weightInPounds >= 22 && weightInPounds <= 31)) {
                        isNormal = true;
                    }
                    break;

                case "PRE-SCHOOLER":
                    if (respiratoryRate >= 20 && respiratoryRate <= 30
                            && heartRate >= 80 && heartRate <= 120
                            && bloodPressure >= 80 && bloodPressure <= 110
                            && (weightInKilos >= 14 && weightInKilos <= 18) || (weightInPounds >= 31 && weightInPounds <= 40)) {
                        isNormal = true;
                    }
                    break;

                case "SCHOOL-AGE":
                    if (respiratoryRate >= 20 && respiratoryRate <= 30
                            && heartRate >= 70 && heartRate <= 110
                            && bloodPressure >= 80 && bloodPressure <= 120
                            && (weightInKilos >= 20 && weightInKilos <= 42) || (weightInPounds >= 41 && weightInPounds <= 92)) {
                        isNormal = true;
                    }
                    break;

                case "ADOLSCENT":
                    if (respiratoryRate >= 12 && respiratoryRate <= 20
                            && heartRate >= 55 && heartRate <= 105
                            && bloodPressure >= 110 && bloodPressure <= 120
                            && (weightInKilos > 50) || (weightInPounds > 110)) {
                        isNormal = true;
                    }
                    break;
                default:
                    isNormal = false;
                    break;
            }
        } */
        }
        return isNormal;
    }

    public Boolean checkRespiratoryRate(double respiratoryRate, String patientType) {
        Boolean isNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if (respiratoryRate >= 30 && respiratoryRate <= 50) {
                    isNormal = true;
                }
                break;

            case "INFANT":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isNormal = true;
                }
                break;

            case "TODDLER":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    isNormal = true;
                }
                break;

            case "ADOLSCENT":
                if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                    isNormal = true;
                }
                break;
            default:
                isNormal = false;
                break;
        }
        return isNormal;
    }

    public Boolean checkHeartRate(double heartRate, String patientType) {
        Boolean isNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if (heartRate >= 120 && heartRate <= 160) {
                    isNormal = true;
                }
                break;

            case "INFANT":
                if (heartRate >= 80 && heartRate <= 140) {
                    isNormal = true;
                }
                break;

            case "TODDLER":
                if (heartRate >= 80 && heartRate <= 130) {
                    isNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if (heartRate >= 80 && heartRate <= 120) {
                    isNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if (heartRate >= 70 && heartRate <= 110) {
                    isNormal = true;
                }
                break;

            case "ADOLSCENT":
                if (heartRate >= 55 && heartRate <= 105) {
                    isNormal = true;
                }
                break;
            default:
                isNormal = false;
                break;
        }
        return isNormal;
    }

    public Boolean checkBloodPressue(double bloodPressure, String patientType) {
        Boolean isNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if (bloodPressure >= 50 && bloodPressure <= 70) {
                    isNormal = true;
                }
                break;

            case "INFANT":
                if (bloodPressure >= 70 && bloodPressure <= 100) {
                    isNormal = true;
                }
                break;

            case "TODDLER":
                if (bloodPressure >= 80 && bloodPressure <= 110) {
                    isNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if (bloodPressure >= 80 && bloodPressure <= 110) {
                    isNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if (bloodPressure >= 80 && bloodPressure <= 120) {
                    isNormal = true;
                }
                break;

            case "ADOLSCENT":
                if (bloodPressure >= 110 && bloodPressure <= 120) {
                    isNormal = true;
                }
                break;
            default:
                isNormal = false;
                break;
        }
        return isNormal;
    }

    public Boolean checkWeight(double weightInKilos, double weightInPounds, String patientType) {
        Boolean isNormal = false;

        switch (patientType) {
            case "NEWBORN":
                if ((weightInKilos >= 2 && weightInKilos <= 3) || (weightInPounds >= 4.5 && weightInPounds <= 7)) {
                    isNormal = true;
                }
                break;

            case "INFANT":
                if ((weightInKilos >= 4 && weightInKilos <= 10) || (weightInPounds >= 9 && weightInPounds <= 22)) {
                    isNormal = true;
                }
                break;

            case "TODDLER":
                if ((weightInKilos >= 10 && weightInKilos <= 14) || (weightInPounds >= 22 && weightInPounds <= 31)) {
                    isNormal = true;
                }
                break;

            case "PRE-SCHOOLER":
                if ((weightInKilos >= 14 && weightInKilos <= 18) || (weightInPounds >= 31 && weightInPounds <= 40)) {
                    isNormal = true;
                }
                break;

            case "SCHOOL-AGE":
                if ((weightInKilos >= 20 && weightInKilos <= 42) || (weightInPounds >= 41 && weightInPounds <= 92)) {
                    isNormal = true;
                }
                break;

            case "ADOLSCENT":
                if ((weightInKilos > 50) || (weightInPounds > 110)) {
                    isNormal = true;
                }
                break;
            default:
                isNormal = false;
                break;
        }
        return isNormal;
    }

    public Boolean isThisVitalSignNormal(String vsign) {
        Boolean isMatched = false, isNormal = false;

        String vitalsRegex = "(RESPIRATORY RATE)|(HEART RATE)|(BLOOD PRESSURE)|(WEIGHT)+";

        String currentVSign = vsign.toUpperCase();

        if (currentVSign.matches(vitalsRegex)) {
            isMatched = true;
        }

        if (isMatched) {
            String patientType = getPatientType(age, isNewBornOrInfant);

            switch (currentVSign) {
                case "RESPIRATORY RATE":
                    isNormal = checkRespiratoryRate(currentVitalSign.getRespiratoryRate(), patientType);
                    break;

                case "HEART RATE":
                    isNormal = checkHeartRate(currentVitalSign.getHeartRate(), patientType);
                    break;

                case "BLOOD PRESSURE":
                    isNormal = checkBloodPressue(currentVitalSign.getBloodPressure(), patientType);
                    break;

                case "WEIGHT":
                    isNormal = checkWeight(currentVitalSign.getWeightInKilos(), currentVitalSign.getWeightInPounds(), patientType);
                    break;

                default:
                    isNormal = false;
                    break;
            }
        }

        return isMatched && isNormal;
    }

    public String getPatientType(int age, Boolean isNewBornOrInfant) {
        String patientType = null;

        if (isNewBornOrInfant) {
            if (age <= 12) {
                patientType = "NEWBORN";
            } else {
                patientType = "INFANT";
            }
        } else {
            if (age > 1 && age <= 3) {
                patientType = "TODDLER";
            } else if (age > 3 && age <= 5) {
                patientType = "PRE-SCHOOLER";
            } else if (age > 5 && age <= 12) {
                patientType = "SCHOOL-AGE";
            } else if (age > 12) {
                patientType = "ADOLSCENT";
            }
        }

        return patientType;
    }
}
