package ua.kpi.fpm.studentsmobility.view;

/**
 * Created by Anastasia Serhienko on 5/8/16.
 */
public class View {
    // Text's constants
    public static final String WRONG_A_COEF = "Wrong coefficient A. It shouldn't be equal 0. Try once more, please.";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! It must be integer. Repeat please. ";
    public static final String COEFS_OUTPUT_FORMAT = "Square equation with coefficients %d, %d, %d has roots: ";
    public static final String INPUT_LAST_NAME = "Input last name: ";
    public static final String INPUT_FIRST_NAME = "Input first name: ";
    public static final String INPUT_MIDDLE_NAME = "Input middle name: ";
    public static final String INPUT_COUNTRY = "Input country: ";
    public static final String INPUT_INSTITUTION = "Input educational institution: ";
    public static final String INPUT_DEPARTURE_DATE = "Input departure date: ";
    public static final String INPUT_ARRIVE_DATE = "Input arrive date: ";
    public static final String INPUT_MOBILE_PHONE = "Input mobile phone: ";
    public static final String INPUT_HOME_PHONE = "Input home phone (optional): ";
    public static final String INPUT_EMAIL = "Input e-mail: ";
    public static final String INPUT_COMMENT = "Input comment (optional): ";
    public static final String INPUT_HOME_ADDRESS = "Input home address.\n ";
    public static final String INPUT_POSTAL_INDEX = "postal index: ";
    public static final String INPUT_CITY = "city: ";
    public static final String INPUT_STREET = "street: ";
    public static final String INPUT_HOUSE = "house: ";
    public static final String INPUT_APARTMENT_NUMBER = "apartment number (optional): ";
    public static final String INPUT_FACULTY = "Input faculty (type 1 for FAKS, 2 - FBE, 3 - FBT, 4 - FEA, 5 - FEL, " +
            "6 - FIOT, 7 - FL, 8 - FMM, 9 - FMF, 10 - FPM, 11 - FSP, 12 - IASA, 13 - IEE, 14 - IFF, 15 - IHF, " +
            "16 - ISZZI, 17 - IPT, 18 - ITS, 19 - MMI, 20 - PBF, 21 - RTF, 22 - TEF, 23 - VPI, 24 - XTF, 25 - ZF): ";
    public static final String WRONG_INPUT_LAST_NAME = "Wrong last name format. Example: Lovelace, della-Noel, " +
            "d'Artagnan, McCartney, King-Noel. ";
    public static final String WRONG_INPUT_FIRST_NAME = "Wrong first name format. Example: Augusta, John, Maria. ";
    public static final String WRONG_INPUT_MIDDLE_NAME =
            "Wrong middle name format. Example: Ada, Valeryevna, Ivanovych. ";
    public static final String WRONG_INPUT_PHONE_NUMBER = "Wrong phone number format. Example: +380(44)666-66-66. ";
    public static final String WRONG_INPUT_EMAIL =
            "Wrong email format. Example: postbox@com, a.little.more.unusual98@dept.example.com. ";
    public static final String WRONG_INPUT_POSTAL_INDEX = "Wrong postal index format. Example: 04144. ";
    public static final String WRONG_INPUT_CITY = "Wrong city format. Example: New Hampshire. ";
    public static final String WRONG_INPUT_STREET = "Wrong street format. Example: 14th Street NW, Khreshchatyk Street";
    public static final String WRONG_INPUT_HOUSE_NUMBER = "Wrong house number format. Example: 144b. ";
    public static final String WRONG_INPUT_APARTMENT_NUMBER = "Wrong apartment number format. Example: 1234-1. ";

    public void printMessage(String message){
        System.out.println(message);
    }
}
