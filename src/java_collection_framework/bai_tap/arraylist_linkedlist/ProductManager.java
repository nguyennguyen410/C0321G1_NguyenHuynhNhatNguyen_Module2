package java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void showList(List<Product> list) {
        System.out.println("Danh sach san pham la: ");
        System.out.println(list.toString());
    }

    public static void sortProduct(List<Product> list) {
        System.out.println("Danh sach gia san pham tang dan: ");
        Collections.sort(list);
        for (Product productSort: list){
            System.out.println(productSort.toString());
        }

        System.out.println("Danh sach gia giam dan: ");
        ComparatorPriceDown comparatorPriceDown = new ComparatorPriceDown();
        Collections.sort(list, comparatorPriceDown );
        for (Product productSort: list){
            System.out.println(productSort.toString());
        }
    }

    public static void searchProduct(List<Product> list, Scanner scanner) {
        boolean check = false;
        do{
            System.out.println("Tim kiem san pham: ");
            System.out.println("Nhap ten san pham");
            String productNameSearch = scanner.next();
            for (Product productSearch: list ){
                if (productSearch.getNameProduct().equals(productNameSearch)){
                    check = true;
                    System.out.println(productSearch.toString());
                    break;
                } else {
                    check = false;
                }
            }
            if(!check){
                System.out.println("Khong co san pham nay");
            }
        }while (!check);

    }

    public static void deleteProduct(List<Product> list, Scanner scanner) {
        System.out.println("Xoa san pham");
        System.out.println("Nhap id san pham can xoa: ");
        String idDelete = scanner.next();
        for (Product productDelete: list){
            if(productDelete.getIdProduct().equals(idDelete)){
                System.out.println("Xoa san pham "+productDelete.getNameProduct()+" gia "
                        +productDelete.getPrice()+ "?"
                        + "\n Nhap 1 de xoa va 0 de huy thao tac.");
                int status = scanner.nextInt();
                if(status==1){
                    list.remove(productDelete);
                } else {
                    return;
                }

            }
        }
    }

    public static void editProduct(List<Product> list, Scanner scanner) {
        System.out.println("Sua san pham");
        System.out.println("Nhap id san pham can sua: ");
        String idEdit = scanner.next();
        System.out.println("Sua ten: ");
        String nameEdit = scanner.next();
        System.out.println("Sua gia: ");
        int priceEdit = scanner.nextInt();
        for (Product productEdit : list) {
            if (productEdit.getIdProduct().equals(idEdit)) {
                productEdit.setNameProduct(nameEdit);
                productEdit.setPrice(priceEdit);
            }
        }
    }

    public static void addProduct(List<Product> list, Scanner scanner) {
        String idProduct;
        String nameProduct;
        Integer priceProduct;
        boolean check = false;
        System.out.println("Them san pham");
        System.out.print("Nhap id: ");
        idProduct = scanner.next();
        do{
            for (Product productCheckID: list){
                if (productCheckID.getIdProduct().equals(idProduct)){
                    System.out.println("Trùng ID");
                    System.out.println("Nhap lai id:");
                    idProduct = scanner.next();
                    check = true;
                } else {
                    check = false;
                }
            }
        }while (check);

        System.out.print("Nhap ten san pham: ");
        nameProduct = scanner.next();
        System.out.print("Nhap gia san pham: ");
        priceProduct = scanner.nextInt();
        Product product = new Product(idProduct, nameProduct, priceProduct);
        list.add(product);
    }

    public static Integer chooseMenu(Scanner scanner) {
        Integer input;
        System.out.println("Chon danh muc: \n"
                + "1. Them san pham \n"
                + "2. Sua san pham \n"
                + "3. Xoa san pham \n"
                + "4. Hien thi san pham \n"
                + "5. Tim kiem san pham \n"
                + "6. Sap xep san pham \n"
                + "7. Thoat \n");
        input = scanner.nextInt();
        return input;
    }
}
