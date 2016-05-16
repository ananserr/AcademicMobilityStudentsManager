package ua.kpi.fpm.studentsmobility.controller;

import  java.util.Scanner;
import  java.util.regex.Pattern;

import ua.kpi.fpm.studentsmobility.model.Faculty;
import ua.kpi.fpm.studentsmobility.model.MobilityProgramType;
import ua.kpi.fpm.studentsmobility.model.Model;
import ua.kpi.fpm.studentsmobility.model.AcademicMobilityParticipant;
import ua.kpi.fpm.studentsmobility.view.View;

/**
 * Created by Anastasia Serhienko on 5/8/16.
 */
public class Controller {
    // The Constants
    /**
     *
     */
    public static final int MIN_COURSE = 1;
    public static final int MAX_COURSE = 6;

    // The Regex
    // «Augusta»
    public static final String REGEX_FIRST_NAME = "^[A-Z][a-z]*$";
    // «Ada»
    public static final String REGEX_MIDDLE_NAME = "^[A-Z][a-z]*$";
    // «Lovelace», «della-Noel», «d'Artagnan», «McCartney», «King-Noel»
    public static final String REGEX_LAST_NAME =
            "^([A-Z]|[a-z]{2,5}-[A-Z]|[a-z]\'[A-Z]|[A-Z][a-z][A-Z])[a-z]+(-[A-Z][a-z]+)?$";
    // «United States of America»
    private static final String REGEX_COUNTRY = "^[A-Z][a-z]+((?! Of) ([A-Z]|[a-z])[a-z]+)*$";
    // «New Hampshire»
    private static final String REGEX_CITY = "^[A-Z][a-z]+((?! Of) ([A-Z]|[a-z])[a-z]+)*$";
    // «NTUU "KPI"»
    public static final String REGEX_INSTITUTION = "^[A-Za-z- \"]+$";
    // «04 Feb 2016»
    private static final String REGEX_DATE =
            "^(([0-2][0-9])|([3][01])) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ((199[0-9])|(2[0-9]{3}))$";
    // «+380(44)666-66-66»
    public static final String REGEX_PHONE = "^\\+[0-9]{3}\\([0-9]{2}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}$";
    // «postbox@com», «a.little.more.unusual98@dept.example.com»
    private static final String REGEX_EMAIL = "^[a-z0-9_-]*(\\.[a-z0-9_-]*)*@([a-z0-9_-]\\.*)*[a-z]{2,6}$";
    // «Lorem ipsum (1998-2000) -> '95.»
    private static final String REGEX_COMMENT = "[A-Za-z0-9_,.;:()<>'\\- ]*";
    // «04129»
    private static final String REGEX_POSTAL_INDEX = "^[0-9]{5}$";
    // «14th Street NW», «Khreshchatyk Street»
    private static final String REGEX_STREET =
            "^([A-Z]* )?([A-Z][a-z]*(-[A-Z][a-z]*)? )*([0-9]{1,5}th )?([A-Z][a-z]*)+( [A-Z]*)?$";
    // «124a»
    private static final String REGEX_HOUSE = "^[0-9]{1,3}[a-z]?$";
    // «1234-1»
    private static final String REGEX_APARTMENT_NUMBER = "^[0-9]{1,4}(-[0-9])?$";

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setLastName(inputNewStringDataWithScanner(sc, REGEX_LAST_NAME, View.INPUT_LAST_NAME,
                View.WRONG_INPUT_LAST_NAME));
        model.setFirstName(inputNewStringDataWithScanner(sc, REGEX_FIRST_NAME, View.INPUT_FIRST_NAME,
                View.WRONG_INPUT_FIRST_NAME));
        model.setMiddleName(inputNewStringDataWithScanner(sc, REGEX_MIDDLE_NAME, View.INPUT_MIDDLE_NAME,
                View.WRONG_INPUT_MIDDLE_NAME));
        // contacts
        model.setMobilePhone(inputNewStringDataWithScanner(sc, REGEX_PHONE, View.INPUT_MOBILE_PHONE,
                View.WRONG_INPUT_PHONE_NUMBER));
        model.setHomePhone(inputNewStringOptionalDataWithScanner(sc, REGEX_PHONE, View.INPUT_HOME_PHONE,
                View.WRONG_INPUT_PHONE_NUMBER));
        model.setEmail(inputNewStringDataWithScanner(sc, REGEX_EMAIL, View.INPUT_EMAIL, View.WRONG_INPUT_EMAIL));
        // home address
        model.setHomePostalIndex(inputNewStringDataWithScanner(sc, REGEX_POSTAL_INDEX, View.INPUT_HOME_ADDRESS +
                View.INPUT_POSTAL_INDEX, View.WRONG_INPUT_POSTAL_INDEX));
        model.setHomeCountry(inputNewStringDataWithScanner(sc, REGEX_COUNTRY, View.INPUT_COUNTRY,
                View.WRONG_INPUT_COUNTRY));
        model.setHomeCity(inputNewStringDataWithScanner(sc, REGEX_CITY, View.INPUT_CITY,
                View.WRONG_INPUT_CITY));
        model.setHomeStreet(inputNewStringDataWithScanner(sc, REGEX_STREET, View.INPUT_STREET,
                View.WRONG_INPUT_STREET));
        model.setHomeHouse(inputNewStringDataWithScanner(sc, REGEX_HOUSE, View.INPUT_HOUSE,
                View.WRONG_INPUT_HOUSE_NUMBER));
        model.setHomeApartmentNumber(inputNewStringOptionalDataWithScanner(sc, REGEX_APARTMENT_NUMBER,
                View.INPUT_APARTMENT_NUMBER, View.WRONG_INPUT_APARTMENT_NUMBER));
        // faculty and course in KPI
        model.setFaculty(inputFaculty(sc));
        model.setCourse(inputCourse(sc));
        // mobility program type, information about foreign university
        model.setProgramType(inputProgramType(sc));
        model.setInstitutionCountry(inputNewStringDataWithScanner(sc, REGEX_COUNTRY, View.INPUT_INSTITUTION +
                View.INPUT_COUNTRY, View.WRONG_INPUT_COUNTRY));
        model.setInstitutionCity(inputNewStringDataWithScanner(sc, REGEX_CITY, View.INPUT_CITY, View.WRONG_INPUT_CITY));
        model.setInstitutionName(inputNewStringDataWithScanner(sc, REGEX_INSTITUTION, View.INPUT_INSTITUTION_NAME,
                View.WRONG_INPUT_INSTITUTION_NAME));
        model.setDepartureDate(inputNewStringDataWithScanner(sc, REGEX_DATE, View.INPUT_DEPARTURE_DATE,
                View.WRONG_INPUT_DATE));
        model.setArriveDate(inputNewStringDataWithScanner(sc, REGEX_DATE, View.INPUT_ARRIVE_DATE,
                View.WRONG_INPUT_DATE));
        model.setComment(inputNewStringOptionalDataWithScanner(sc, REGEX_COMMENT, View.INPUT_COMMENT,
                View.WRONG_INPUT_COMMENT));
    }

    // The Utility methods
    public String inputNewStringDataWithScanner(Scanner sc, String template, String requestMessage,
                                                String errorMessage) {
        view.printMessage(requestMessage);
        String inputValue = sc.nextLine().trim();

        while (!Pattern.matches(template, inputValue)) {
            view.printMessage(errorMessage + requestMessage);
            inputValue = sc.nextLine().trim();
        }

        return inputValue;
    }

    // function for optional fields
    public String inputNewStringOptionalDataWithScanner(Scanner sc, String template, String requestMessage,
                                                        String errorMessage) {
        view.printMessage(requestMessage);
        String inputValue = sc.nextLine().trim();

        while (!inputValue.equals("") && !Pattern.matches(template, inputValue)) {
            view.printMessage(errorMessage + requestMessage);
            inputValue = sc.nextLine().trim();
        }

        return inputValue;
    }

    public int inputIntDataWithScanner(Scanner sc, String requestMessage, String errorMessage) {
        view.printMessage(requestMessage);
        while( ! sc.hasNextInt()) {
            view.printMessage(errorMessage + requestMessage);
            sc.next();
        }
        return sc.nextInt();
    }

    private Faculty inputFaculty(Scanner sc) {
        Faculty[] faculties = Faculty.values();

//        StringBuilder sb = new StringBuilder();
//        sb.append('(');
//        for (Faculty faculty : faculties) {
//            sb.append(faculty.name()).append(" = ").append(faculty.ordinal()).append(',');
//        }
//        sb.replace(sb.length() - 1, sb.length() - 1, ")");

        int facultyNumber;// = inputIntDataWithScanner(sc, View.INPUT_FACULTY/* + sb.toString()*/, View.WRONG_INPUT_FACULTY);

        while ((facultyNumber = inputIntDataWithScanner(sc, View.INPUT_FACULTY, View.WRONG_INPUT_FACULTY) - 1) < 0
                || facultyNumber >= faculties.length) {
            view.printMessage(View.WRONG_INPUT_FACULTY);
        }

        return faculties[facultyNumber];
    }

    private int inputCourse(Scanner sc) {
        int course;

        while ((course = inputIntDataWithScanner(sc, View.INPUT_COURSE, View.WRONG_INPUT_COURSE)) < MIN_COURSE
                || course >= MAX_COURSE) {
            view.printMessage(View.WRONG_INPUT_COURSE);
        }

        return course;
    }

    private MobilityProgramType inputProgramType(Scanner sc) {
        MobilityProgramType[] programTypes = MobilityProgramType.values();
        int programType;

        while ((programType = inputIntDataWithScanner(sc, View.INPUT_PROGRAM_TYPE, View.WRONG_INPUT_PROGRAM_TYPE) - 1) < 0
                || programType >= programTypes.length) {
            view.printMessage(View.WRONG_INPUT_PROGRAM_TYPE);
        }

        return programTypes[programType];
    }
}
