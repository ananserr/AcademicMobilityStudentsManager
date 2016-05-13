package ua.kpi.fpm.studentsmobility;

import ua.kpi.fpm.studentsmobility.controller.Controller;
import ua.kpi.fpm.studentsmobility.model.Model;
import ua.kpi.fpm.studentsmobility.view.View;

/**
 * Created by Anastasia Serhienko on 5/7/16.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.processUser();
    }
}
