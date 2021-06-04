package models;

public class House extends Services implements Comparable<House> {
    private String typeHouse;
    private String numFloorOfHouse;

    public House(String id, String nameService, String area, String price, String maxPeople, String rentType, String typeHouse, String numFloorOfHouse) {
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

    public String getNumFloorOfHouse() {
        return numFloorOfHouse;
    }

    public void setNumFloorOfHouse(String numFloorOfHouse) {
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
        return getId() + "," + getNameService() + "," + getArea() + "," + getPrice() + "," + getMaxPeople() +
                "," + getRentType() + "," + getTypeHouse() + "," + getNumFloorOfHouse();
    }

    @Override
    public int compareTo(House o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
