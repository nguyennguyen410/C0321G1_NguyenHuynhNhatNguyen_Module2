package manager;

import common.FunctionWriteAndRead;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerRoom {
    List<String> listRoom = new ArrayList<>();

    public void addNewRoom() {
        String id, nameService, area, price, maxPeople, rentType, freeService;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New Room: ");
        do {
            System.out.println("Id Room: ");
            id = scanner.nextLine();
            ManagerRoom managerRoom = new ManagerRoom();
            check = managerRoom.regexIdRoom(id);
            if (!check){
                System.err.println("Id Room is not invalid");
            }
        }while (!check);

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


        System.out.println("Free Service: ");
        freeService = scanner.nextLine();



        Room room = new Room(id, nameService, area, price, maxPeople, rentType, freeService);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\room", room.showInfor());
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

    public boolean regexIdRoom(String regex){
        final String ROOM_REGEX = "^SVRO\\-[0-9]{4}$";
        Pattern pattern = Pattern.compile(ROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public void showNameRoomNotDup(){
        TreeSet<Room> treeSet = new TreeSet<Room>();
        List<Room> list = new FunctionWriteAndRead().readFileRoom("src\\data\\room");
        treeSet.addAll(list);
        for (Room room:treeSet){
            System.out.println(room.toString());
        }
    }
}

