package models;

public class Villa extends Services {
    private String typeVilla;
    private Double areaPool;
    private int numFloorOfVilla;

    public Villa(String id, String nameService, Double area, int price, int maxPeople, String rentType, String typeVilla, Double areaPool, int numFloorOfVilla) {
        super(id, nameService, area, price, maxPeople, rentType);
        this.typeVilla = typeVilla;
        this.areaPool = areaPool;
        this.numFloorOfVilla = numFloorOfVilla;
    }

    public String getTypeVilla() {
        return typeVilla;
    }

    public void setTypeVilla(String typeVilla) {
        this.typeVilla = typeVilla;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumFloorOfVilla() {
        return numFloorOfVilla;
    }

    public void setNumFloorOfVilla(int numFloorOfVilla) {
        this.numFloorOfVilla = numFloorOfVilla;
    }

    @Override
    public String toString() {
        return super.toString() + "Villa{" +
                "Type Villa'" + typeVilla + '\'' +
                ", Area Pool" + areaPool +
                ", total floor " + numFloorOfVilla +
                '}';
    }

    @Override
    public String showInfor() {
        return getId() + ", " + getNameService() + ", " + getArea() + ", " + getPrice() + ", " + getMaxPeople() +
                ", " + getRentType() + ", " + getTypeVilla() + ", " + getAreaPool() + ", " + getNumFloorOfVilla();
    }
}
