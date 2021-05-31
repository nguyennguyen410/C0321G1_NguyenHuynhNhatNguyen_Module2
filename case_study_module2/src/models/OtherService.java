package models;

public class OtherService {
    private String idOtherSvice;
    private String otherService;
    private Double price;

    public OtherService() {
    }

    public OtherService(String idOtherSvice, String otherService, Double price) {
        this.idOtherSvice = idOtherSvice;
        this.otherService = otherService;
        this.price = price;
    }

    @Override
    public String toString() {
        return idOtherSvice + ", " + otherService + ", " + price;
    }

}
