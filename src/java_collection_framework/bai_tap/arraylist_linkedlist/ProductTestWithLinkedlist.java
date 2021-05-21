package java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.*;

public class ProductTestWithLinkedlist {
    public static void main(String[] args) {
        /*String idProduct;
        String nameProduct;
        Integer priceProduct;*/
        Integer input;
        List<Product> list = new LinkedList<Product>();
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
            input = ProductManager.chooseMenu(scanner);

            switch (input) {
                case 1:
                    ProductManager.addProduct(list, scanner);
                    break;

                case 2:
                    ProductManager.editProduct(list, scanner);
                    break;

                case 3:
                    ProductManager.deleteProduct(list, scanner);
                    break;

                case 4:
                    ProductManager.showList(list);
                    break;

                case 5:
                    ProductManager.searchProduct(list, scanner);
                    break;

                case 6:
                    ProductManager.sortProduct(list);
                    break;
            }
        } while (input != 7);

        for (Product product : list) {
            System.out.println(product.toString());
        }
    }


}
