package io_binary_file_serialization.bai_tap.quan_ly_san_pham_ghi_nhi_phan;

import io_binary_file_serialization.thuc_hanh.doc_ghi_danh_sach_sinh_vien.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProducts {

    public static void searchProduct(List<Product> products, Scanner scanner) {
        boolean check = false;
        do {
            System.out.println("Search Product ");
            System.out.println("Input name of Product need to search: ");
            String productNameSearch = scanner.next();
            for (Product productSearch : products) {
                if (productSearch.getNameProduct().equals(productNameSearch)) {
                    check = true;
                    System.out.println(productSearch.toString());
                    break;
                } else {
                    check = false;
                }
            }
            if (!check) {
                System.out.println("Not have Product");
            }
        } while (!check);
    }

    public static void showProduct() {
        System.out.println("List Product");
        List<Product> products = readDataFromFile("C:\\codegym\\CG\\C0321G1_NguyenHuynhNhatNguyen_Module2\\src" +
                "\\io_binary_file_serialization\\bai_tap\\quan_ly_san_pham_ghi_nhi_phan\\product");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void addProduct(List<Product> products, Scanner scanner) throws IOException {
        int idProduct;
        boolean status = false;
        System.out.println("Input ID: ");
        idProduct = scanner.nextInt();
        do {
            for(Product product:products){
                if(product.getIdProduct()==idProduct){
                    System.out.println("Id duplicate");
                    System.out.println("Input ID: ");
                    idProduct = scanner.nextInt();
                    status = true;
                } else {
                    status = false;
                }
            }
        } while (status);

        System.out.println("Input name: ");
        String nameProduct = scanner.next();
        System.out.println("Input price: ");
        Double priceProduct = scanner.nextDouble();
        System.out.println("Input about product: ");
        String aboutProduct = scanner.next();
        System.out.println("Input from of product");
        String productFrom = scanner.next();

        products.add(new Product(idProduct, nameProduct, productFrom, priceProduct, aboutProduct));
        writeToFile(products);
        return;
    }

    public static Integer chooseMenu(Scanner scanner) {
        Integer input;
        System.out.println("Chon danh muc: \n"
                + "1. Them san pham \n"
                + "2. Hien thi san pham \n"
                + "3. Tim kiem san pham \n"
                + "4. Thoat \n");
        input = scanner.nextInt();
        return input;
    }

    public static void writeToFile(List<Product> products) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\codegym\\CG\\C0321G1_NguyenHuynhNhatNguyen_Module2\\src" +
                    "\\io_binary_file_serialization\\bai_tap\\quan_ly_san_pham_ghi_nhi_phan\\product");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
