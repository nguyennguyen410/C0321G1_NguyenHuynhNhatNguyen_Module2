package views;

import controllers.MainController;
import manager.*;

public class Main {
    public static void main(String[] args) {
        int input;
        MainController mainController = new MainController();
        ManagerVilla managerVilla = new ManagerVilla();
        ManagerHouse managerHouse = new ManagerHouse();
        ManagerRoom managerRoom = new ManagerRoom();
        ManagerOtherServices managerOtherServices = new ManagerOtherServices();
        ManagerCustomer managerCustomer = new ManagerCustomer();
        do {
            input = mainController.displayMainMenu();
            switch (input) {
                case 1:
                    int input1 = mainController.addNewServices();
                    switch (input1) {
                        case 1:
                            managerVilla.addNewVilla();
                            break;
                        case 2:
                            managerHouse.addNewHouse();
                            break;
                        case 3:
                            managerRoom.addNewRoom();
                            break;
                        case 4:
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
                            managerVilla.showAllVilla();
                            break;
                        case 2:
                            managerHouse.showAllHouse();
                            break;
                        case 3:
                            managerRoom.showAllRoom();
                            break;
                        case 4:
                            managerVilla.showNameVillaNotDup();
                            break;
                        case 5:
                            managerHouse.showNameHouseNotDup();
                            break;
                        case 6:
                            managerRoom.showNameRoomNotDup();
                            break;
                        case 7:
                            mainController.displayMainMenu();
                            break;
                        case 8:
                            break;

                    }
                    break;
                case 3:
                    managerCustomer.addNewCustomer();
                    break;
                case 4:
                    managerCustomer.showInformationCustomer();
                    break;
                case 5:
                    managerCustomer.addNewBooking();
                    break;
                case 6:
                    ManagerEmployee managerEmployee = new ManagerEmployee();
                    managerEmployee.showEmployee();
                    break;
                case 7:
                    int inputTicket = mainController.showBuyTicket();
                    switch (inputTicket) {
                        case 1:
                            managerCustomer.buyTicketCinema();
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
                    int input4 = mainController.showEditServices();
                    switch (input4) {
                        case 1:
                            int input5 = mainController.showMenuEditServices();
                            switch (input5) {
                                case 1:
                                    managerVilla.editVilla();
                                    break;
                            }
                            break;
                        case 2:
                            int input6 = mainController.showMenuDeleteServices();
                            switch (input6){
                                case 1:
                                    managerVilla.deleteVilla();
                                    break;
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 10:
                    break;
            }
        } while (input != 9);

    }
}
