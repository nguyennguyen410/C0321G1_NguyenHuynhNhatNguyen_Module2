package manager;

import common.FunctionWriteAndRead;
import controllers.MainController;
import exception.*;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.*;

public class ManagerCustomer {

    public void addNewCustomer() {
        String nameCustomer = null;
        String birthDay = null;
        String sex = null;
        String idCard = null;
        String mobile = null;
        String email = null;
        String typeCustomer = null;
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        System.out.println("Add Customer: ");
        do {
            try {
                System.out.println("Input name customer: ");
                nameCustomer = scanner.nextLine();
                NameCheck nameCheck = new NameCheck();
                check = nameCheck.checkName(nameCustomer);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);

        do {
            try {
                System.out.println("Input birthday: ");
                birthDay = scanner.nextLine();
                BirthdayCheck birthdayCheck = new BirthdayCheck();
                check = birthdayCheck.checkBirthday(birthDay);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);


        do {
            try {
                System.out.println("Input sex: ");
                sex = scanner.nextLine();
                GenderCheck genderCheck = new GenderCheck();
                check = genderCheck.checkGender(sex);
                sex = genderCheck.fixGender(sex);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);

        do {
            try {
                System.out.println("Input idCard: ");
                idCard = scanner.nextLine();
                IdCardCheck idCardCheck = new IdCardCheck();
                check = idCardCheck.checkIdCard(idCard);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);

        do {
            try {
                System.out.println("Input mobile: ");
                mobile = scanner.nextLine();
                MobileCheck mobileCheck = new MobileCheck();
                check = mobileCheck.checkMobile(mobile);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);


        do {
            try {
                System.out.println("Input Email: ");
                email = scanner.nextLine();
                EmailCheck emailCheck = new EmailCheck();
                check = emailCheck.checkName(email);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);

        do {
            try {
                System.out.println("Input type customer: ");
                typeCustomer = scanner.nextLine();
                TypeCustomerCheck typeCustomerCheck = new TypeCustomerCheck();
                check = typeCustomerCheck.checkTypeCustomer(typeCustomer);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!check);


        Customer customer = new Customer(nameCustomer, birthDay, sex, idCard, mobile, email, typeCustomer);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\customer", customer.showInfor());
        System.out.println("Customer added");
    }

    public void showInformationCustomer() {
        List<Customer> listCustomer = sortCustomer();
        System.out.println("All Customer: ");
        for (Customer list : listCustomer) {
            System.out.println(list.toString());
        }
    }

    public List<Customer> sortCustomer() {
        List<Customer> listCustomer = new ArrayList<>();
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        listCustomer = functionWriteAndRead.readFileCustomer("src\\data\\customer");
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                int sort = o1.getNameCustomer().compareTo(o2.getNameCustomer());
                if (sort != 0) {
                    return sort;
                } else {
                    String[] year1 = o1.getBirthDay().split("/");
                    String[] year2 = o2.getBirthDay().split("/");
                    return Integer.parseInt(year1[2]) - Integer.parseInt(year2[2]);
                }

            }
        });
        return listCustomer;
    }

    public void addNewBooking() {
        List<Customer> list = new ArrayList<>();
        Customer customer;
        Villa villa;
        House house;
        Room room;
        list = sortCustomer();
        System.out.println("Choose Customer: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i) + ":" + list.get(i).toString());
        }
        Scanner scanner = new Scanner(System.in);
        int indexCustomer = scanner.nextInt();
        customer = list.get(indexCustomer);
        MainController mainController = new MainController();
        int input = mainController.showServicesForCustomer();
        switch (input) {
            case 1:
                addVillaForCustomer(customer, scanner);
                break;
            case 2:
                addHouseForCustomer(customer, scanner);
                break;
            case 3:
                addRoomForCustomer(customer, scanner);
                break;
            case 4:
                buyTicketCinema();
                break;

            case 5:
                mainController.displayMainMenu();
                break;
        }
    }


    public void buyTicketCinema() {
        Customer customer;
        List<Customer> listCustomer = new ArrayList<>();
        listCustomer = sortCustomer();
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        Queue<Customer> queue = new ArrayDeque<>();
        int count = 0;
        List<Customer> customersBuyTicket = functionWriteAndRead.readFileCustomer("src\\data\\ticket");
        for (Customer customer1 : customersBuyTicket) {
            count++;
        }

        System.out.println("Choose Customer: ");
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println((i) + ":" + listCustomer.get(i).toString());
        }
        Scanner scanner = new Scanner(System.in);
        int indexCustomer = scanner.nextInt();
        customer = listCustomer.get(indexCustomer);

        if (count <= 2) {
            queue.add(customer);
            System.out.println("Buy ticket Success");
            System.out.println(queue.peek().toString());
            functionWriteAndRead.writeFile("src\\data\\ticket", customer.toString());
            count++;
        } else {
            System.out.println("Sold Out: ");
            System.out.println("List Customer Buy Success");
            for (Customer customerCine : customersBuyTicket) {
                System.out.println(customerCine.toString());
            }
        }

    }

    public void addRoomForCustomer(Customer customer, Scanner scanner) {
        Room room;
        List<Room> rooms = new FunctionWriteAndRead().readFileRoom("src\\data\\room");
        System.out.println("Choose Room: ");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(i + ":" + rooms.get(i).toString());
        }
        Scanner scanner3 = new Scanner(System.in);
        int indexRoom = scanner.nextInt();
        room = rooms.get(indexRoom);
        customer.setTypeService(room);

        FunctionWriteAndRead writeBooking2 = new FunctionWriteAndRead();
        writeBooking2.writeFile("src\\data\\booking", ", " + customer.showInfor() + customer.getTypeService().showInfor());
    }

    public void addHouseForCustomer(Customer customer, Scanner scanner) {
        House house;
        List<House> houses = new FunctionWriteAndRead().readFileHouse("src\\data\\house");
        System.out.println("Choose House: ");
        for (int i = 0; i < houses.size(); i++) {
            System.out.println(i + ":" + houses.get(i).toString());
        }
        Scanner scanner2 = new Scanner(System.in);
        int indexHouse = scanner.nextInt();
        house = houses.get(indexHouse);
        customer.setTypeService(house);

        FunctionWriteAndRead writeBooking1 = new FunctionWriteAndRead();
        writeBooking1.writeFile("src\\data\\booking", ", " + customer.showInfor() + customer.getTypeService().showInfor());
    }

    public void addVillaForCustomer(Customer customer, Scanner scanner) {
        Villa villa;
        List<Villa> villas = new FunctionWriteAndRead().readFileVilla("src\\data\\villa");
        System.out.println("Choose Villa: ");
        for (int i = 0; i < villas.size(); i++) {
            System.out.println(i + ":" + villas.get(i).toString());
        }
        Scanner scanner1 = new Scanner(System.in);
        int indexVilla = scanner.nextInt();
        villa = villas.get(indexVilla);
        customer.setTypeService(villa);
        FunctionWriteAndRead writeBooking = new FunctionWriteAndRead();
        writeBooking.writeFile("src\\data\\booking", ", " + customer.showInfor() + customer.getTypeService().showInfor());
    }
}
