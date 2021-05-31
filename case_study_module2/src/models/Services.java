package models;

public abstract class Services {
    private String id;
    private String nameService;
    private String area;
    private String price;
    private String maxPeople;
    private String rentType;

    public Services() {
    }

    public Services(String id, String nameService, String area, String price, String maxPeople, String rentType) {
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
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
