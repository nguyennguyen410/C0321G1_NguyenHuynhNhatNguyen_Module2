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
                            break;
                        case 2:
                            ManagerHouse managerHouse = new ManagerHouse();
                            managerHouse.addNewHouse();
                            break;
                        case 3:
                            ManagerRoom managerRoom = new ManagerRoom();
                            managerRoom.addNewRoom();
                            break;
                        case 4:
                            ManagerOtherServices managerOtherServices = new ManagerOtherServices();
                            managerOtherServices.addNewOtherService();
                            break;
                        case 5:
                            mainController.displayMainMenu();
                            break;
                        case 6:
                            break;
                    }
                    break;
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
                            ManagerVilla managerVilla1 = new ManagerVilla();
                            managerVilla1.showNameVillaNotDup();
                            break;
                        case 5:
                            ManagerHouse managerHouse1 = new ManagerHouse();
                            managerHouse1.showNameHouseNotDup();
                            break;
                        case 6:
                            ManagerRoom managerRoom1 = new ManagerRoom();
                            managerRoom1.showNameRoomNotDup();
                            break;
                        case 7:
                            mainController.displayMainMenu();
                            break;
                        case 8:
                            break;

                    }
                    break;
                case 3:
                    ManagerCustomer managerCustomer = new ManagerCustomer();
                    managerCustomer.addNewCustomer();
                    break;
                case 4:
                    ManagerCustomer managerCustomer1 = new ManagerCustomer();
                    managerCustomer1.showInformationCustomer();
                    break;
                case 5:
                    ManagerCustomer managerCustomer2 = new ManagerCustomer();
                    managerCustomer2.addNewBooking();
                    break;
                case 6:
                    ManagerEmployee managerEmployee = new ManagerEmployee();
                    managerEmployee.showEmployee();
                    break;
                case 7:
                    int inputTicket = mainController.showBuyTicket();
                    switch (inputTicket){
                        case 1:
                            ManagerCustomer managerCustomer3 = new ManagerCustomer();
                            managerCustomer3.buyTicketCinema();
                            break;
                        case 2:
                            mainController.displayMainMenu();
                            break;
                    }
                    break;
                case 8:
                    ManagerEmployee managerEmployee3 = new ManagerEmployee();
                    managerEmployee3.searchEmployee();
                    break;
                case 9:
                    break;
            }
        } while (input != 9);

    }
}
