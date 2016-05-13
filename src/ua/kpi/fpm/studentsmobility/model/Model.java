package ua.kpi.fpm.studentsmobility.model;

/**
 * Created by Anastasia Serhienko on 5/12/16.
 */
public class Model {
    private String lastName;
    private String firstName;
    private String middleName;
    private StringBuffer shortFullName;
    private String mobilePhone;
    private String homePhone; // (optional)
    private String email;
    private StringBuffer homePostalAddress;
    private StringBuffer homeCommonAddress;
    private String homePostalIndex;
    private String homeCity;
    private String homeStreet;
    private String homeHouse;
    private String homeApartmentNumber;
    private Faculty faculty;
    private int course;
    private MobilityProgramType programType;
    private String institutionCountry;
    private String institutionCity;
    private String institutionName;
    private StringBuffer foreignInstitution;
    private String departureDate;
    private String arriveDate;
    private String comment; // optional

    // The Program logic

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePostalIndex() {
        return homePostalIndex;
    }

    public void setHomePostalIndex(String homePostalIndex) {
        this.homePostalIndex = homePostalIndex;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeStreet() {
        return homeStreet;
    }

    public void setHomeStreet(String homeStreet) {
        this.homeStreet = homeStreet;
    }

    public String getHomeHouse() {
        return homeHouse;
    }

    public void setHomeHouse(String homeHouse) {
        this.homeHouse = homeHouse;
    }

    public String getHomeApartmentNumber() {
        return homeApartmentNumber;
    }

    public void setHomeApartmentNumber(String homeApartmentNumber) {
        this.homeApartmentNumber = homeApartmentNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
