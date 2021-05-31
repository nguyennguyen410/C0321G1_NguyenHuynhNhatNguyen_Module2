package manager;

import common.FunctionWriteAndRead;
import models.House;
import models.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerRoom {
    List<String> listRoom = new ArrayList<>();

    public void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New Room: ");
        System.out.println("Id: ");
        String id = scanner.next();

        System.out.println("Name Service: ");
        String nameService = scanner.next();

        System.out.println("Area: ");
        Double area = scanner.nextDouble();

        System.out.println("Price: ");
        int price = scanner.nextInt();

        System.out.println("Max People:");
        int maxPeople = scanner.nextInt();

        System.out.println("Rent Type: ");
        String rentType = scanner.next();

        System.out.println("Type House: ");
        String typeHouse = scanner.next();

        System.out.println("Free Service: ");
        String freeService = scanner.next();

        Room room = new Room(id, nameService, area, price, maxPeople, rentType, freeService);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\room", room.toString());
        System.out.println("Room added");
    }

    public void showAllRoom() {
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        listRoom = functionWriteAndRead.readFile("src\\data\\room");
        System.out.println("All Room: ");
        for (String list : listRoom) {
            System.out.println(list.toString());
        }
    }
}

