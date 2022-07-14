package model;

public class Person {
    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Person(Person person) {
        name = person.name;
        phone = person.phone;
        email = person.email;
    }

    private String name;
    private String phone;
    private String email;

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public String toString() {
//        return name + ": phone = " + phone + ", email = " + email;
//    }
}