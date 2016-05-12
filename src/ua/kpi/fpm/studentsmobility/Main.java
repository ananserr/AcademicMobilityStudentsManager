package ua.kpi.fpm.studentsmobility;

import ua.kpi.fpm.studentsmobility.controller.Controller;
import ua.kpi.fpm.studentsmobility.model.AcademicMobilityParticipant;
import ua.kpi.fpm.studentsmobility.model.ParticipantsList;
import ua.kpi.fpm.studentsmobility.view.View;

/**
 * Created by Anastasia Serhienko on 5/7/16.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        ParticipantsList participantsList = new ParticipantsList();
        AcademicMobilityParticipant academicMobilityParticipant = new AcademicMobilityParticipant();
        View view = new View();
        Controller controller = new Controller(academicMobilityParticipant, view);

        // Run
        controller.processUser();
    }
}
