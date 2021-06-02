package models;

public class Employee {
    private String nameEmployee;
    private String age;
    private String adress;

    public Employee() {
    }

    public Employee(String nameEmployee, String age, String adress) {
        this.nameEmployee = nameEmployee;
        this.age = age;
        this.adress = adress;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", age='" + age + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public String showInfor() {
        return nameEmployee +
                ", " + age +
                ", " + adress;

    }
}
