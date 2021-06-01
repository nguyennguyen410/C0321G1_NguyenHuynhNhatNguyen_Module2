package models;

public class Customer implements Comparable<Customer> {
    private String nameCustomer;
    private String birthDay;
    private String sex;
    private String idCard;
    private String mobile;
    private String email;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthDay, String sex, String idCard, String mobile, String email, String typeCustomer) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.sex = sex;
        this.idCard = idCard;
        this.mobile = mobile;
        this.email = email;
        this.typeCustomer = typeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                '}';
    }

    public String showInfor() {
        return nameCustomer +
                ", " + birthDay +
                ", " + sex +
                ", " + idCard +
                ", " + mobile +
                ", " + email +
                ", " + typeCustomer;
    }

    @Override
    public int compareTo(Customer o) {
        return this.nameCustomer.compareTo(o.nameCustomer);
    }
}
