package manager;

import common.FunctionWriteAndRead;
import models.House;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerHouse {
    List<String> listHouse = new ArrayList<>();

    public void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New House: ");
        System.out.println("Id: ");
        String id = scanner.next();

        System.out.println("Name Service: ");
        String nameService = scanner.next();

        System.out.println("Area: ");
        String area = scanner.next();

        System.out.println("Price: ");
        String price = scanner.next();

        System.out.println("Max People:");
        String maxPeople = scanner.next();

        System.out.println("Rent Type: ");
        String rentType = scanner.next();

        System.out.println("Type House: ");
        String typeHouse = scanner.next();


        System.out.println("Number Floor Of House: ");
        String numFloor = scanner.next();

        House house = new House(id, nameService, area, price, maxPeople, rentType, typeHouse, numFloor);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\house", house.toString());
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
}
