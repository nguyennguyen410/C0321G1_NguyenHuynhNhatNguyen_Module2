package io_binary_file_serialization.bai_tap.quan_ly_san_pham_ghi_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String productFrom;
    private double priceProduct;
    private String aboutProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String productFrom, double priceProduct, String aboutProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.productFrom = productFrom;
        this.priceProduct = priceProduct;
        this.aboutProduct = aboutProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProductFrom() {
        return productFrom;
    }

    public void setProductFrom(String productFrom) {
        this.productFrom = productFrom;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getAboutProduct() {
        return aboutProduct;
    }

    public void setAboutProduct(String aboutProduct) {
        this.aboutProduct = aboutProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", productFrom='" + productFrom + '\'' +
                ", priceProduct=" + priceProduct +
                ", aboutProduct='" + aboutProduct + '\'' +
                '}';
    }
}
