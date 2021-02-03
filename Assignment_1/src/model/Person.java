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
 private int mobileNumber;
 private Date dob;
 private int age;
 private float height;
 private float weight;
 private int ssn;
 
// address
 private String streetAddress;
 private String city;
 private String state;
 private int zipcode;
 
// bank saving
 private String savingBankName;
 private int savingBankRoutingNumber;
 private int savingBankAccountNumber;
 private int savingAccountBalance;
 private boolean isSavingAccountType;
 
 // bank checking
 private String checkingBankName;
 private int checkingBankRoutingNumber;
 private int checkingBankAccountNumber;
 private int checkingAccountBalance;
 private boolean isCheckingAccountType;
 
// license information
 
 private int licenseNumber;
 private Date dateIssued;
 private Date dateOfExpiry;
 private String bloodType;
 private String picture;
 
// medical record
 
 private int recordNumber;
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

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getSavingBankName() {
        return savingBankName;
    }

    public void setSavingBankName(String savingBankName) {
        this.savingBankName = savingBankName;
    }

    public int getSavingBankRoutingNumber() {
        return savingBankRoutingNumber;
    }

    public void setSavingBankRoutingNumber(int savingBankRoutingNumber) {
        this.savingBankRoutingNumber = savingBankRoutingNumber;
    }

    public int getSavingBankAccountNumber() {
        return savingBankAccountNumber;
    }

    public void setSavingBankAccountNumber(int savingBankAccountNumber) {
        this.savingBankAccountNumber = savingBankAccountNumber;
    }

    public int getSavingAccountBalance() {
        return savingAccountBalance;
    }

    public void setSavingAccountBalance(int savingAccountBalance) {
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

    public int getCheckingBankRoutingNumber() {
        return checkingBankRoutingNumber;
    }

    public void setCheckingBankRoutingNumber(int checkingBankRoutingNumber) {
        this.checkingBankRoutingNumber = checkingBankRoutingNumber;
    }

    public int getCheckingBankAccountNumber() {
        return checkingBankAccountNumber;
    }

    public void setCheckingBankAccountNumber(int checkingBankAccountNumber) {
        this.checkingBankAccountNumber = checkingBankAccountNumber;
    }

    public int getCheckingAccountBalance() {
        return checkingAccountBalance;
    }

    public void setCheckingAccountBalance(int checkingAccountBalance) {
        this.checkingAccountBalance = checkingAccountBalance;
    }

    public boolean isIsCheckingAccountType() {
        return isCheckingAccountType;
    }

    public void setIsCheckingAccountType(boolean isCheckingAccountType) {
        this.isCheckingAccountType = isCheckingAccountType;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
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

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
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
}
