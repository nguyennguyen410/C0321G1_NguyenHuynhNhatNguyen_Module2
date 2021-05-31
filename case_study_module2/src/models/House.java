package models;

public class House extends Services {
    private String typeHouse;
    private int numFloorOfHouse;

    public House(String id, String nameService, Double area, int price, int maxPeople, String rentType, String typeHouse, int numFloorOfHouse) {
        super(id, nameService, area, price, maxPeople, rentType);
        this.typeHouse = typeHouse;
        this.numFloorOfHouse = numFloorOfHouse;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public int getNumFloorOfHouse() {
        return numFloorOfHouse;
    }

    public void setNumFloorOfHouse(int numFloorOfHouse) {
        this.numFloorOfHouse = numFloorOfHouse;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "House{" +
                "Type House: '" + typeHouse + '\'' +
                ", total floor: '" + numFloorOfHouse + '\'' +

                '}';
    }

    @Override
    public String showInfor() {
        return getId() + ", " + getNameService() + ", " + getArea() + ", " + getPrice() + ", " + getMaxPeople() +
                ", " + getRentType() + ", " + getTypeHouse() + ", " + getNumFloorOfHouse();
    }
}
