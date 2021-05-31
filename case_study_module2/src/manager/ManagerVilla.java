package manager;

import common.FunctionWriteAndRead;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerVilla {
    List<String> listVilla = new ArrayList<>();

    public void addNewVilla() {
        boolean check = false;
        String id;
        Double areaPool;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New Villa: ");
        do {
            System.out.println("Id (SVVL-YYYY with Y from 0-9): ");
            id = scanner.next();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexIdVilla(id);
        }while(!check);

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

        System.out.println("Type Villa: ");
        String typeVilla = scanner.next();

        do {
            System.out.println("Area Pool (type float or double)");
            areaPool = scanner.nextDouble();
            String stringAreaPool = String.valueOf(areaPool);
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexAreaPool(stringAreaPool);
        }while (!check);


        System.out.println("Number Floor Of Villa: ");
        int numFloor = scanner.nextInt();

        System.out.println("other service: ");
        String otherService = scanner.next();

        Villa villa = new Villa(id, nameService, area, price, maxPeople, rentType, typeVilla, areaPool, numFloor);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\villa", villa.toString()+otherService);
        System.out.println("Villa added");
    }

    public void showAllVilla() {
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        listVilla = functionWriteAndRead.readFile("src\\data\\villa");
        System.out.println("All Villa: ");
        for (String list : listVilla) {
            System.out.println(list.toString());
        }
    }

    public boolean regexIdVilla(String regex){
        final String VILLA_REGEX = "^SVVL\\-[0-9]{4}$";
        Pattern pattern = Pattern.compile(VILLA_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean regexAreaPool(String regex){
        final String AREA_POOL_REGEX = "^[0-9]\\.[0-9]+$";
        Pattern pattern = Pattern.compile(AREA_POOL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
