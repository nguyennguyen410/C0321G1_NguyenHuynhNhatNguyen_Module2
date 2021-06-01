package manager;

import common.FunctionWriteAndRead;
import models.OtherService;
import models.Room;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class ManagerOtherServices {
    public void addNewOtherService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New Other Services: ");
        System.out.println("Id: ");
        String id = scanner.nextLine();

        System.out.println("Name Service: ");
        String nameService = scanner.nextLine();

        System.out.println("Price: ");
        String price = scanner.nextLine();

        OtherService otherService = new OtherService(id, nameService, price);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\other_services", otherService.toString());
        System.out.println("Other Service added");
    }
}
