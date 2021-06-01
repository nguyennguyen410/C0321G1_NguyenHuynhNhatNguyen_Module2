package views;

import controllers.MainController;
import manager.*;

public class Main {
    public static void main(String[] args) {
        int input;
        MainController mainController = new MainController();
        do {
            input = mainController.displayMainMenu();
            switch (input) {
                case 1:
                    int input1 = mainController.addNewServices();
                    switch (input1) {
                        case 1:
                            ManagerVilla managerVilla = new ManagerVilla();
                            managerVilla.addNewVilla();
                            mainController.displayMainMenu();
                            break;
                        case 2:
                            ManagerHouse managerHouse = new ManagerHouse();
                            managerHouse.addNewHouse();
                            mainController.displayMainMenu();
                            break;
                        case 3:
                            ManagerRoom managerRoom = new ManagerRoom();
                            managerRoom.addNewRoom();
                            mainController.displayMainMenu();
                            break;
                        case 4:
                            ManagerOtherServices managerOtherServices = new ManagerOtherServices();
                            managerOtherServices.addNewOtherService();
                            mainController.displayMainMenu();
                            break;
                        case 5:
                            mainController.displayMainMenu();
                            break;
                        case 6:
                            break;
                    }
                case 2:
                    int input2 = mainController.showServices();
                    switch (input2) {
                        case 1:
                            ManagerVilla managerVilla = new ManagerVilla();
                            managerVilla.showAllVilla();
                            break;
                        case 2:
                            ManagerHouse managerHouse = new ManagerHouse();
                            managerHouse.showAllHouse();
                            break;
                        case 3:
                            ManagerRoom managerRoom = new ManagerRoom();
                            managerRoom.showAllRoom();
                            break;
                        case 4:

                        case 5:

                        case 6:
                        case 7:
                            mainController.displayMainMenu();
                            break;
                        case 8:
                            break;

                    }
                case 3:
                    ManagerCustomer managerCustomer = new ManagerCustomer();
                    managerCustomer.addNewCustomer();
                    break;
                case 4:
                    ManagerCustomer managerCustomer1 = new ManagerCustomer();
                    managerCustomer1.showInformationCustomer();
                    break;
            }
        } while (input != 7);


    }
}
