package io_binary_file_serialization.bai_tap.quan_ly_san_pham_ghi_nhi_phan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);
        Integer input = 0;
        ManagerProducts managerProducts = new ManagerProducts();
        do {
            input = managerProducts.chooseMenu(scanner);

            switch (input) {
                case 1:
                    managerProducts.addProduct(products, scanner);
                    break;
                case 2:
                    managerProducts.showProduct();
                    break;
                case 3:
                    managerProducts.searchProduct(products, scanner);
                    break;
                case 4:
                    System.out.println("SEE YOU AGAIN!");
                    break;
            }

        } while (input != 4);

    }
}
