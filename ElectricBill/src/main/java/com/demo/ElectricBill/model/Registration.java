package com.demo.ElectricBill.model;

public class Registration {

    private String name;
    private String fatherName;
    private String mobileNumber;
    private String division;
    private String district;
    private String thana;
    private String address;
    private String userName;
    private String password;

    public Registration() {
    }

    public Registration(String name, String fatherName, String mobileNumber, String division, String district, String thana, String address, String userName, String password) {
        this.name = name;
        this.fatherName = fatherName;
        this.mobileNumber = mobileNumber;
        this.division = division;
        this.district = district;
        this.thana = thana;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegistrationModel{" + "name=" + name + ", fatherName=" + fatherName + ", mobileNumber=" + mobileNumber + ", division=" + division + ", district=" + district + ", thana=" + thana + ", address=" + address + ", userName=" + userName + ", password=" + password + '}';
    }

}

