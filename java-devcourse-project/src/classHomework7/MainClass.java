package classHomework7;

public class MainClass {

    public static void main(String[] args) {
        Employee employee = new Employee("Dima Shevko", "QA", "testemail.com", 123456, 30);
        String employeeName = employee.nameSurname();
        System.out.println(employeeName + " : age : " + employee.age() + ", job position - " + employee.jobPosition() +
                ", email: " + employee.email() + ", phone : " + employee.phoneNumber());
        Car car = new Car();
        car.startCar();
    }


}
