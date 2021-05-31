package models;

public class OtherService {
    private String idOtherSvice;
    private String otherService;
    private String price;

    public OtherService() {
    }

    public OtherService(String idOtherSvice, String otherService, String price) {
        this.idOtherSvice = idOtherSvice;
        this.otherService = otherService;
        this.price = price;
    }

    @Override
    public String toString() {
        return idOtherSvice + ", " + otherService + ", " + price;
    }

}
