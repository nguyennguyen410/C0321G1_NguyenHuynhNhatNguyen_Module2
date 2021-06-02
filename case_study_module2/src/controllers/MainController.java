package controllers;

import java.util.Scanner;

public class MainController {
    public int displayMainMenu() {
        int input;
        System.out.println("Choose Menu: \n"
                + "1. Add New Services \n"
                + "2. Show Services \n"
                + "3. Add New Customer \n"
                + "4. Show Information Of Customer \n"
                + "5. Add New Booking \n"
                + "6. Show Information Of Employee \n"
                + "7. Buy Ticket \n"
                + "8. Search Employee \n"
                + "9. Exit \n");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        return input;
    }

    public int addNewServices() {
        int input;
        System.out.println("Choose Menu: \n"
                + "1. Add New Villa \n"
                + "2. Add New House \n"
                + "3. Add New Room \n"
                + "4. Add New Other Service \n"
                + "5. Back To Menu \n"
                + "6. Exit \n");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        return input;
    }

    public int showServices() {
        int input;
        System.out.println("Choose Menu: \n"
                + "1. Show All Villa \n"
                + "2. Show All House \n"
                + "3. Show All Room \n"
                + "4. Show All Name Villa Not Duplicate \n"
                + "5. Show All Name House Not Duplicate \n"
                + "5. Show All Name Room Not Duplicate \n"
                + "6. Exit \n");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        return input;
    }

    public int showServicesForCustomer() {
        int input;
        System.out.println("Choose Menu: \n"
                + "1. Booking Villa \n"
                + "2. Booking House \n"
                + "3. Booking Room \n"
                + "4. Booking Ticket Cinema \n"
                + "5. Exit \n");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        return input;
    }

    public int showBuyTicket() {
        int input;
        System.out.println("Choose Menu: \n"
                + "1. Buy Ticket \n"
                + "2. Back to Menu \n"
                );
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        return input;
    }
}
