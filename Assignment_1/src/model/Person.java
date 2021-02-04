package model;

import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Person {
//    personal information
 private String firstName;
 private String lastName;
 private String mobileNumber;
 private String dob;
 private int age;
 private float height;
 private float weight;
 private String ssn;
 private int dobDay;
 private int dobMonth;
 private int dobYear;
 
 
// address
 private String streetAddress;
 private String city;
 private String state;
 private String zipcode;
 
// bank saving
 private String savingBankName;
 private String savingBankRoutingNumber;
 private String savingBankAccountNumber;
 private String savingAccountBalance;
 private boolean isSavingAccountType;
 
 // bank checking
 private String checkingBankName;
 private String checkingBankRoutingNumber;
 private String checkingBankAccountNumber;
 private String checkingAccountBalance;
 private boolean isCheckingAccountType;
 
// license information
 
 private String licenseNumber;
 private Date dateIssued;
 private Date dateOfExpiry;
 private String bloodType;
 private String picture;
 
// medical record
 
 private String recordNumber;
 private String alergy1;
 private String alergy2;
 private String alergy3;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

     public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getSavingBankName() {
        return savingBankName;
    }

    public void setSavingBankName(String savingBankName) {
        this.savingBankName = savingBankName;
    }

    public String getSavingBankRoutingNumber() {
        return savingBankRoutingNumber;
    }

    public void setSavingBankRoutingNumber(String savingBankRoutingNumber) {
        this.savingBankRoutingNumber = savingBankRoutingNumber;
    }

    public String getSavingBankAccountNumber() {
        return savingBankAccountNumber;
    }

    public void setSavingBankAccountNumber(String savingBankAccountNumber) {
        this.savingBankAccountNumber = savingBankAccountNumber;
    }

    public String getSavingAccountBalance() {
        return savingAccountBalance;
    }

    public void setSavingAccountBalance(String savingAccountBalance) {
        this.savingAccountBalance = savingAccountBalance;
    }

    public boolean isIsSavingAccountType() {
        return isSavingAccountType;
    }

    public void setIsSavingAccountType(boolean isSavingAccountType) {
        this.isSavingAccountType = isSavingAccountType;
    }

    public String getCheckingBankName() {
        return checkingBankName;
    }

    public void setCheckingBankName(String checkingBankName) {
        this.checkingBankName = checkingBankName;
    }

    public String getCheckingBankRoutingNumber() {
        return checkingBankRoutingNumber;
    }

    public void setCheckingBankRoutingNumber(String checkingBankRoutingNumber) {
        this.checkingBankRoutingNumber = checkingBankRoutingNumber;
    }

    public String getCheckingBankAccountNumber() {
        return checkingBankAccountNumber;
    }

    public void setCheckingBankAccountNumber(String checkingBankAccountNumber) {
        this.checkingBankAccountNumber = checkingBankAccountNumber;
    }

    public String getCheckingAccountBalance() {
        return checkingAccountBalance;
    }

    public void setCheckingAccountBalance(String checkingAccountBalance) {
        this.checkingAccountBalance = checkingAccountBalance;
    }

    public boolean isIsCheckingAccountType() {
        return isCheckingAccountType;
    }

    public void setIsCheckingAccountType(boolean isCheckingAccountType) {
        this.isCheckingAccountType = isCheckingAccountType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getAlergy1() {
        return alergy1;
    }

    public void setAlergy1(String alergy1) {
        this.alergy1 = alergy1;
    }

    public String getAlergy2() {
        return alergy2;
    }

    public void setAlergy2(String alergy2) {
        this.alergy2 = alergy2;
    }

    public String getAlergy3() {
        return alergy3;
    }

    public void setAlergy3(String alergy3) {
        this.alergy3 = alergy3;
    }

    public int getDobDay() {
        return dobDay;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobYear() {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }
    
    

   
}
