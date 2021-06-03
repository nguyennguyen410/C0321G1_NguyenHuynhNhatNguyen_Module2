package manager;

import common.FunctionWriteAndRead;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerVilla {
    List<String> listVilla = new ArrayList<>();

    public void addNewVilla() {
        boolean check = false;
        String id;
        String nameService;
        String areaPool;
        String area;
        String price;
        String maxPeople;
        String numFloor;
        /*String otherService;*/
        String typeVilla;
        String rentType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New Villa: ");
        do {
            System.out.println("Id (SVVL-YYYY with Y from 0-9): ");
            id = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexIdVilla(id);
            if(!check){
                System.err.println("Id is not invalid");
            }
        }while(!check);

        do {
            System.out.println("Name Service (First word is upcase): ");
            nameService = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexNameService(nameService);
            if(!check){
                System.err.println("Name Service is not invalid");
            }
        }while (!check);


        do {
            System.out.println("Area (type double and over 30): ");
            area = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexArea(area);
            if(!check){
                System.err.println("Area is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Price (price > 0): ");
            price = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexPrice(price);
            if(!check){
                System.err.println("Price is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Max People (over zero and under twenty):");
            maxPeople = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexPeople(maxPeople);
            if(!check){
                System.err.println("Max People is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Rent Type (ShortDay or LongDay): ");
            rentType = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexRentType(rentType);
            if(!check){
                System.err.println("Rent Type is not invalid");
            }
        }while (!check);


        do {
            System.out.println("Type Villa: ");
            typeVilla = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexTypeVilla(typeVilla);
            if(!check){
                System.err.println("Type Villa is not invalid");
            }
        }while (!check);


        do {
            System.out.println("Area Pool (type float or double)");
            areaPool = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexArea(areaPool);
            if(!check){
                System.err.println("AreaPool is not invalid");
            }
        }while (!check);

        do {
            System.out.println("Number Floor Of Villa: ");
            numFloor = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexFloor(numFloor);
            if(!check){
                System.err.println("Number Floor is not invalid");
            }
        }while (!check);

        /*do {
            System.out.println("other service: ");
            otherService = scanner.nextLine();
            ManagerVilla managerVilla = new ManagerVilla();
            check = managerVilla.regexOtherServices(otherService);
            if(!check){
                System.err.println("Other services is not invalid");
            }
        }while (!check);*/


        Villa villa = new Villa(id, nameService, area, price, maxPeople, rentType, typeVilla, areaPool, numFloor);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\villa", villa.showInfor());
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

    public boolean regexArea(String regex){
        final String AREA_POOL_REGEX = "^[0-9]*\\.[0-9]+$";
        Pattern pattern = Pattern.compile(AREA_POOL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean regexPrice(String regex){
        final String PRICE_REGEX = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(PRICE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean regexPeople(String regex){
        final String PEOPLE_REGEX = "^[0-9][0-9]$";
        Pattern pattern = Pattern.compile(PEOPLE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean regexFloor(String regex){
        final String FLOOR_REGEX = "^[0-9]+$";
        Pattern pattern = Pattern.compile(FLOOR_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    /*public boolean regexOtherServices(String regex){
        final String OTHER_SERVICES_REGEX = "^[Massage|Karaoke|Food|Water|Car|Not]$";
        Pattern pattern = Pattern.compile(OTHER_SERVICES_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }*/

    public boolean regexTypeVilla(String regex){
        final String TYPE_VILLA_REGEX = "^([K][i][n][g])|([Q][u][e][e][n])|([V][i][p])$";
        Pattern pattern = Pattern.compile(TYPE_VILLA_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean regexRentType(String regex){
        final String RENT_TYPE_REGEX = "^([S][h][o][r][t][D][a][y])|([L][o][n][g][D][a][y])$";
        Pattern pattern = Pattern.compile(RENT_TYPE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean regexNameService(String regex){
        final String NAME_SERVICE_REGEX = "^[A-Z][a-z0-9]*$";
        Pattern pattern = Pattern.compile(NAME_SERVICE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public void showNameVillaNotDup(){
        TreeSet<Villa> treeSet = new TreeSet<Villa>();
        List<Villa> list = new FunctionWriteAndRead().readFileVilla("src\\data\\villa");
        treeSet.addAll(list);
        for (Villa villa:treeSet){
            System.out.println(villa.toString());
        }
    }
}
