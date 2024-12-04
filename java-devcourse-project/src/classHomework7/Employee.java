package classHomework7;

public class Employee {
    private String nameSurname;
    private String jobPosition;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(String nameSurname, String jobPosition, String email, int phoneNumber, int age) {
        this.nameSurname = nameSurname;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String nameSurname() {
        return nameSurname;
    }

    public Employee nameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
        return this;
    }

    public String jobPosition() {
        return jobPosition;
    }

    public Employee jobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
        return this;
    }

    public String email() {
        return email;
    }

    public Employee email(String email) {
        this.email = email;
        return this;
    }

    public int phoneNumber() {
        return phoneNumber;
    }

    public Employee phoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int age() {
        return age;
    }

    public Employee age(int age) {
        this.age = age;
        return this;
    }
}
