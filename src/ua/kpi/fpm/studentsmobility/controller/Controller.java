package ua.kpi.fpm.studentsmobility.controller;

import  java.util.Scanner;
import  java.util.regex.Pattern;

import ua.kpi.fpm.studentsmobility.model.AcademicMobilityParticipant;
import ua.kpi.fpm.studentsmobility.view.View;

/**
 * Created by Anastasia Serhienko on 5/8/16.
 */
public class Controller {
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
    private static final String REGEX_COMMENT = "[A-Za-z0-9_-,\\(\\)<>' ]";

    // Constructor
    AcademicMobilityParticipant participant;
    View view;

    public Controller(AcademicMobilityParticipant participant, View view) {
        this.participant  = participant;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        String lastName = inputNewStringDataWithScanner(sc, REGEX_LAST_NAME, View.INPUT_LAST_NAME,
                View.WRONG_INPUT_INT_DATA);
        String firstName = inputNewStringDataWithScanner(sc, REGEX_FIRST_NAME, View.INPUT_FIRST_NAME,
                View.WRONG_INPUT_INT_DATA);
        String middleName = inputNewStringDataWithScanner(sc, REGEX_MIDDLE_NAME, View.INPUT_MIDDLE_NAME,
                View.WRONG_INPUT_INT_DATA);
        String mobilePhone = inputNewStringDataWithScanner(sc, REGEX_PHONE, View.INPUT_MOBILE_PHONE,
                View.WRONG_INPUT_INT_DATA);
        String homePhone = inputNewStringDataWithScanner(sc, REGEX_PHONE, View.INPUT_HOME_PHONE,
                View.WRONG_INPUT_INT_DATA);
        String email = inputNewStringDataWithScanner(sc, REGEX_EMAIL, View.INPUT_EMAIL, View.WRONG_INPUT_INT_DATA);
        String comment = inputNewStringOptionalDataWithScanner(sc, REGEX_COMMENT, View.INPUT_COMMENT,
                View.WRONG_INPUT_INT_DATA);
        // faculty
        // course
        // mobility program type
        String country = inputNewStringDataWithScanner(sc, REGEX_COUNTRY, View.INPUT_COUNTRY,
                View.WRONG_INPUT_INT_DATA);
        String city = inputNewStringDataWithScanner(sc, REGEX_CITY, View.INPUT_CITY,
                View.WRONG_INPUT_INT_DATA);
        String institution = inputNewStringDataWithScanner(sc, REGEX_INSTITUTION, View.INPUT_INSTITUTION,
                View.WRONG_INPUT_INT_DATA);
        String departure = inputNewStringDataWithScanner(sc, REGEX_DATE, View.INPUT_DEPARTURE_DATE,
                View.WRONG_INPUT_INT_DATA);
        String arrive = inputNewStringDataWithScanner(sc, REGEX_DATE, View.INPUT_ARRIVE_DATE,
                View.WRONG_INPUT_INT_DATA);

        participant.setLastName(lastName);
        participant.setFirstName(firstName);
        participant.setMiddleName(middleName);
        participant.setUnivCountry(country);
        participant.setUnivCity(city);
        participant.setUniv(institution);
        participant.setDepartureDate(departure);
        participant.setArriveDate(arrive);
        participant.setMobilePhone(mobilePhone);
        participant.setHomePhone(homePhone);
        participant.setEmail(email);
        participant.setComment(comment);

        System.out.printf("%s %s %s %s %s %s %s %s %s %s %s %s", participant.getLastName(), participant.getFirstName(),
                participant.getMiddleName(), participant.getUnivCountry(), participant.getUnivCity(),
                participant.getUniv(), participant.getDepartureDate(), participant.getArriveDate(),
                participant.getMobilePhone(), participant.getHomePhone(), participant.getEmail(),
                participant.getComment());

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

        while (true) {
            if (inputValue.equals("")) {
                break;
            } else {
                if (!Pattern.matches(template, inputValue)) {
                    view.printMessage(errorMessage + requestMessage);
                    inputValue = sc.nextLine().trim();
                } else {
                    break;
                }
            }
        }

        return inputValue;
    }
}
