package manager;

import common.FunctionWriteAndRead;
import exception.*;
import models.Customer;
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
            }catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }while (!check);


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
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (!check);
        
        do {
            try {
                System.out.println("Input mobile: ");
                mobile = scanner.nextLine();
                MobileCheck mobileCheck = new MobileCheck();
                check = mobileCheck.checkMobile(mobile);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (!check);
        

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
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (!check);


        Customer customer = new Customer(nameCustomer, birthDay, sex, idCard, mobile, email, typeCustomer);
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        functionWriteAndRead.writeFile("src\\data\\customer", customer.showInfor());
        System.out.println("Customer added");
    }

    public void showInformationCustomer() {
        List<Customer> listCustomer = new ArrayList<>();
        FunctionWriteAndRead functionWriteAndRead = new FunctionWriteAndRead();
        listCustomer = functionWriteAndRead.readFileCustomer("src\\data\\customer");
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                int sort = o1.getNameCustomer().compareTo(o2.getNameCustomer());
                if(sort !=0){
                    return sort;
                }else {
                    String[] year1 = o1.getBirthDay().split("/");
                    String[] year2 = o2.getBirthDay().split("/");
                    return Integer.parseInt(year1[2]) - Integer.parseInt(year1[2]);
                }

            }
        });
        System.out.println("All Customer: ");
        for (Customer list : listCustomer) {
            System.out.println(list.toString());
        }
    }
}
