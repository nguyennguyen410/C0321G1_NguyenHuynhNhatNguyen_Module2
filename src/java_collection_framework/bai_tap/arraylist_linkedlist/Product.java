package java_collection_framework.bai_tap.arraylist_linkedlist;

public class Product implements Comparable<Product>{
    private String idProduct;
    private String nameProduct;
    private Integer price;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}'+'\n';
    }

    @Override
    public int compareTo(Product o) {
        return this.price.compareTo(o.price);
    }
}
