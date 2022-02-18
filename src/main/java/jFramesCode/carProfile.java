/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFramesCode;

import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class carProfile {
    String carName;
    String manufacturedBy;
    String modelNumber;
    String manufacturedYear;
    String serialNum;
    int seatsNumber;
    boolean mainCertificate;
    String city;
    boolean availability;
    String modifiedDate;
    private ArrayList<carProfile> totrecords;

    public carProfile() {
        addRecordstoArray();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    public void addRecordstoArray(){
        totrecords = new ArrayList<carProfile>();
        totrecords.add(new carProfile("Acura NSX", "Honda","First Gen", "1989","BHTQ2681762", 4, true, "Boston", true, "2022/02/17" ));
        totrecords.add(new carProfile("Tata Nexon", "TATA","X Series", "1997","BHGH2681333", 5, true, "New Jersey", false, "2020/01/12" ));
        totrecords.add(new carProfile("Tesla", "TESLA","X 200", "2012","YSMI2681234", 4, false, "New York", true, "2018/09/04" ));
        totrecords.add(new carProfile("Toyota", "TOYOTA","ET 3002", "2000","FGAOQ2681902", 5, false, "Ohio", false, "2016/12/01" ));
    }

    public carProfile(String carName, String manufacturedBy, String modelNumber, String manufacturedYear, String serialNum, int seatsNumber, boolean mainCertificate, String city, boolean availability) {
        this.carName = carName;
        this.manufacturedBy = manufacturedBy;
        this.modelNumber = modelNumber;
        this.manufacturedYear = manufacturedYear;
        this.serialNum = serialNum;
        this.seatsNumber = seatsNumber;
        this.mainCertificate = mainCertificate;
        this.city = city;
        this.availability = availability;
    }

    public carProfile(String carName, String manufacturedBy, String modelNumber, String manufacturedYear, String serialNum, int seatsNumber, boolean mainCertificate, String city, boolean availability, String modifiedDate) {
        this.carName = carName;
        this.manufacturedBy = manufacturedBy;
        this.modelNumber = modelNumber;
        this.manufacturedYear = manufacturedYear;
        this.serialNum = serialNum;
        this.seatsNumber = seatsNumber;
        this.mainCertificate = mainCertificate;
        this.city = city;
        this.availability = availability;
        this.modifiedDate = modifiedDate;
    }
    
    

    public carProfile(ArrayList<carProfile> totrecords) {
        this.totrecords = totrecords;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public boolean isMainCertificate() {
        return mainCertificate;
    }

    public void setMainCertificate(boolean mainCertificate) {
        this.mainCertificate = mainCertificate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ArrayList<carProfile> getTotrecords() {
        return totrecords;
    }

    public void setTotrecords(ArrayList<carProfile> totrecords) {
        this.totrecords = totrecords;
    } 
    
    @Override
    public String toString(){
        return this.getCarName();
    }

}