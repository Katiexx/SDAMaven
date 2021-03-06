package pl.sda.mvc.view;

import pl.sda.mvc.controller.Controller;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-25.
 */
public class View {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer choice = scanner.nextInt();
            Controller controller = new Controller();
            if (choice != null && choice > 0) {
                long result = controller.getFibValue(choice);
                System.out.println("FIB = " + result);
            } else {
                System.out.println("AVG = " + controller.average());
            }
        }
    }
}
