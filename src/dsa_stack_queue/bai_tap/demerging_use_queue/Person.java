package dsa_stack_queue.bai_tap.demerging_use_queue;

public class Person implements Comparable<Person>{
    private String name;
    private String dayOfBirth;
    private String gender;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String gender) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.dayOfBirth.compareTo(o.dayOfBirth);
    }
}
