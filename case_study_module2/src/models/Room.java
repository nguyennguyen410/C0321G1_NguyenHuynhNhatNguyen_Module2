package models;

public class Room extends Services implements Comparable<Room> {
    private String freeService;

    public Room(String id, String nameService, String area, String price, String maxPeople, String rentType, String freeService) {
        super(id, nameService, area, price, maxPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Room{" +
                "free services: '" + freeService + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
        return getId() + ", " + getNameService() + ", " + getArea() + ", " + getPrice() + ", " + getMaxPeople() +
                ", " + getRentType() + ", " + getFreeService();
    }

    @Override
    public int compareTo(Room o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
