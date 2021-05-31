package models;

public class Villa extends Services {
    private String typeVilla;
    private String areaPool;
    private String numFloorOfVilla;

    public Villa(String id, String nameService, String area, String price, String maxPeople, String rentType, String typeVilla, String areaPool, String numFloorOfVilla) {
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumFloorOfVilla() {
        return numFloorOfVilla;
    }

    public void setNumFloorOfVilla(String numFloorOfVilla) {
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
