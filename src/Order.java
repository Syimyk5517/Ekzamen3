import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private Long id ;
    private String name;
    private  String fulname;
    private LocalDate age;
    private Gender gender;
    private  String phoneNumber;

    public Order(Long id, String name, String fulname, LocalDate age, Gender gender, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.fulname = fulname;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFulname() {
        return fulname;
    }

    public void setFulname(String fulname) {
        this.fulname = fulname;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(name, order.name) && Objects.equals(fulname, order.fulname) && Objects.equals(age, order.age) && gender == order.gender && Objects.equals(phoneNumber, order.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fulname, age, gender, phoneNumber);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fulname='" + fulname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
