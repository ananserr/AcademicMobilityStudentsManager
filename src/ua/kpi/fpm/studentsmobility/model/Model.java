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
    private String homeCountry;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public MobilityProgramType getProgramType() {
        return programType;
    }

    public void setProgramType(MobilityProgramType programType) {
        this.programType = programType;
    }

    public String getInstitutionCountry() {
        return institutionCountry;
    }

    public void setInstitutionCountry(String institutionCountry) {
        this.institutionCountry = institutionCountry;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public String getInstitutionCity() {
        return institutionCity;
    }

    public void setInstitutionCity(String institutionCity) {
        this.institutionCity = institutionCity;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
