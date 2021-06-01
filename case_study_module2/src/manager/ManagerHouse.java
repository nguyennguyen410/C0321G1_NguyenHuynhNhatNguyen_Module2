package manager;

import common.FunctionWriteAndRead;
import models.House;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerHouse {
    List<String> listHouse = new ArrayList<>();

    public void addNewHouse() {
        String id, nameService, area, price, maxPeople, rentType, typeHouse, numFloor;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New House: ");

        do {
            System.out.println("Id: ");
            id = scanner.nextLine();
            ManagerHouse managerHouse = new ManagerHouse();
            check = managerHouse.regexIdHouse(id);
            if (!check) {
                System.err.println("Id House is not invalid");
            }
        } while (!check);


        do {
            System.out.println("Name Service: ");
            nameService = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexNameService(nameService);
            if(!check){
                System.err.println("Name Service is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Area: ");
            area = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexArea(area);
            if(!check){
                System.err.println("Area is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Price: ");
            price = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexPrice(price);
            if(!check){
                System.err.println("Price is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Max People:");
            maxPeople = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexPeople(maxPeople);
            if(!check){
                System.err.println("Max People is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Rent Type: ");
            rentType = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexRentType(rentType);
            if(!check){
                System.err.println("Rent Type is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Type House: ");
            typeHouse = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexTypeVilla(typeHouse);
            if(!check){
                System.err.println("Type House is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Number Floor Of House: ");
            numFloor = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexFloor(numFloor);
            if(!check){
                System.err.println("Number Floor is not invalid");
            }
        }while (!check);

        House house = new House(id, nameService, area, price, maxPeople, rentType, typeHouse, numFloor);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\house", house.showInfor());
        System.out.println("House added");
    }

    public void showAllHouse() {
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        listHouse = functionWriteAndRead.readFile("src\\data\\house");
        System.out.println("All House: ");
        for (String list : listHouse) {
            System.out.println(list.toString());
        }
    }

    public boolean regexIdHouse(String regex) {
        final String ID_HOUSE_REGEX = "^SVHO\\-[0-9]{4}$";
        Pattern pattern = Pattern.compile(ID_HOUSE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
