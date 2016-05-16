package ua.kpi.fpm.studentsmobility.model;

/**
 * Created by Anastasia Serhienko on 5/9/16.
 */
public class AcademicMobilityParticipant {
    private String lastName;
    private String firstName;
    private String middleName;
    private String shortFullName;
    private String mobilePhone;
    private String homePhone; // (optional)
    private String email;
//     home address:
//    - Индекс
//    - город проживания
//    - улица
//    - номер дома
//    - номер квартиры
// - собрать по правилам почты адрес
// - собрать обычный адрес
    private String comment; // optional
    private Faculty faculty;
    private MobilityProgramType programType;
    private int course;
    private String univCountry;
    private String univCity;
    private String univ;
    // univ address
    private String departureDate;
    private String arriveDate;

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

    public void setUnivCountry(String univCountry) {
        this.univCountry = univCountry;
    }

    public String getUnivCountry() {
        return univCountry;
    }

    public String getUnivCity() {
        return univCity;
    }

    public void setUnivCity(String univCity) {
        this.univCity = univCity;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getArriveDate() {
        return arriveDate;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
