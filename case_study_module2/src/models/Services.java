package models;

public abstract class Services {
    private String id;
    private String nameService;
    private Double area;
    private int price;
    private int maxPeople;
    private String rentType;

    public Services() {
    }

    public Services(String id, String nameService, Double area, int price, int maxPeople, String rentType) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return
                "Id: '" + id + '\'' +
                        "name service: '" + nameService + '\'' +
                        ", area: " + area +
                        ", price: " + price +
                        ", max people: " + maxPeople +
                        ", type of rent: '" + rentType + '\''
                ;
    }

    public abstract String showInfor();

}
